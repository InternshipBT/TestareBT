package Tests;


import Testare.Credentials;
import Testare.steps.ImdbLogInGmailSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ImdbLogInGmailTest {

    @Steps
    ImdbLogInGmailSteps ImdbTestSteps;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Test
    @Ignore
    public void LogInImdbGMail() throws InterruptedException {
        webdriver.manage().window().maximize();
        ImdbTestSteps.is_the_home_page();
        ImdbTestSteps.click_LoginButton();
        ImdbTestSteps.click_GoogleButton();
        ImdbTestSteps.enter_ValidEmail(Credentials.IMDB_EMAIL);
        ImdbTestSteps.click__inainte_MailButton();
        Thread.sleep(5000);
        ImdbTestSteps.enter_ValidPassw(Credentials.IMDB_PASSWORD);
        ImdbTestSteps.click_PassButTon();
       // ImdbTestSteps.Click_LogOutButton();
    }

    @Test
    public void LogIn_On_imdb_Page_Test () throws Exception{
        webdriver.manage().window().maximize();
        ImdbTestSteps.LogIn_On_imdb_Page(Credentials.IMDB_EMAIL, Credentials.IMDB_PASSWORD);
        System.out.println("timp");
    }
}

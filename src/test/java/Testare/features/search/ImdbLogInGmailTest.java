package Testare.features.search;

import Testare.Credentials;
import Testare.steps.serenity.ImdbLogInGmailSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
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
    public void LogInImdbGMail() throws InterruptedException {
        ImdbTestSteps.is_the_home_page();
        ImdbTestSteps.clickLoginButton();
        ImdbTestSteps.clickGoogleButton();
        ImdbTestSteps.ValidEmail(Credentials.IMDB_EMAIL);
        ImdbTestSteps.clickMailButton();
        Thread.sleep(5000);
        ImdbTestSteps.ValidPassw(Credentials.IMDB_PASSWORD);
        ImdbTestSteps.clickPassButTon();
    }

}

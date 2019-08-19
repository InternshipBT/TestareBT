package Tests;

import Testare.Credentials;
import Testare.steps.EmagLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class EmagLogInTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagLogInSteps laurentiu;


    @Test
    public void emagLogIn()
    {
        laurentiu.is_the_home_page();
        laurentiu.loginEmag(Credentials.EMAG_EMAIL,Credentials.EMAG_PASSWORD);
    }



}

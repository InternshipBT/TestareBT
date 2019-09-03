package Testare.Tests.MadisonIslandTests;
import Testare.steps.MadisonSteps.MadisonAddInBasketSteps;
import Testare.steps.MadisonSteps.MadisonLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static Testare.Credentials.MADISON_EMAIL;

@RunWith(SerenityRunner.class)
public class LoginNoPassNF {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    MadisonLoginSteps madisonLoginSteps;

    @Before
    public void openWindow() {
        webdriver.manage().window().maximize();
    }

    @Test
    public void loginMadisonNoPassword() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, "            ");
        madisonLoginSteps.assertsLogInInvalidPass();
    }
}

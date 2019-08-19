package Tests;


import Testare.Credentials;
import Testare.steps.AutomationPracticeSteps;
import Testare.steps.ImdbLogInGmailSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AutomationPracticeTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    AutomationPracticeSteps AutomPrTestSteps;


    @Test
    public void Log_In_On_AutomationPractice() throws Exception {
        webdriver.manage().window().maximize();
        AutomPrTestSteps.Autom_Pr_LogIn(Credentials.AP_EMAIL, Credentials.AP_PASSWORD);
        AutomPrTestSteps.asert_login();

    }
}

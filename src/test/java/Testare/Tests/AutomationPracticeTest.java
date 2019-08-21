package Testare.Tests;


import Testare.Credentials;
import Testare.pages.AutomationPracticePage.AutomationPracticeHomePage;
import Testare.pages.AutomationPracticePage.AutomationPracticeStartPage;
import Testare.steps.AutomationPracticeSteps.AutomationPracticeAddToCartSteps;
import Testare.steps.AutomationPracticeSteps.AutomationPracticeLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AutomationPracticeTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    AutomationPracticeLogInSteps autprLogIn;
    @Steps
    AutomationPracticeAddToCartSteps autprAdd;


    @Before
    public void maximizePage() {
        webdriver.manage().window().maximize();
    }

    @After
    public void closeDriver() {
        webdriver.close();
    }

    @Test
    public void LogInOnAutomationPractice() throws Exception {

        autprLogIn.automPrLogIn(Credentials.AP_EMAIL, Credentials.AP_PASSWORD);
        autprLogIn.asertLogIn();

    }

    @Test
    public void addToCartTest() {
        autprLogIn.automPrLogIn(Credentials.AP_EMAIL, Credentials.AP_PASSWORD);
        autprAdd.autPracticeAddItemsToCart("dress");
        autprAdd.grupOfSteps();

    }


}

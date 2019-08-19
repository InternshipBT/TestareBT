package Testare.features.search;
import Testare.Credentials;
import Testare.steps.serenity.AutoPracticeSteps;
import Testare.steps.serenity.WizzLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;
@RunWith(SerenityRunner.class)


public class AutoPracticeTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AutoPracticeSteps anna;


    @Test
    public void test() throws InterruptedException {
        anna.is_the_home_page();
        anna.logInAutoPractice(Credentials.AUTO_PRACTICE_EMAIL, Credentials.AUTO_PRACTICE_PASSWORD);
        anna.assertLogIn();
    }
}

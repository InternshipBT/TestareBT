package Testare.features.search;
import Testare.Credentials;
import Testare.steps.serenity.WizzLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class WizzLoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public WizzLoginSteps anna;


    @Test
    public void test() {
        anna.is_the_home_page();
        anna.logInWizz(Credentials.WIZZ_EMAIL, Credentials.WIZZ_PASSWORD);
    }
}


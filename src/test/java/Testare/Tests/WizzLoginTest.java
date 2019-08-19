package Testare.Tests;
import Testare.Credentials;
import Testare.steps.WizzLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;


@RunWith(SerenityRunner.class)
public class WizzLoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public WizzLoginSteps anna;


    @Test
    public void test() throws InterruptedException {
        anna.is_the_home_page();
        anna.logInWizz(Credentials.WIZZ_EMAIL, Credentials.WIZZ_PASSWORD);
        sleep(10000);
        //anna.logOutWizz();
    }
}


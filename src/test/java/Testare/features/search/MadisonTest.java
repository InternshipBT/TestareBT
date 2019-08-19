package Testare.features.search;

import Testare.Credentials;
import Testare.pages.MadisonPages;
import Testare.steps.serenity.ImdbLogInGmailSteps;
import Testare.steps.serenity.MadisonSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static Testare.Credentials.MADISON_EMAIL;
import static Testare.Credentials.MADISON_PASSWORD;

@RunWith(SerenityRunner.class)
public class MadisonTest {
    @Steps
    MadisonSteps madisonSteps;

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Test
    public void LoginMadison(){
        madisonSteps.is_the_home_page();
        madisonSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
    }
}

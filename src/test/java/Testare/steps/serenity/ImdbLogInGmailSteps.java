package Testare.steps.serenity;

import Testare.pages.DictionaryPage;
import Testare.pages.ImdbLogInGmailPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class ImdbLogInGmailSteps {

    ImdbLogInGmailPage imdbPage;


    @Step
    public void is_the_home_page() {
        imdbPage.open();
    }


    @Step
    public void clickLoginButton() {
        imdbPage.LogInButton();
    }

    @Step
    public void clickGoogleButton() {
        imdbPage.GoogleButton();
    }

    @Step
    public void ValidEmail(String mail) {
        imdbPage.enter_email(mail);
    }

    @Step
    public void clickMailButton() {
        imdbPage.ClickMailButton();
    }

    @Step
    public void ValidPassw() {
        imdbPage.enter_passw();
    }

    @Step
    public void clickPassButTon() {
        imdbPage.ClickPasswButton();

    }

}

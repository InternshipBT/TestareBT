package Testare.steps.serenity;

import Testare.pages.WizzLogInPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class WizzLoginSteps {
    WizzLogInPage wizzPage;

    @Step
    public void is_the_home_page() {
        wizzPage.open();

    }

    @Step
    public void logInWizz(String email, String password) throws InterruptedException {
        wizzPage.clicklogin();
        wizzPage.enterEmail(email);
        wizzPage.enterPassword(password);
        wizzPage.clickSignIn();
        wizzPage.clickLanguage();

    }

    @Step
    public void logOutWizz() throws InterruptedException {
        wizzPage.clickaccount();
        Thread.sleep(4000);
        wizzPage.clickLogOut();
    }



}


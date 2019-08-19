package Testare.steps.serenity;

import Testare.pages.MadisonPages;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class MadisonSteps {
    MadisonPages loginPage;

    @Step
    public void is_the_home_page() {
        loginPage.open();
    }

    @Step
    public void loginMadison(String gmail_email,String gmail_password) {
        loginPage.clickMyAccount();
        loginPage.clickLogIn();
        loginPage.enterMail(gmail_email);
        loginPage.enterPass(gmail_password);
        loginPage.clickSubmit();
    }
}
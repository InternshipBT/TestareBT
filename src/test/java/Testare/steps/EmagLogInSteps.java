package Testare.steps;

import Testare.pages.EmagLogInPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagLogInSteps {

    EmagLogInPage emagLoginPage;


    @Step
    public void is_the_home_page() {
        emagLoginPage.open();
    }

    @Step
    public void loginEmag(String email,String password)
    {
        emagLoginPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        emagLoginPage.enterPass(password);
        emagLoginPage.clickContinue();
    }



}

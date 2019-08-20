package Testare.steps.emagSteps;


import Testare.pages.emagPages.EmagLogInPage;
import Testare.pages.emagPages.EmagStartPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagLogOutSteps {
    EmagLogInPage emagLoginPage;
    EmagStartPage emagStartPage;


    @Step
    public void isTheHomePage() {
        emagLoginPage.open();
    }

    @Step
    public void logInEmag(String email, String password)
    {
        emagStartPage.clickBackToSiteButton();
        emagStartPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        emagLoginPage.enterPass(password);
        emagLoginPage.clickContinue();
        emagStartPage.hoverMyAccount();
    }

}

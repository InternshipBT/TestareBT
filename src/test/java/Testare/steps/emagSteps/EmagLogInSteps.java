package Testare.steps.emagSteps;

import Testare.pages.emagPages.EmagLogInPage;
import Testare.pages.emagPages.EmagStartPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagLogInSteps {

    EmagLogInPage emagLoginPage;
    EmagStartPage emagStartPage;


    @Step
    public void isTheHomePage() {
        emagStartPage.open();
    }

    @Step
    public void loginEmag(String email,String password) throws InterruptedException {
        emagStartPage.clickBackToSiteButton();
        Thread.sleep(1000);
        emagStartPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        emagLoginPage.enterPass(password);
        emagLoginPage.clickContinue();
    }



}

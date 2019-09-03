package Testare.steps.emagSteps;

import Testare.pages.emagPages.EmagHomePage;
import Testare.pages.emagPages.EmagLogInPage;
import Testare.pages.emagPages.EmagStartPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagLogInSteps {

    EmagLogInPage emagLoginPage;
    EmagStartPage emagStartPage;
    EmagHomePage emagHomePage;


    @Step
    public void isTheHomePage() {
        emagStartPage.open();
    }

    @Step
    public void loginEmag(String email,String password) throws InterruptedException {
//        emagStartPage.clickBackToSiteButton();
//       Thread.sleep(1000);
        emagStartPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        emagLoginPage.enterPass(password);
        emagLoginPage.clickContinue();
    }

    public void assertLogInPositive(String username)
    {
        emagStartPage.clickMyAccount();
        Assert.assertEquals("LogIn was successfull", username,emagHomePage.getLabel());
    }

    public void assertLogInEmailNegative(String email)
    {
        emagStartPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        Assert.assertNotNull(emagLoginPage.getEmailError(),emagLoginPage.getEmailError());
    }

    public void assertLogInPasswordNegative(String email,String password)
    {
        emagStartPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        emagLoginPage.enterPass(password);
        emagLoginPage.clickContinue();
        Assert.assertNotNull( emagLoginPage.getPasswordError(),emagLoginPage.getPasswordError());
    }

}

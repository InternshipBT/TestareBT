package Testare.steps.MadisonSteps;

import Testare.pages.MadisonSitePages.MadisonHomePage;
import Testare.pages.MadisonSitePages.MadisonLoginPage;
import Testare.pages.MadisonSitePages.MadisonStartPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class MadisonLoginSteps {
    MadisonHomePage homePage;
    MadisonLoginPage loginPage;
    MadisonStartPage startPage;


    @Step
    public void is_the_home_page() {

        startPage.open();

    }

    @Step
    public void loginMadison(String gmail_email,String gmail_password) {

        startPage.clickMyAccount();
        startPage.clickLogIn();
        loginPage.enterMail(gmail_email);
        loginPage.enterPass(gmail_password);
        loginPage.clickSubmit();
    }

    @Step
    public void assertsLogIn(){
        String actual = homePage.assertLogin();
        String expected = "WELCOME, TEODORA MIHUC!";

        Assert.assertEquals("This is not the log in page.", actual, expected);
    }

}
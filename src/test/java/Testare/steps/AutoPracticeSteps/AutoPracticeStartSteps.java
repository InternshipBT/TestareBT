package Testare.steps.AutoPracticeSteps;

import Testare.pages.AutoPracticePage.AutoPracticeHomePage;
import Testare.pages.AutoPracticePage.AutoPracticeLogInPage;
import Testare.pages.AutoPracticePage.AutoPracticeStartPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class AutoPracticeStartSteps {

    AutoPracticeStartPage autoStartPage;
    AutoPracticeHomePage autoHomePage;
    AutoPracticeLogInPage autoLogInPage;

    @Step
    public void is_the_home_page() {
        autoStartPage.open();

    }

    @Step
    public void logInAutoPractice(String email, String password) throws InterruptedException {

        autoLogInPage.enterEmail(email);
        autoLogInPage.enterPassword(password);
        autoLogInPage.clicklogin();
    }

    @Step
    public void assertLogIn() {
        String actual = autoHomePage.accountMessage();
        String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals("User was not logged in", actual, expected);
    }

    @Step
    public void searchProducts(String product) {
        autoHomePage.searchProduct(product);
        autoHomePage.pressSearchButton();
        autoHomePage.firstElement();
    }
}

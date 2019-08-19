package Testare.steps.serenity;
import Testare.pages.AutoPracticePage;
import Testare.pages.WizzLogInPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class AutoPracticeSteps {

    AutoPracticePage autoPage;

    @Step
    public void is_the_home_page() {
        autoPage.open();

    }

    @Step
    public void logInAutoPractice(String email, String password) throws InterruptedException {

        autoPage.enterEmail(email);
        autoPage.enterPassword(password);
        autoPage.clicklogin();
    }

    @Step
    public void assertLogIn(){
        String actual = autoPage.accountMessage();
        String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals("User was not logged in", actual, expected);
    }


}

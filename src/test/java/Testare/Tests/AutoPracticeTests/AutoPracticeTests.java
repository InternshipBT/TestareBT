package Testare.Tests.AutoPracticeTests;

import Testare.Credentials;
import Testare.steps.AutoPracticeSteps.AutoPracticeAddtoCartSteps;
import Testare.steps.AutoPracticeSteps.AutoPracticeStartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import net.thucydides.junit.annotations.Concurrent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

@RunWith(SerenityRunner.class)
@Concurrent
public class AutoPracticeTests {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AutoPracticeStartSteps anna;

    @Steps
    AutoPracticeAddtoCartSteps addToCardSteps;


    @Before
    public void maximizePage() {
        webdriver.manage().window().maximize();
    }

    @After
    public void closeDriver() {
        webdriver.close();
    }

    @Test
    public void test() throws InterruptedException {
        anna.is_the_home_page();
        anna.logInAutoPractice(Credentials.AUTO_PRACTICE_EMAIL, Credentials.AUTO_PRACTICE_PASSWORD);
        anna.assertLogIn();
        anna.searchProducts(Credentials.AUTO_PRACTICE_PRODUCT);

    }

    @Test
    public void testCart() throws InterruptedException {
        anna.is_the_home_page();
        anna.logInAutoPractice(Credentials.AUTO_PRACTICE_EMAIL, Credentials.AUTO_PRACTICE_PASSWORD);
        anna.searchProducts(Credentials.AUTO_PRACTICE_PRODUCT);
        addToCardSteps.selectFirstItem();
        addToCardSteps.addToCartItems();
        addToCardSteps.openCart();
        addToCardSteps.groupOfSteps();
    }
}

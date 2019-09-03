package Testare.Tests.MadisonIslandTests;

import Testare.steps.MadisonSteps.MadisonAddInBasketSteps;
import Testare.steps.MadisonSteps.MadisonLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static Testare.Credentials.MADISON_EMAIL;
import static Testare.Credentials.MADISON_PASSWORD;

@RunWith(SerenityRunner.class)
@Concurrent
public class MadisonTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    MadisonLoginSteps madisonLoginSteps;
    @Steps
    MadisonAddInBasketSteps madisonAddInBasketSteps;

    @Before
    public void openWindow() {
        webdriver.manage().window().maximize();
    }

    @Test
    public void loginMadison() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonLoginSteps.assertsLogIn();
    }

    @Test
    public void loginMadisonInvalidCredentials() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, "astaeparola");
        madisonLoginSteps.assertsLogInInvalidUser();
    }

    @Test
    public void loginMadisonNoPassword() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, "            ");
        madisonLoginSteps.assertsLogInInvalidPass();
    }


    @Test
    public void addProductInCartAndAssert() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonAddInBasketSteps.madisonSearchAndClick("pants");
        madisonAddInBasketSteps.addToCartAndAssert();
    }

    @Test
    public void deleteItemFromCart() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonAddInBasketSteps.madisonSearchAndClick("pants");
        madisonAddInBasketSteps.addToCart();
        madisonAddInBasketSteps.assertDeleteInCart();
    }


    @Test
    public void assertOnSearch() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonAddInBasketSteps.searchProduct("glasses");
        madisonAddInBasketSteps.searchAssert();
    }

    @Test
    public void assertOnSearchNegativeFlow() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonAddInBasketSteps.searchProduct("cloud");
        madisonAddInBasketSteps.assertProductNotFound();
        madisonAddInBasketSteps.searchProduct(")");
        madisonAddInBasketSteps.assertProductNotFound();
    }

}

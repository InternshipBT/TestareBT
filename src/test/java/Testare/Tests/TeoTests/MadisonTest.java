package Testare.Tests.TeoTests;

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
    public void LoginMadison() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonLoginSteps.assertsLogIn();
    }

    @Test
    public void AddProductInCart() {
        madisonLoginSteps.openPageMadison();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonAddInBasketSteps.madisonSearch("pants");
        madisonAddInBasketSteps.addToCartAndAssert();
    }

    @Test
    public void getProductsNameSortedList()
    {
        madisonLoginSteps.openPageMadison();
        madisonAddInBasketSteps.madisonSearch("shirt");
        madisonAddInBasketSteps.sortProductsNameList();
    }

    @Test
    public void getSortedProductsNameList()
    {
        madisonLoginSteps.openPageMadison();
        madisonAddInBasketSteps.madisonSearch("shirt");
        madisonAddInBasketSteps.getSortedProductsNameList();
    }
}

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
public class SortAndAssertProductsName {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    MadisonLoginSteps madisonLoginSteps;
    @Steps
    MadisonAddInBasketSteps madisonAddInBasketSteps;

    @Test
    public void getProductsNameSortedList()
    {
        madisonLoginSteps.openPageMadison();
        madisonAddInBasketSteps.searchProduct("shirt");
        madisonAddInBasketSteps.sortProductsNameList();
    }

    @Test
    public void getSortedProductsNameList()
    {
        madisonLoginSteps.openPageMadison();
        madisonAddInBasketSteps.searchProduct("shirt");
        madisonAddInBasketSteps.getSortedProductsNameList();
    }

    @Test
    public void assertSortedProductsNameList()
    {
        madisonLoginSteps.openPageMadison();
        madisonAddInBasketSteps.searchProduct("shirt");
        madisonAddInBasketSteps.assertSortedProductsName();
    }
}

package Testare.steps.MadisonSteps;

import Testare.pages.MadisonSitePages.*;
import com.headius.invokebinder.transform.Cast;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MadisonAddInBasketSteps {

    MadisonHomePage madisonHomePage;
    ResultsPage resultsPage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;
    CartMaddison cartMaddison;

    @Step
    public void madisonSearchAndClick(String textToIntroduce) {
        madisonHomePage.enterTextInSearchBar(textToIntroduce);
        madisonHomePage.searchElementIntroduced();
        resultsPage.clickOnProduct();
    }

    @Step
    public void searchProduct(String titleProduct) {
        madisonHomePage.enterTextInSearchBar(titleProduct);
        madisonHomePage.searchElementIntroduced();
    }


    @Step
    public WebElementFacade getFirstTitle() {
        return resultsPage.getAllItems().get(0);
    }

    @Step
    public void getTitleFromItem(WebElementFacade item) {
        System.out.println(item + "drfg");
        System.out.println(item.getText());
        //String title = item.findElement(By.className("product-name")).toString();
        String title = item.getText();
        Serenity.getCurrentSession().put("titleOfTheItem", title);
    }

    @Step
    public void assertProductTitle() {
        String actual = shoppingCartPage.getTitleItem().getText().toLowerCase();
        String expected = (String) Serenity.getCurrentSession().get("titleOfTheItem");

        System.out.println(actual);
        System.out.println(expected);

        Assert.assertEquals("This is not the log in page.", actual, expected.toLowerCase());
    }

    @Step
    public void assertDescriptionProduct(String expectedResult) {
        String actual = shoppingCartPage.getDescriptionItem().getText();

        System.out.println(actual + expectedResult);

        Assert.assertEquals("Doesn't match :(", expectedResult, actual);
    }

    @Step
    public void assertPriceProduct(String expectedPrice) {
        String actual = shoppingCartPage.getPriceItem().getText();

        System.out.println(actual + expectedPrice);

        Assert.assertTrue("Doeesn't contain..", actual.contains(expectedPrice));
    }

    @Step
    public void assertProductTitleWithSearch(String searchedElement) {
        String productTitle = resultsPage.getAllItems().get(0).getText().toLowerCase();
        System.out.println(productTitle);
        Assert.assertTrue("The search is not valid.", productTitle.contains(searchedElement));
    }

    @Step
    public void selectPriceFromDropdown() {
        resultsPage.selectPrice();
    }

    @Step
    public void assertProductNotFound() {
        String errMessage = resultsPage.getErrMesage();
        String expected = "Your search returns no results.";
        System.out.println(errMessage);
        Assert.assertEquals("Message not displayed", errMessage, expected);
    }

    @Step
    public void assertTitleProdInCart(String titleProd) {

        String titleProdChart = cartMaddison.getTitleFromCart().toLowerCase();
        System.out.println(titleProd);
        System.out.println(titleProdChart);
        Assert.assertTrue("Doesn't coincide.", titleProdChart.contains(titleProd));
    }

    @Step
    public void assertDeleteInCart() {
        String messageFromCart = cartMaddison.messgInCart().toLowerCase();
        String expectedMessage = "SHOPPING CART IS EMPTY";
        Assert.assertEquals("Message not shown.", expectedMessage.toLowerCase(), messageFromCart);
    }

    @Step
    public void sortAscendingPriceList() {
        List<String> ascendingUnsortedList = resultsPage.getAllPrices();
        Collections.sort(ascendingUnsortedList);
        Serenity.getCurrentSession().put("ascPriceList", ascendingUnsortedList);
    }

    @Step
    public void assertPriceAscending() {
        List<String> expectedAsc = (List<String>) Serenity.getCurrentSession().get("ascPriceList");
        List<String> actualAsc = resultsPage.getAllPrices();
        System.out.println("expected .....AA");
        Assert.assertEquals("The lists are not the same", expectedAsc, actualAsc);
    }


    @StepGroup
    public void addToCartAndAssert() {

        productPage.productColor();
        productPage.productSize();
        String title = productPage.getProductTitle().toLowerCase();
        productPage.addButton();
        assertTitleProdInCart(title);
    }

    @StepGroup
    public void addToCart() {

        productPage.productColor();
        productPage.productSize();
        productPage.addButton();
        cartMaddison.clickDeleteProd();

    }

    @StepGroup
    public void searchAssert() {
        getFirstTitle();
        assertProductTitleWithSearch("glasses");
    }

}

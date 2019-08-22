package Testare.steps.MadisonSteps;

import Testare.pages.MadisonSitePages.*;
import com.headius.invokebinder.transform.Cast;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MadisonAddInBasketSteps {

    MadisonHomePage madisonHomePage;
    ResultsPage resultsPage;
    ProductPage productPage;
    ShoppingCartPage shoppingCartPage;

    @Step
    public void madisonSearch(String textToIntroduce) {
        madisonHomePage.enterTextInSearchBar(textToIntroduce);
        madisonHomePage.searchElementIntroduced();
        resultsPage.clickOnProduct();
        //productPage.productColor();
        //productPage.productSize();
        //productPage.addButton();
    }


    @Step
    public WebElementFacade getFirstTitle() {
        return resultsPage.getAllItems().get(0);
    }

    @Step
    public void getTitleFromItem(WebElementFacade item) {
        System.out.println(item+ "drfg");
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
    public void assertDescriptionProduct(String expectedResult){
        String actual = shoppingCartPage.getDescriptionItem().getText();

        System.out.println(actual + expectedResult);

        Assert.assertEquals("Doesn't match :(", expectedResult, actual);
    }

    @Step
    public void assertPriceProduct(String expectedPrice){
        String actual = shoppingCartPage.getPriceItem().getText();

        System.out.println(actual + expectedPrice);

        Assert.assertTrue("Doeesn't contain..", actual.contains(expectedPrice));
    }

    @StepGroup
    public void addToCartAndAssert() {
        getFirstTitle();
        getTitleFromItem(shoppingCartPage.getTitleItem());
        assertProductTitle();
    }

}

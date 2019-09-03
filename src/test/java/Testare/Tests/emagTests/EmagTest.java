package Testare.Tests.emagTests;

import Testare.Credentials;
import Testare.steps.emagSteps.EmagBasketSteps;
import Testare.steps.emagSteps.EmagLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import net.thucydides.junit.annotations.Concurrent;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@Concurrent
public class EmagTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagBasketSteps laurentiu;

    @Steps
    public EmagLogInSteps laurentiu1;

    private String[] products = { "Penar", "Stilou","Ghiozdan"};
    private String product="blablabla";
    private String productError="**********";
    int price=50;
    @Before
    public void maximizeWindow() {
        webdriver.manage().window().maximize();
    }


    @Test
    public void emagLogIn() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu1.loginEmag(Credentials.EMAG_EMAIL,Credentials.EMAG_PASSWORD);
    }

    @Test
    public void emagLogInPositiveTest() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu1.loginEmag(Credentials.EMAG_EMAIL,Credentials.EMAG_PASSWORD);
        laurentiu1.assertLogInPositive("Test");
    }

    @Test
    public void emagLogInEmailNegativeTest()
    {
        laurentiu.isTheHomePage();
        laurentiu1.assertLogInEmailNegative("email");
    }

    @Test
    public void emagLogInPasswordNegativeTest()
    {
        laurentiu.isTheHomePage();
        laurentiu1.assertLogInPasswordNegative(Credentials.EMAG_EMAIL,"parola");
    }

    @Test
    public void addProductsInYourBasket() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.addInBasket("fifa");
    }

    @Test
    public void assertValidateLabel() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.addInBasket("fifa");
        laurentiu.assertMyBasket("Cosul tau");
    }

    @Test
    public void assertValidateBasket() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.addInBasket("fifa");
        laurentiu.assertListSize();
    }

    @Test
    public void assertValidateThirdElToBasket() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.addThirdItemToBasket("fifa");
        laurentiu.assertListSize();
    }

    @Test
    public void assertValidateEmptyBasket() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.assertRemoveElementToBasket("fifa");
    }


    @Test
    public void assertPriceList() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.priceList(products);
        laurentiu.assertPriceList(products,price);
    }

    @Test
    public void assertNameOfProducts() {
        laurentiu.isTheHomePage();
        laurentiu.searchElemenetAndAssertProductName(products);
    }

    @Test
    public void assertNameOfProductsNegative()
    {
        laurentiu.isTheHomePage();
        laurentiu.searchElemenetAndAssertProductNameNegative(product);
    }

    @Test
    public void assertNameOfProductsSpecialCharNegative()
    {
        laurentiu.isTheHomePage();
        laurentiu.searchElemenetAndAssertProductNameNegative2(productError);
    }

}

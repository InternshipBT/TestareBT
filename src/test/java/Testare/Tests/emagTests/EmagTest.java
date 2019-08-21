package Testare.Tests.emagTests;

import Testare.Credentials;
import Testare.steps.emagSteps.EmagBasketSteps;
import Testare.steps.emagSteps.EmagLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class EmagTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagBasketSteps laurentiu;
    public EmagLogInSteps laurentiu1;

    private String[] products = { "Penar", "Stilou","Ghiozdan"};

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
    public void assertPriceList() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.priceList(products);
        laurentiu.assertPriceList(products);
    }

    @Test
    public void assertNameOfProducts() {
        laurentiu.isTheHomePage();
        laurentiu.searchElemenetAndAssertProductName(products);
    }

}

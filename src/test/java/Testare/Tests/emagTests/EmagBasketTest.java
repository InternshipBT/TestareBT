package Testare.Tests.emagTests;

import Testare.steps.emagSteps.EmagBasketSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class EmagBasketTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagBasketSteps laurentiu;

    private String[] products={"Ghiozdan","Penar","Stilou"};

    @Before
    public void maximizeWindow()
    {
        webdriver.manage().window().maximize();
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
    public void priceList() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.priceList(products);
    }

    @Test
    public void assertPriceList() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.priceList(products);
        laurentiu.assertPriceList(products);
    }


}

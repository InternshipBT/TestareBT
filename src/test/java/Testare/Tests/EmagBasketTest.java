package Testare.Tests;

import Testare.Credentials;
import Testare.pages.EmagBasketPage;
import Testare.steps.EmagBasketSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(SerenityRunner.class)
public class EmagBasketTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagBasketSteps laurentiu;

    @Test
    public void addProductsInYourBasket() throws InterruptedException {
        laurentiu.is_the_home_page();
        webdriver.manage().window().maximize();
        laurentiu.addInBasket("fifa");
    }

    @Test
    public void assertValidateLabel() throws InterruptedException {
        laurentiu.is_the_home_page();
        webdriver.manage().window().maximize();
        laurentiu.addInBasket("fifa");
        laurentiu.assertMyBasket("Cosul tau");
    }

    @Test
    public void assertValidateBasket() throws InterruptedException {
        laurentiu.is_the_home_page();
        webdriver.manage().window().maximize();
        laurentiu.addInBasket("fifa");
        laurentiu.assertListSize();
    }

}

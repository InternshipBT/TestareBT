package Testare.Tests.emagTests;

import Testare.Credentials;
import Testare.steps.emagSteps.EmagBasketSteps;
import Testare.steps.emagSteps.EmagLogInSteps;
import jnr.ffi.annotations.In;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent
@UseTestDataFrom(value = "src/test/resources/EmagTestData.csv", separator = ';')
public class EmagSearchItemDataDriven {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagBasketSteps laurentiu;
    public EmagLogInSteps laurentiu1;

    public String name, description, price;

    @Qualifier
    public String getQualifier() {
        return name;
    }


    @Before
    public void maximizeWindow() {
        webdriver.manage().window().maximize();
    }

    @Test
    @Ignore
    public void searchItems() {
//        System.out.println("Name: "+ getName());
//        System.out.println("Description: "+getDescription());
//        System.out.println("Price: "+getPrice());
        laurentiu.isTheHomePage();
        laurentiu.resolveCookies();
        laurentiu.searchFlow(name);
    }


    @Test
    public void assertPrice() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.assertProductPrice(name, Integer.parseInt(price));
    }

    @Test
    public void assertDescription() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.assertDescription(name, description);
    }


}

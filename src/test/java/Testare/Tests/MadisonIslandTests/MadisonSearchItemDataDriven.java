package Testare.Tests.MadisonIslandTests;

import Testare.steps.MadisonSteps.MadisonAddInBasketSteps;
import Testare.steps.MadisonSteps.MadisonLoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@Concurrent
@UseTestDataFrom(value = "src/test/resources/MadisonTestData.csv", separator = ';')
public class MadisonSearchItemDataDriven {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    MadisonLoginSteps madisonLoginSteps;
    @Steps
    MadisonAddInBasketSteps madisonAddInBasketSteps;

    public String name, description, price;

    @Qualifier
    public String getQualifier() {
        return name;
    }

    @Test
    public void searchTestWithCSV() {

        madisonLoginSteps.openPageMadison();
        madisonAddInBasketSteps.madisonSearchAndClick(name);
        madisonAddInBasketSteps.assertDescriptionProduct(description);
        madisonAddInBasketSteps.assertPriceProduct(price);
    }
}

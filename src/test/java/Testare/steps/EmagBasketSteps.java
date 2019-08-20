package Testare.steps;

import Testare.pages.EmagBasketPage;
import Testare.pages.EmagLogInPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagBasketSteps {
    EmagBasketPage emagBasketPage;


    @Step
    public void is_the_home_page() {
        emagBasketPage.open();
    }

    @Step
    public void addInBasket(String element) throws InterruptedException {
        emagBasketPage.clickBackToSiteButton();
        emagBasketPage.clickOnAcceptCookiesButton();
        emagBasketPage.clickOnSearchBox();
        emagBasketPage.searchElement(element);
        emagBasketPage.clickSearchButton();
        emagBasketPage.clickAddInBasketThirdElButton();
        emagBasketPage.clickClosePopUpButton();
        Thread.sleep(5000);
        emagBasketPage.clickAddInBasketFourthElButton();
        emagBasketPage.clickOnViewYourBasketButton();
    }

    @Step
    public void assertMyBasket(String element) {
        Assert.assertEquals("Expected result is not equal with actual result", emagBasketPage.getLabel(), element);
    }

    @Step
    public void assertListSize() {
        Assert.assertTrue("Your basket is empty", emagBasketPage.getListSize() > 0);
    }


    @Step
    public void priceList(String[] elements) throws InterruptedException {
        emagBasketPage.clickBackToSiteButton();
        emagBasketPage.clickOnAcceptCookiesButton();
        emagBasketPage.clickOnSearchBox();
        emagBasketPage.searchElement(elements[0]);
        emagBasketPage.clickSearchButton();
        emagBasketPage.addInPriceList(elements[0]);
        Thread.sleep(1000);
        emagBasketPage.clickOnSearchBox();
        emagBasketPage.searchElement(elements[1]);
        emagBasketPage.clickSearchButton();
        emagBasketPage.addInPriceList(elements[1]);
        Thread.sleep(1000);
        emagBasketPage.searchElement(elements[2]);
        emagBasketPage.clickSearchButton();
        emagBasketPage.addInPriceList(elements[2]);
        Thread.sleep(1000);

        System.out.println(Arrays.asList(Serenity.getCurrentSession()));
    }

    @Step
    public void assertPriceList(String[] elements) {
        for (int i = 0; i < Serenity.getCurrentSession().size(); i++) {
            Assert.assertTrue("Price for element " + i + " is under then 50",
                    (Integer) Serenity.getCurrentSession().get(elements[i]) > 50);
            //Assert.assertEquals("Price for element "+i+ " is different then 282", Serenity.getCurrentSession().get(elements[i]),282);
        }
    }

}

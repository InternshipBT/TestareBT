package Testare.steps.serenity;

import Testare.pages.EmagBasketPage;
import Testare.pages.EmagLogInPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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
    public void assertMyBasket(String element)
    {
        Assert.assertEquals("Expected result is not equal with actual result",emagBasketPage.getLabel(),element);
    }

    @Step
    public void assertListSize()
    {
        Assert.assertTrue("Your basket is empty",emagBasketPage.getListSize()>0);
    }


//    @Step
//    public void assertListPrice(String element)
//    {
//        for(int i=0;i< Serenity.getCurrentSession().size();i++)
//        {
//            Assert.assertTrue("Price for element "+i+" is over then 500",Serenity.getCurrentSession().get(element).equals(500));
//        }
//    }
}

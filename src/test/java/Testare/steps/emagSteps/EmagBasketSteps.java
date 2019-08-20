package Testare.steps.emagSteps;

import Testare.pages.emagPages.EmagBasketPage;
import Testare.pages.emagPages.EmagProductsPage;
import Testare.pages.emagPages.EmagStartPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagBasketSteps {
    EmagBasketPage emagBasketPage;
    EmagStartPage emagStartPage;
    EmagProductsPage emagProductsPage;

    @Step
    public void isTheHomePage() {
        emagStartPage.open();
    }


    @Step
    public void searchFlow(String product) {
        emagStartPage.clickOnSearchBox();
        emagStartPage.searchElement(product);
        emagStartPage.clickSearchButton();
    }

    @Step
    public void resolveCookies() {
        emagStartPage.clickBackToSiteButton();
        emagStartPage.clickOnAcceptCookiesButton();
    }

    @Step
    public void addInBasket(String element) throws InterruptedException {
        resolveCookies();
        searchFlow(element);
        emagProductsPage.clickAddInBasketThirdElButton();
        emagProductsPage.clickClosePopUpButton();
        Thread.sleep(1000);
        emagProductsPage.clickAddInBasketFourthElButton();
        emagProductsPage.clickOnViewYourBasketButton();
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
        resolveCookies();
        for (String el : elements) {
            searchFlow(el);
            emagProductsPage.addInPriceList(el);
            Thread.sleep(1000);
        }
        System.out.println(Arrays.asList(Serenity.getCurrentSession()));
//
//        Arrays.stream(elements)
//                .forEach(s -> {searchFlow(s);
//                emagProductsPage.addInPriceList(s);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                });
    }

    @Step
    public void assertPriceList(String[] elements) {
        for (int i = 0; i < Serenity.getCurrentSession().size(); i++) {
            Assert.assertTrue("Price for element " + i + " is under then 50",
                    (Integer) Serenity.getCurrentSession().get(elements[i]) > 50);
            //Assert.assertEquals("Price for element "+i+ " is different then 282", Serenity.getCurrentSession().get(elements[i]),282);
        }
    }

    @Step
    public void searchElemenetAndAssertProductName(String[] elements)
    {
        resolveCookies();
        for(String el:elements)
        {
            searchFlow(el);
            ArrayList<String> products=emagProductsPage.addListOfProducts();
            for(String s:products)
            {
                Assert.assertTrue("The product: "+ s+ " doesn't contains ghiozdan in name",s.contains(el));
            }
        }
    }

}

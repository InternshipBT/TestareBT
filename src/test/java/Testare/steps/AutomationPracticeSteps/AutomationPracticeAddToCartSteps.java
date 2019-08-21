package Testare.steps.AutomationPracticeSteps;

import Testare.pages.AutomationPracticePage.*;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AutomationPracticeAddToCartSteps {

    AutomationPracticeStartPage autprStart;
    AutomationPracticeLogInPage autprLogIn;
    AutomationPracticeHomePage autprHome;
    AutomationPracticeAddToChartPage autprAddPage;
    ShoppingCartPage cartPage;

    @Step
    public void autPracticeAddItemsToCart(String item) {

        autprHome.searchItem(item);
        autprAddPage.addItemToCart();
    }

    @Step
    public WebElementFacade getFirstItem() {
        return autprAddPage.getAllItems().get(0);
    }

    @Step
    public void getTitleFromItem(WebElementFacade itemTitle) {
        String title = itemTitle.findElement(By.xpath("//*[@id=\"product_5_19_0_203898\"]/td[2]/p/a")).getText();
        Serenity.getCurrentSession().put("titleItem", title);
    }

    @Step
    public void assertSearch() {
        String actual = cartPage.itemTitle().getText().toLowerCase();
        String expected = (String) Serenity.getCurrentSession().get("titleItem");
        Assert.assertEquals("Not the same", actual, expected.toLowerCase());
    }

    @StepGroup
    public void grupOfSteps() {
        getTitleFromItem(cartPage.itemTitle());
        //getFirstItem();
        assertSearch();
    }
}

package Testare.steps.AutoPracticeSteps;

import Testare.pages.AutoPracticePage.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;


public class AutoPracticeAddtoCartSteps {
    AutoPracticeStartPage autoStartPage;
    AutoPracticeHomePage autoHomePage;
    AutoPracticeLogInPage autoLogInPage;
    AutoPracticeAddtoCartPage autoAddPage;
    AutoPracticeShoppingPage autoShoppingPage;

    @Step
    public void selectFirstItem(){
        autoAddPage.selectFirstItem();
    }

    @Step
    public void addToCartItems() throws InterruptedException {
        autoAddPage.getAllItmes();
        Thread.sleep(5000);

        autoAddPage.addToCart();
        Thread.sleep(5000);
    }

    @Step
    public void openCart(){
        autoAddPage.openCart();
    }

    @Step
    public WebElementFacade getFirstItem() {
        return autoAddPage.getAllItmes().get(0);
    }

    @Step
    public void getTitleFromItem(WebElementFacade item) {
        String title = item.findElement(By.xpath("//*[@id=\"product_7_34_0_203911\"]/td[2]/p/a")).getText();
        Serenity.getCurrentSession().put("returnTitle",title);
    }

    @Step
    public void assertSearch(){
        String actual = autoShoppingPage.returnTitle().getText().toLowerCase();
        String expected = (String) Serenity.getCurrentSession().get("returnTitle");
        Assert.assertEquals("The item was not added", actual, expected.toLowerCase());
    }

    @StepGroup
    public void groupOfSteps(){
        getTitleFromItem(autoShoppingPage.returnTitle());
        assertSearch();
    }

}

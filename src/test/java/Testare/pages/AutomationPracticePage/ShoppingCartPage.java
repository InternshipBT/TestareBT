package Testare.pages.AutomationPracticePage;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

public class ShoppingCartPage extends PageObject {

    @FindBy (xpath="//*[@id=\"product_5_19_0_203898\"]/td[2]/p/a")
    private WebElementFacade itemTitle;

    public WebElementFacade itemTitle(){
        return itemTitle;
    }
}

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

    @FindBy  (css="#short_description_content")
    private WebElementFacade itemDescription;

    public WebElementFacade itemDescription(){
        return itemDescription;
    }

    @FindBy (css=".our_price_display")
    private  WebElementFacade itemPrice;

    public WebElementFacade itemPrice(){
        return itemPrice;
    }

}

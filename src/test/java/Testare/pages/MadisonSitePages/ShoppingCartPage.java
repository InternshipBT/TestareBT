package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ShoppingCartPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/h2")
    private WebElementFacade productName;

    public WebElementFacade getTitleItem(){
        return productName;
    }
}

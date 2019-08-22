package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ShoppingCartPage extends PageObject{

    @FindBy(xpath = ".product-shop .product-name")
    private WebElementFacade productName;

    @FindBy(css = ".short-description", timeoutInSeconds = "10")
    private WebElementFacade productDescription;

    @FindBy(css = ".price-info", timeoutInSeconds = "10")
    private WebElementFacade productPrice;

    public WebElementFacade getTitleItem(){
        return productName;
    }
    public WebElementFacade getDescriptionItem(){
        return productDescription;
    }
    public WebElementFacade getPriceItem(){
        return productPrice;
    }
}

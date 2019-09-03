package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartMaddison extends PageObject {

    @FindBy(xpath = "//ul[@class='messages'] //li //ul //li //span")
    private WebElementFacade productName;

    @FindBy(css = ".a-center.product-cart-remove.last a")
    private WebElementFacade deleteProd;

    @FindBy(css = ".page-title")
    private WebElementFacade messageInCart;



    public String getTitleFromCart(){
        return productName.getText();
    }
    public void clickDeleteProd(){ deleteProd.click();}
    public String messgInCart(){
        return messageInCart.getText();
    }

}

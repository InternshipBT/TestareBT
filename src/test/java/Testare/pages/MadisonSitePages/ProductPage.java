package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {

    @FindBy(css ="#option25")
    private WebElementFacade colorOfTheProduct;

    @FindBy(css = "#option65")
    private WebElementFacade sizeProduct;

    @FindBy(xpath = "//div[@class='add-to-cart-buttons'] //button[@title='Add to Cart']")
    private WebElementFacade addInCartButton;

    public void productColor(){
        colorOfTheProduct.click();
    }

    public void productSize(){
        sizeProduct.click();
    }

    public void addButton(){
        addInCartButton.click();
    }
}

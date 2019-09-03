package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import java.util.List;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//li[@class='item last'][1]")
    private WebElementFacade findProduct;

    @FindBy(css = ".product-info .product-name")
    private List<WebElementFacade> items;

    @FindBy(css = ".note-msg")
    private WebElementFacade errMesage;

    public void clickOnProduct() {
        findProduct.click();
    }

    public List<WebElementFacade> getAllItems() {
        return items;
    }

    public String getErrMesage(){
        return errMesage.getText();
    }
}

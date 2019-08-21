package Testare.pages.MadisonSitePages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;


public class ResultsPage extends PageObject {

    @FindBy(xpath = "//li[@class='item last'][1]")
    private WebElementFacade findProduct;

    @FindBy(className = "col-main")
    private List<WebElementFacade> items;

    public void clickOnProduct() {
        findProduct.click();
    }

    public List<WebElementFacade> getAllItems() {
        return items;
    }
}
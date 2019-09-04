package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;


import java.util.List;

import static org.hamcrest.Matchers.is;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//li[@class='item last'][1]")
    private WebElementFacade findProduct;

    @FindBy(css = ".product-info .product-name")
    private List<WebElementFacade> items;

    @FindBy(css = ".note-msg")
    private WebElementFacade errMesage;

    @FindBy(css = ".price")
    private List<WebElementFacade> listProductPrices;

    @FindBy(xpath = "//*[@title='Sort By']")
    private WebElementFacade sorter;

    @FindBy(xpath = "//*[@title='Set Ascending Direction']")
    private WebElementFacade ascArrow;

    @FindBy(xpath = "//*[@title='Set Descending Direction']")
    private WebElementFacade descArrow;

    @FindBy(css = "#select-language")
    private WebElementFacade language;


    public void clickOnProduct() {
        findProduct.click();
    }

    public void selectPrice() {
        sorter.selectByVisibleText("Price");
//        Assert.assertThat(sorter.getSelectedVisibleTextValue(), is("Price"));
    }

    public void clickDescArrow() {
        try {
            ascArrow.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        descArrow.click();
    }

    public List<WebElementFacade> getAllItems() {
        return items;
    }

    public String getErrMesage() {
        return errMesage.getText();
    }

    public List<WebElementFacade> getAllPrices() {
        return listProductPrices;
    }
}

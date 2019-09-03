package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//li[@class='item last'][1]")
    private WebElementFacade findProduct;

    @FindBy(className = "col-main")
    private List<WebElementFacade> items;

    @FindBy(className = "product-name")
    private List<WebElementFacade> productsNameList;
//
//    @FindBy(xpath="//select[@title='Sort By']")
//    private WebElementFacade dropDownList;

    Select dropDownList=new Select (getDriver().findElement(By.xpath("//select[@title='Sort By']")));

    public void clickOnProduct() {
        findProduct.click();
    }

    public List<WebElementFacade> getAllItems() {
        return items;
    }

    public ArrayList<String> getProductsName(){
        ArrayList<String> productsName = new ArrayList<>();
        for(WebElementFacade el: productsNameList)
        {
            String title=el.getText();
            productsName.add(title);
        }
        return productsName;
    }

    public void selectSortByName()
    {
        dropDownList.selectByVisibleText("Name");
    }
}

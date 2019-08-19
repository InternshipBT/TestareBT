package Testare.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import javax.swing.text.html.HTML;
import java.util.List;

@DefaultUrl("https://www.emag.ro/")
public class EmagBasketPage extends PageObject {

    @FindBy (xpath = "//input[@id='searchboxTrigger']")
    private WebElementFacade searchBox;

    @FindBy (xpath = "//i[@class='em em-search']")
    private WebElementFacade searchButton;

    @FindBy (xpath = "(//div[@class='card-item js-product-data'])[4] //button[@type='submit']")
    private WebElementFacade addInBasketFourthElButton;

    @FindBy (xpath = "(//div[@class='card-item js-product-data'])[3] //button[@type='submit']")
    private WebElementFacade addInBasketThirdElButton;

    @FindBy (xpath = "//i[@class='em em-close gtm_rp112818']")
    private WebElementFacade closePopUpButton;

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm btn-block']")
    private WebElementFacade viewYourBasketButton;

    @FindBy (xpath = "//button[@class='col-xs-7 col-sm-6 btn btn-primary js-accept gtm_h76e8zjgoo']")
    private WebElementFacade acceptCookiesButton;

    @FindBy(xpath = "//h1[@class='cart']")
    private WebElementFacade myBasketLabel;

    @FindBy (xpath = "//div[@class='cart-widget cart-line']")
    private List<WebElementFacade> items;

    @FindBy(xpath = "(//div[@class='card-item js-product-data'])[1] //button[@class='add-to-favorites btn btn-lg btn-block gtm_xik37z hidden-list']")
    private WebElementFacade addToFavoriteButton;

    public void clickOnSearchBox()
    {
        searchBox.click();
    }

    public void searchElement(String product)
    {
        searchBox.type(product);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }

    public void clickAddInBasketFourthElButton()
    {
        addInBasketFourthElButton.click();
    }

    public void clickAddInBasketThirdElButton()
    {
        addInBasketThirdElButton.click();
    }

    public void clickClosePopUpButton()
    {
        closePopUpButton.click();
    }

    public void clickOnViewYourBasketButton()
    {
        viewYourBasketButton.click();
    }

    public void clickOnAcceptCookiesButton()
    {
        acceptCookiesButton.click();
    }

    public String getLabel()
    {
        return myBasketLabel.getText();
    }

    public int getListSize()
    {
        int i=0;
        for(WebElementFacade x:items)
            i++;
        return i;
    }
//
//    public void priceList(String element)
//    {
//        String number=items.get(0).findBy(By.xpath("//p[@class='product-new-price'")).getText();
//        int price=Integer.parseInt(number);
//        Serenity.getCurrentSession().put(element,price);
//    }

}

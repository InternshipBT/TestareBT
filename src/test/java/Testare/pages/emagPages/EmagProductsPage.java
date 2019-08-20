package Testare.pages.emagPages;

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


public class EmagProductsPage extends PageObject{

    @FindBy (xpath = "(//div[@class='card-item js-product-data'])[4] //button[@type='submit']")
    private WebElementFacade addInBasketFourthElButton;

    @FindBy (xpath = "(//div[@class='card-item js-product-data'])[3] //button[@type='submit']")
    private WebElementFacade addInBasketThirdElButton;

    @FindBy (xpath = "//i[@class='em em-close gtm_rp112818']")
    private WebElementFacade closePopUpButton;

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm btn-block']")
    private WebElementFacade viewYourBasketButton;


    @FindBy (xpath = "//div[@class='card-section-wrapper js-section-wrapper']")
    private List<WebElementFacade> productsList;

    @FindBy(xpath = "(//div[@class='card-item js-product-data'])[1] //button[@class='add-to-favorites btn btn-lg btn-block gtm_xik37z hidden-list']")
    private WebElementFacade addToFavoriteButton;


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


    public void addInPriceList(String element)
    {
        String number=productsList.get(1).findBy(By.xpath("//p[@class='product-new-price']")).getText();
        number=number.replace(number.substring(number.length()-6),"");
        int price=Integer.parseInt(number);
        Serenity.getCurrentSession().put(element,price);
    }
}

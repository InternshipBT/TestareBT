package Testare.pages.emagPages;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveMouseAction;

import javax.swing.text.html.HTML;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@DefaultUrl("https://www.emag.ro/")
public class EmagStartPage extends PageObject{
    @FindBy(xpath = "//a[@id='my_account']")
    private WebElementFacade myAccountButton;

    @FindBy (xpath = "//div[@class='header-back'] //a")
    private WebElementFacade backToSiteButton;


    @FindBy (xpath = "//input[@id='searchboxTrigger']")
    private WebElementFacade searchBox;

    @FindBy (xpath = "//i[@class='em em-search']")
    private WebElementFacade searchButton;

    @FindBy (xpath = "//button[@class='col-xs-7 col-sm-6 btn btn-primary js-accept gtm_h76e8zjgoo']")
    private WebElementFacade acceptCookiesButton;

    public void clickMyAccount() {
        myAccountButton.click();
    }


    public void clickBackToSiteButton()
    {
        backToSiteButton.click();
    }

    public void hoverMyAccount() {
        WebDriver driver = getDriver();
        Actions builder = new Actions(driver);
        builder.moveToElement(myAccountButton).perform();
    }


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

    public void clickOnAcceptCookiesButton()
    {
        acceptCookiesButton.click();
    }
}

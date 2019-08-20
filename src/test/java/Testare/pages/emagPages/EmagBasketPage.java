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

public class EmagBasketPage extends PageObject {


    @FindBy(xpath = "//h1[@class='cart']")
    private WebElementFacade myBasketLabel;

    @FindBy (xpath = "//div[@class='cart-widget cart-line']")
    private List<WebElementFacade> items;


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

}

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

@DefaultUrl("https://www.emag.ro/")
public class EmagHomePage extends PageObject{

    @FindBy(xpath = "//a[@class='js-logout-btn']")
    private WebElementFacade logOutButton;

    @FindBy(xpath = "//a[@id='emg-user-menu']")
    private WebElementFacade userButton;

    @FindBy(xpath = "//p[@class='name']")
    private WebElementFacade userLabel;

    public void logOut() throws MalformedURLException {
        URL logOutLink=new URL(logOutButton.getAttribute("href"));
    }

    public void clickLogOutButton() {

        logOutButton.click();
    }

    public void clickUserButton()
    {
        userButton.click();
    }

    public String getLabel()
    {
        return userLabel.getText();
    }

}

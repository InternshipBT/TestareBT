package Testare.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.imdb.com/")
public class ImdbLogInGmailPage extends PageObject {

    @FindBy(className = "signin-button")
    private WebElementFacade LogInButton;

    @FindBy(xpath="//*[@id=\"signin-options\"]/div/div[1]/a[4]")
    private WebElementFacade ClickGoogleButton;

    @FindBy(css = "#identifierId")
    private WebElementFacade WriteEmail;

    @FindBy(css= "#identifierNext")
    private WebElementFacade ClickMailButton;

    @FindBy(css = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    private WebElementFacade WritePass;

    @FindBy(css = "#passwordNext")
    private WebElementFacade ClickPasswButton;

    public void enter_email(String email) {
        WriteEmail.type(email);
    }

    public void enter_passw(String password) {
        WritePass.sendKeys(password);
    }

    public void LogInButton(){
        LogInButton.click();
    }
    public void GoogleButton(){
        ClickGoogleButton.click();
    }
    public void ClickMailButton(){
        ClickMailButton.click();
    }
    public void ClickPasswButton(){
        ClickPasswButton.click();
    }

}

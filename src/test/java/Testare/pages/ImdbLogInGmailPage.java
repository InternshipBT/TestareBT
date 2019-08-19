package Testare.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("https://www.imdb.com/")
public class ImdbLogInGmailPage extends PageObject {

    @FindBy(className = "signin-button")
    private WebElementFacade LogInButton;

    @FindBy(xpath="//*[@id=\"signin-options\"]/div/div[1]/a[4]")
    private WebElementFacade GoogleMailButton;

    @FindBy(css = "#identifierId")
    private WebElementFacade EmailField;

    @FindBy(css= "#identifierNext")
    private WebElementFacade InainteMailButton;

    @FindBy(css = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    private WebElementFacade PasswField;

    @FindBy(css = "#passwordNext")
    private WebElementFacade InaintePasswButton;

    @FindBy(css="#nblogout")
    private WebElementFacade LogOutButton;

//    Actions builder = new Actions(driver);
//    WebElement element = driver.findElement(By.linkText("Put your text here"));
//    builder.moveToElement(element).build().perform();

    public void enter_email(String email) { EmailField.type(email); }

    public void enter_password(String password) {
        PasswField.sendKeys(password);
    }

    public void click_logIn_Button(){ LogInButton.click(); }
    public void click_Google_Mail_Button(){ GoogleMailButton.click(); }
    public void click_Inainte_mail_button(){ InainteMailButton.click(); }
    public void click_inainte_pasw_button(){ InaintePasswButton.click(); }
    public void Click_LogOut_Button() {LogOutButton.click();}


}

package Testare.pages;

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

public class EmagLogInPage extends PageObject {
    @FindBy(xpath = "//a[@id='my_account']")
    private WebElementFacade myAccountButton;

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade emailTextBox;

    @FindBy(xpath = "//button[@class='gui-btn auth-btn-primary auth-submit']")
    private WebElementFacade continueButton;

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade passTextBox;

    @FindBy(xpath = "//a[@class='js-logout-btn']")
    private WebElementFacade logOutButton;

    public void clickMyAccount() {
        myAccountButton.click();
    }


    public void enterEmail(String email) {
        emailTextBox.type(email);
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void enterPass(String password) {
        passTextBox.type(password);
    }

    public void logOut() throws MalformedURLException {
        URL logOutLink=new URL(logOutButton.getAttribute("href"));
    }

    public void hoverMyAccount() {
        WebDriver driver = getDriver();
        Actions builder = new Actions(driver);
        builder.moveToElement(myAccountButton).perform();
        waitABit(500000);
    }

    public void clickLogOutButton() {

        logOutButton.click();
    }

}

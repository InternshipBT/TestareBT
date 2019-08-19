package Testare.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;
@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class AutoPracticePage extends PageObject {

    @FindBy(css = "#email")
    private WebElementFacade emailField;

    @FindBy(css = "#passwd")
    private WebElementFacade passwordField;


    @FindBy(css = ".icon-lock.left")
    private WebElementFacade logInButton;

    @FindBy(css = ".info-account")
    private WebElementFacade accountMessageLogIn;

    public void enterEmail(String keyword) {
        emailField.click();
        emailField.sendKeys(keyword);
    }

    public void enterPassword(String keyword) {
        passwordField.click();
        passwordField.sendKeys(keyword);
    }


    public void clicklogin() {
        logInButton.click();
    }

   public String accountMessage(){
        return accountMessageLogIn.getText();
   }

}

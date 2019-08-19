package Testare.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;


@DefaultUrl("https://wizzair.com/#/")
public class WizzLogInPage extends PageObject {

    @FindBy(xpath= "(//li[@class='navigation__item'])[3]")
    private WebElementFacade loginButton;

    @FindBy(name = "email")
    private WebElementFacade emailField;

    @FindBy(name = "password")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//*[@id=\"app\"]/div/header/div[1]/div/nav/ul/li[7]/a")
    private WebElementFacade accountButton;

    @FindBy(css = ".rf-button.rf-button--medium.rf-button--full-width.rf-button--primary")
    private WebElementFacade signInButton;


    @FindBy(css= ".profile__headings__logout__inner")
    private WebElementFacade logoutButton;


    @FindBy(className = "(navigation__language-icon")
    private WebElementFacade languageButton;



    @FindBy(xpath = "(//li[@class=\'language-switcher__item-container\'])[15]")
    private WebElementFacade RomanianLanguage;


    public void clicklogin() {
        loginButton.click();
    }

    public void enterEmail(String keyword) {
        emailField.click();
        emailField.sendKeys(keyword);
    }

    public void enterPassword(String keyword) {
        passwordField.click();
        passwordField.sendKeys(keyword);
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public void clickaccount(){
        accountButton.click();
    }

    public void clickLogOut(){
        logoutButton.click();
    }

    public void clickLanguage(){
        waitFor(20000);
        languageButton.click();
    }
    public void clickRomanianLanguage(){
        RomanianLanguage.click();
    }



}


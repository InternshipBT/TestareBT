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
    private WebElementFacade login;

    @FindBy(name = "email")
    private WebElementFacade email;

    @FindBy(name = "password")
    private WebElementFacade password;


    @FindBy(css = ".rf-button.rf-button--medium.rf-button--full-width.rf-button--primary")
    private WebElementFacade signIn;

    public void clicklogin() {
        login.click();
    }

    public void enterEmail(String keyword) {
        email.click();
        email.sendKeys(keyword);
    }

    public void enterPassword(String keyword) {
        password.click();
        password.sendKeys(keyword);
    }

    public void clickSignIn() {
        signIn.click();
    }


}


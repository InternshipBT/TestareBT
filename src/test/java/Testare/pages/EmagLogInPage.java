package Testare.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import java.util.List;

@DefaultUrl("https://www.emag.ro/")

public class EmagLogInPage extends PageObject {
    @FindBy (xpath = "//a[@id='my_account']")
    private WebElementFacade myAccountButton;

    @FindBy (xpath = "//input[@id='email']")
    private WebElementFacade emailTextBox;

    @FindBy (xpath = "//button[@class='gui-btn auth-btn-primary auth-submit']")
    private WebElementFacade continueButton;

    @FindBy (xpath = "//input[@id='password']")
    private WebElementFacade passTextBox;

    public void clickMyAccount()
    {
        myAccountButton.click();
    }


    public void enterEmail(String email)
    {
        emailTextBox.type(email);
    }

    public void clickContinue()
    {
        continueButton.click();
    }

    public void enterPass(String password)
    {
        passTextBox.type(password);
    }

}

package Testare.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class MadisonPages extends PageObject{

    @FindBy(css = ".skip-link.skip-account")
    private WebElementFacade accountIcon;

    @FindBy(xpath = "//a[@title='Log In']")
    private WebElementFacade loginLabel;

    @FindBy (css = "#email.input-text.required-entry.validate-email")
    private WebElementFacade enterEmail;

    @FindBy(css = "#pass.input-text.required-entry.validate-password")
    private WebElementFacade enterPassword;

    @FindBy(xpath = "//button[@name='send']")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//p[@class='welcome-msg']")
    private WebElementFacade welcomeMSG;

    public void clickMyAccount(){
        accountIcon.click();
    }

    public void clickLogIn(){
        loginLabel.click();
    }

    public void enterMail(String gmailTest){

        enterEmail.type(gmailTest);
    }

    public void enterPass(String gmail_password){
        enterPassword.type(gmail_password);
    }

    public void clickSubmit(){

        submitButton.click();
    }

    public String assertLogin(){
        return welcomeMSG.getText();
    }

}

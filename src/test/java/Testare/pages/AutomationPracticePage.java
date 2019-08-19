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

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationPracticePage extends PageObject {

    @FindBy(css = ".header_user_info")
    private WebElementFacade LogInButton;

    @FindBy(css = "#email")
    private WebElementFacade EmailField;

    @FindBy(css = "#passwd")
    private WebElementFacade PasswordField;

    @FindBy(css = "#SubmitLogin")
    private WebElementFacade SingIn_Button;

    @FindBy(css=".account")
    private WebElementFacade ProfileButton;


    public void enter_email(String email) {
        EmailField.type(email);
    }


    public void enter_passw(String passw) {
        PasswordField.type(passw);
    }


    public void click_LogIn_button() {
        LogInButton.click();
    }

    public void click_SignIn_button() {
        SingIn_Button.click();
    }

    public String ProfileButton(){
        return ProfileButton.getText();
    }


}

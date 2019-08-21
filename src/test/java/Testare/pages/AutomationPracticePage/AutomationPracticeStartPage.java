package Testare.pages.AutomationPracticePage;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationPracticeStartPage extends PageObject {


    @FindBy(css = ".header_user_info")
    private WebElementFacade logInButton;

//    @FindBy(css = "#email")
//    private WebElementFacade EmailField;
//
//    @FindBy(css = "#passwd")
//    private WebElementFacade PasswordField;
//
//    @FindBy(css = "#SubmitLogin")
//    private WebElementFacade SingIn_Button;
//
//    @FindBy(css=".account")
//    private WebElementFacade ProfileButton;


//    public void enter_email(String email) {
//        EmailField.type(email);
//    }
//
//
//    public void enter_passw(String passw) {
//        PasswordField.type(passw);
//    }


    public void clickLogInButton() {
        logInButton.click();
    }

//    public void click_SignIn_button() {
//        SingIn_Button.click();
//    }

//    public String ProfileButton(){
//        return ProfileButton.getText();
//    }


}

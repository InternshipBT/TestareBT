package Testare.pages.AutomationPracticePage;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

public class AutomationPracticeLogInPage extends PageObject {


    @FindBy(css = "#email")
    private WebElementFacade emailField;

    @FindBy(css = "#passwd")
    private WebElementFacade passwordField;

    @FindBy(css = "#SubmitLogin")
    private WebElementFacade singInButton;

    public void enterEmail(String email) {
        emailField.type(email);
    }


    public void enterPassw(String passw) {
        passwordField.type(passw);
    }
    public void clickSignInButton() {
        singInButton.click();
    }
}

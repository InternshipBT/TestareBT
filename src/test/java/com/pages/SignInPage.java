package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SignInPage extends PageObject {

    @FindBy(css=".whsOnd.zHQkBf")
    private WebElementFacade emailField;

    @FindBy(css=".RveJvd.snByac")
    private WebElementFacade nextButton;

    @FindBy(css=".whsOnd.zHQkBf")
    private WebElementFacade passwordField;

    public void input_email(String email){
        emailField.type(email);
        nextButton.click();

    }
    public void input_password(String password){
        passwordField.type(password);
        nextButton.click();
    }


}

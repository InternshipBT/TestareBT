package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OtherSignInPage extends PageObject {

    @FindBy(css=".auth-sprite.google-logo.retina")
    private WebElementFacade googleButton;

    public void sign_in_with_google() {

        googleButton.click();
    }


}

package com.steps;

import com.pages.HomePage;
import com.pages.OtherSignInPage;
import com.pages.SignInPage;
import net.thucydides.core.annotations.Step;

public class SignInSteps {

    HomePage homePage;
    OtherSignInPage otherSignInPage;
    SignInPage signInPage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void user_navigates_to_sign_in_page() {
        homePage.other_signin();
    }

    @Step
    public void user_click_on_google_button(){
        otherSignInPage.sign_in_with_google();
    }

    @Step
    public void user_enters_valid_username(String email){ signInPage.input_email(email); }

    @Step
    public void user_enters_valid_password(String password){
        signInPage.input_password(password);
    }



}

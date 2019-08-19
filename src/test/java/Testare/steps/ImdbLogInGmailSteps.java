package Testare.steps;

import Testare.pages.ImdbLogInGmailPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class ImdbLogInGmailSteps {

    ImdbLogInGmailPage imdbPage;


    @Step
    public void is_the_home_page() {
        imdbPage.open();
    }


    @Step
    public void click_LoginButton() { imdbPage.click_logIn_Button(); }

    @Step
    public void click_GoogleButton() { imdbPage.click_Google_Mail_Button(); }

    @Step
    public void enter_ValidEmail(String mail) {
        imdbPage.enter_email(mail);
    }

    @Step
    public void click__inainte_MailButton() { imdbPage.click_Inainte_mail_button(); }

    @Step
    public void enter_ValidPassw(String password) {
        imdbPage.enter_password(password);
    }

    @Step
    public void click_PassButTon() { imdbPage.click_inainte_pasw_button(); }

    @Step
    public void Click_LogOutButton() { imdbPage.Click_LogOut_Button(); }

    @Step
    public void LogIn_On_imdb_Page (String mail, String password) {
        imdbPage.open();
        imdbPage.click_logIn_Button();
        imdbPage.click_Google_Mail_Button();
        imdbPage.enter_email(mail);
        imdbPage.click_Inainte_mail_button();
        imdbPage.enter_password(password);
        imdbPage.click_inainte_pasw_button();
        //imdbPage.Click_LogOut_Button();
    }
}

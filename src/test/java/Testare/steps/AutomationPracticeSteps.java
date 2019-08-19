package Testare.steps;



import Testare.pages.AutomationPracticePage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class AutomationPracticeSteps {

     AutomationPracticePage AutPrPage;

    @Step
    public void Autom_Pr_LogIn (String email ,String passw){
        AutPrPage.open();
        AutPrPage.click_LogIn_button();
        AutPrPage.enter_email(email);
        AutPrPage.enter_passw(passw);
        AutPrPage.click_SignIn_button();
    }

    @Step
    public void  asert_login (){
        String actual = AutPrPage.ProfileButton();
        String expected = "Test BancaTransilvania";
        Assert.assertEquals("Message was not the same", actual , expected);

    }
}

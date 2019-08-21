package Testare.steps.AutomationPracticeSteps;



import Testare.pages.AutomationPracticePage.AutomationPracticeHomePage;
import Testare.pages.AutomationPracticePage.AutomationPracticeLogInPage;
import Testare.pages.AutomationPracticePage.AutomationPracticeStartPage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class AutomationPracticeLogInSteps {


    AutomationPracticeStartPage  autprStart;
    AutomationPracticeLogInPage autprLogIn;
    AutomationPracticeHomePage autprHome;

    @Step
    public void automPrLogIn (String email ,String passw){
        autprStart.open();
        autprStart.clickLogInButton();
        autprLogIn.enterEmail(email);
        autprLogIn.enterPassw(passw);
        autprLogIn.clickSignInButton();
    }

    @Step
    public void  asertLogIn (){
        String actual = autprHome.profileButton();
        String expected = "Test BancaTransilvania";
        Assert.assertEquals("Message was not the same", actual , expected);

    }
}

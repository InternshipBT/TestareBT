package Testare.Tests.AutomationPracticeTest;

import Testare.Credentials;
import Testare.steps.AutomationPracticeSteps.AutomationPracticeAddToCartSteps;
import Testare.steps.AutomationPracticeSteps.AutomationPracticeLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
@Concurrent
public class AutomationPracticeNegativeTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    AutomationPracticeLogInSteps autprLogIn;
    @Steps
    AutomationPracticeAddToCartSteps autprAdd;


    @Before
    public void maximizePage() {
        webdriver.manage().window().maximize();
    }

//    @Test
//    public void negativeEmailLogIn(){
//        autprLogIn.automPrLogIn(Credentials.neg_em, Credentials.neg_pass);
//        autprLogIn.negAsertLogIn();
//    }
//
//    @Test
//    public void invPassLogIn(){
//        autprLogIn.automPrLogIn(Credentials.AP_EMAIL, Credentials.neg_pass);
//        autprLogIn.negassertPassLogIn();
//    }
//
//
//    @Test
//    public void searchNonExistingItem() {
//        autprLogIn.automPrLogIn(Credentials.AP_EMAIL, Credentials.AP_PASSWORD);
//        autprAdd.searchSomething("pizza");
//        autprAdd.negItemSearch1();
//    }
//    @Test
//    public void searNonExistingItem2() {
//        autprLogIn.automPrLogIn(Credentials.AP_EMAIL, Credentials.AP_PASSWORD);
//        autprAdd.searchSomething("Cola");
//        autprAdd.negItemSearch2();
//    }
}
package Testare.Tests;
<<<<<<< HEAD


import Testare.steps.MadisonSteps.MadisonAddInBasketSteps;
import Testare.steps.MadisonSteps.MadisonLoginSteps;
=======
import Testare.Credentials;
import Testare.pages.MadisonPages;
import Testare.steps.MadisonSteps;
import Testare.steps.ImdbLogInGmailSteps;
import Testare.steps.MadisonSteps;
>>>>>>> master
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static Testare.Credentials.MADISON_EMAIL;
import static Testare.Credentials.MADISON_PASSWORD;

@RunWith(SerenityRunner.class)
public class MadisonTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    MadisonLoginSteps madisonLoginSteps;
    @Steps
    MadisonAddInBasketSteps madisonAddInBasketSteps;

    @Before
    public void openWindow() {
        webdriver.manage().window().maximize();
    }
   /* @After
    public void closeWebDriver(){
        webdriver.manage().window().
    }
*/
    @Test
    public void LoginMadison() {
        madisonLoginSteps.is_the_home_page();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonLoginSteps.assertsLogIn();
    }

    @Test
    public void AddProductInCart(){
        madisonLoginSteps.is_the_home_page();
        madisonLoginSteps.loginMadison(MADISON_EMAIL, MADISON_PASSWORD);
        madisonAddInBasketSteps.madisonSearch("pants");
        madisonAddInBasketSteps.addToCartAndAssert();
    }
}

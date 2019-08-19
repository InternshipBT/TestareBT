package Testare.steps.serenity;


import Testare.pages.EmagLogInPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EmagLogOutSteps {
    EmagLogInPage emagLoginPage;


    @Step
    public void is_the_home_page() {
        emagLoginPage.open();
    }

    @Step
    public void logInEmag(String email, String password)
    {
        emagLoginPage.clickMyAccount();
        emagLoginPage.enterEmail(email);
        emagLoginPage.clickContinue();
        emagLoginPage.enterPass(password);
        emagLoginPage.clickContinue();
        emagLoginPage.hoverMyAccount();
    }

}

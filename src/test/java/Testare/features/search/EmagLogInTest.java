package Testare.features.search;

import Testare.steps.serenity.EmagLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Testare.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class EmagLogInTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagLogInSteps laurentiu;

    @Test
    public void emagLogIn()
    {
        laurentiu.is_the_home_page();
        laurentiu.loginEmag("testarelaurentiu@gmail.com","AstaEParola");
    }
}

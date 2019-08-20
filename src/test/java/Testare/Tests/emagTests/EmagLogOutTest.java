package Testare.Tests.emagTests;

import Testare.Credentials;
import Testare.steps.emagSteps.EmagLogOutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class EmagLogOutTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagLogOutSteps laurentiu;


    @Before
    public void maximizeWindow()
    {
        webdriver.manage().window().maximize();
    }


    @Test
    public void emagLogOut() {
        laurentiu.isTheHomePage();
        laurentiu.logInEmag(Credentials.EMAG_EMAIL, Credentials.EMAG_PASSWORD);
    }
}

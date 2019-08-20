package Testare.Tests.emagTests;

import Testare.Credentials;
import Testare.steps.emagSteps.EmagLogInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class EmagLogInTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagLogInSteps laurentiu;


    @Before
    public void maximizeWindow()
    {
        webdriver.manage().window().maximize();
    }

    @Test
    public void emagLogIn() throws InterruptedException {
        laurentiu.isTheHomePage();
        laurentiu.loginEmag(Credentials.EMAG_EMAIL,Credentials.EMAG_PASSWORD);
    }



}

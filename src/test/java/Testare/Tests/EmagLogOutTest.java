package Testare.Tests;

import Testare.Credentials;
import Testare.steps.EmagLogOutSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(SerenityRunner.class)
public class EmagLogOutTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EmagLogOutSteps laurentiu;


    @Test
    public void emagLogOut() {
        laurentiu.is_the_home_page();
        laurentiu.logInEmag(Credentials.EMAG_EMAIL, Credentials.EMAG_PASSWORD);
    }
}

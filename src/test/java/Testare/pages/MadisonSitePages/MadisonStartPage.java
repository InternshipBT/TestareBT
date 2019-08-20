package Testare.pages.MadisonSitePages;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://fasttrackit.org/selenium-test/")
public class MadisonStartPage extends PageObject{

    @FindBy(css = ".skip-link.skip-account")
    private WebElementFacade accountIcon;

    @FindBy(xpath = "//a[@title='Log In']")
    private WebElementFacade loginLabel;

    public void clickMyAccount(){
        accountIcon.click();
    }

    public void clickLogIn(){
        loginLabel.click();
    }

}
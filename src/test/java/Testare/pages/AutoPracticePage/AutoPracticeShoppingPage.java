package Testare.pages.AutoPracticePage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AutoPracticeShoppingPage extends PageObject  {

    @FindBy(xpath= "//*[@id=\'product_7_34_0_203911\']/td[2]/p/a")
    private WebElementFacade productName;

    public WebElementFacade returnTitle(){
           return productName;
  }
}

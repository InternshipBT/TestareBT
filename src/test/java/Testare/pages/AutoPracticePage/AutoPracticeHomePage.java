package Testare.pages.AutoPracticePage;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

public class AutoPracticeHomePage extends PageObject {

    @FindBy(css = ".info-account")
    private WebElementFacade accountMessageLogIn;

    @FindBy(css = "#search_query_top")
    private WebElementFacade searchField;

    @FindBy(xpath = "(//div[@class='product-image-container'])")
    private WebElementFacade selectFirstElement;

    @FindBy(css = ".btn.btn-default.button-search")
    private WebElementFacade searchButton;


    public String accountMessage() {
        return accountMessageLogIn.getText();
    }

    public void searchProduct(String keyword) {
        searchField.click();
        searchField.sendKeys(keyword);
    }

    public void firstElement(){
        selectFirstElement.click();
    }


    public void pressSearchButton(){
        searchButton.click();
    }

}

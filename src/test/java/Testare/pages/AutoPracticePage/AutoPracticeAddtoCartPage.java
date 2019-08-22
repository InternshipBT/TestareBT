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


public class AutoPracticeAddtoCartPage extends PageObject {


    @FindBy(xpath = "(//a[@class='product-name'])[1]")
    private WebElementFacade firstProduct;

    @FindBy(xpath = "(//a[@class='product-name'])")
    private List<WebElementFacade> products;

    @FindBy(css = "#add_to_cart")
    private WebElementFacade addToCartButton;



    @FindBy(id = "short_description_content")
    private WebElementFacade description;



    @FindBy(id = "our_price_display")
    private WebElementFacade price;

    @FindBy(css = ".btn.btn-default.button.button-medium")
    private WebElementFacade proceedToCheckout;

    public WebElementFacade returnDescription(){
        return description;
    }
    public WebElementFacade returnPrice(){
        return price;
    }

    public List<WebElementFacade> getAllItmes() {
        return products;
    }

    public void selectFirstItem() {
        firstProduct.click();
    }

    public void addToCart() {
//        Actions actions = new Actions(getDriver());
//        actions.click(addToCartButton).perform();
        waitFor(addToCartButton);
        addToCartButton.click();
    }

    public void openCart() {
        proceedToCheckout.click();
    }




}

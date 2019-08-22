package Testare.pages.AutomationPracticePage;


import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

public class AutomationPracticeAddToChartPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElementFacade itemSelecion;

    @FindBy(className = "ajax_block_product")
    private List<WebElementFacade> items;

    @FindBy(xpath= "//*[@id=\"add_to_cart\"]/button")
    private WebElementFacade addToCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    private WebElementFacade addToCartConfirm;


    public void addItemToCart() {
        itemSelecion.click();
        addToCart.click();
        addToCartConfirm.click();


    }

    public List<WebElementFacade> getAllItems() {
        return items;
    }


}

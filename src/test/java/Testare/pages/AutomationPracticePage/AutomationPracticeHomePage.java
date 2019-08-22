package Testare.pages.AutomationPracticePage;


import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
public class AutomationPracticeHomePage extends PageObject{

    @FindBy(css=".account")
        private WebElementFacade profileButton;

    @FindBy(css="#search_query_top")
        private WebElementFacade searchField;

    @FindBy(css=".btn.btn-default.button-search")
    private WebElementFacade searchButotn;

    @FindBy(xpath = "(//div[@class='product-image-container'])")
    private WebElementFacade clickOnItem;


    public void searchItem(String item){
        searchField.click();
        searchField.clear();
        searchField.type(item);
        searchButotn.click();
        clickOnItem.click();
    }



    public String profileButton(){
        return profileButton.getText();
    }

    }

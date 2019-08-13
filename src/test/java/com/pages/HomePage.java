package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.imdb.com/")

public class HomePage extends PageObject {

    @FindBy(css=".signin-other-options-text")
    private WebElement otherSignIn;

    @FindBy (xpath="//*[@id=\"navbar-query\"]")
    private WebElement searchBar;

    @FindBy (css="#quicksearch > option:nth-child(2)")
    private WebElement selectType;

    @FindBy(css="#navbar-submit-button.primary.btn")
    private WebElement searchButton;

    @FindBy(xpath="//*[@id=\"navWatchlistMenu\"]/p/a")
    private WebElement watchlistButton;

    public void other_signin(){
        otherSignIn.click();
    }

    public void enter_keyword(String movieSearch){
        selectType.click();
        searchBar.click();
        searchBar.sendKeys(movieSearch);
        searchButton.click();

    }

    public void watchlist_for_comments(){
        watchlistButton.click();
    }

}

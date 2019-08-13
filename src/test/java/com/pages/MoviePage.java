package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class MoviePage extends PageObject {


    @FindBy(css=".ribbonize")
    private WebElement addToWatchListButton;;

    @FindBy(xpath="//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[1]/div[3]/div[3]/a")
    private WebElement newWatchListButton;


    public void add_to_watch_list() throws InterruptedException {
        addToWatchListButton.click();
        Thread.sleep(2000);
    }
    public void new_watch_list() throws InterruptedException {
        addToWatchListButton.click();
        Thread.sleep(3000);
        addToWatchListButton.click();
        Thread.sleep(5000);
        newWatchListButton.click();
   }
}

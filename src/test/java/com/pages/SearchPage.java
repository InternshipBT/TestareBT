package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SearchPage extends PageObject {

    @FindBy(css="#main > div > div.findSection > table > tbody > tr:nth-child(1) > td.result_text > a")
    private WebElement titles;

    public void select_title(){
        titles.click();

    }
}

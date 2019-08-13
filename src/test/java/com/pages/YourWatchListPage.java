package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourWatchListPage extends PageObject {

    public WebDriver driver ;

    @FindBy(xpath="//*[@id=\"sidebar\"]/div[4]/span/div/span/span/a")
    private WebElement createNewListButton;

    @FindBy(xpath="//*[@id=\"facebook\"]/body/div/div/div/div/div/div[2]/div[2]/div/div/div[1]/textarea")
    private WebElementFacade addACommentField;

    @FindBy (css="#fbComments")
    private WebElement frame;

    public void create_new_list (){
        createNewListButton.click();

    }

//    public void add_a_comment(){
//        WebElement iframeSwitch = driver.findElement(By.id("fbComments"));
//        driver.switchTo().frame(iframeSwitch);
//        System.out.println("Switched");
//        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div/div/div/div/div/div[2]/div[2]/div/div/div[1]/textarea")).click();
//    }



    public void add_a_comment(){

        addACommentField.click();
    }
}

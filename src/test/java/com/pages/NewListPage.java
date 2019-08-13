package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class NewListPage extends PageObject {

    @FindBy(css="#list-create-name")
    private WebElement listTitle;

    @FindBy(css="#list-create-description")
    private WebElement listDescription;

    @FindBy(css="#list-create-type > option:nth-child(1)")
    private WebElement typeOfList;

    @FindBy(xpath="//*[@id=\"list-create-form\"]/button")
    private WebElement createListButton;

    @FindBy(css="#add-to-list-search")
    private WebElement searchBarInListPage;

    @FindBy(css="#add-to-list-search-results > a:nth-child(1) > div > span.title")
    private WebElement selectMovie;

    @FindBy(xpath="//*[@id=\"main\"]/div[1]/button")
    private WebElement doneButton;


    public void new_list(String title, String description) throws InterruptedException {
        listTitle.sendKeys(title);
        Thread.sleep(2000);
        listDescription.sendKeys(description);
        Thread.sleep(2000);
        typeOfList.click();
        createListButton.click();

    }

    public void new_list_for_comments(String title, String description) throws InterruptedException {
        listTitle.sendKeys(title);
        Thread.sleep(2000);
        listDescription.sendKeys(description);
        Thread.sleep(2000);
        typeOfList.click();
        createListButton.click();
        doneButton.click();


    }

    public void add_movie_in_new_list(String movieTitle) throws InterruptedException {
        searchBarInListPage.click();
        searchBarInListPage.sendKeys(movieTitle);
        Thread.sleep(4000);
        selectMovie.click();

    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/div[3]/span"));
        return definitionList.findElements(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/div[3]/span")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}

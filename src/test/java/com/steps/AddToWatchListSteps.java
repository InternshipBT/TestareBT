package com.steps;
import com.pages.HomePage;
import com.pages.MoviePage;
import com.pages.SearchPage;
import net.thucydides.core.annotations.Step;


public class AddToWatchListSteps {

    HomePage homePage;
    SearchPage searchPage;
    MoviePage moviePage;



    @Step
    public void user_enter_keyword(String movieSearch){
        homePage.enter_keyword(movieSearch);
    }

    @Step
    public void user_select_title(){
        searchPage.select_title();
    }

    @Step
    public void user_add_to_watch_list() throws InterruptedException {
        moviePage.add_to_watch_list();

    }





}

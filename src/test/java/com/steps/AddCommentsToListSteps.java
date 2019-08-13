package com.steps;

import com.pages.*;
import net.thucydides.core.annotations.Step;

public class AddCommentsToListSteps {

    HomePage homePage;
    YourWatchListPage yourWatchListPage;
    NewListPage newListPage;

    @Step
    public void user_create_new_watchlist(String listTitle, String listDescription) throws InterruptedException {
        homePage.watchlist_for_comments();
        yourWatchListPage.create_new_list();
        newListPage.new_list_for_comments(listTitle,listDescription);


    }

    @Step
    public void user_add_a_comment(){
        yourWatchListPage.add_a_comment();
    }

}

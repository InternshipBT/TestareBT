package com.steps;

import com.pages.MoviePage;
import com.pages.NewListPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class AddToNewListSteps {

    NewListPage newListPage;
    MoviePage moviePage;

    @Step
    public void user_select_new_list() throws InterruptedException {
        moviePage.new_watch_list();

    }

    @Step
    public void user_create_new_list( String listTitle, String listDescription) throws InterruptedException {
        newListPage.new_list(listTitle,listDescription);

    }
    @Step
    public void should_see_definition(String definition) {
        assertThat(newListPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void user_add_movie_to_new_list(String movie_title) throws InterruptedException {

        newListPage.add_movie_in_new_list(movie_title);
    }

}

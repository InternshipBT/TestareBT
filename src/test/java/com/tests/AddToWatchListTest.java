package com.tests;

import com.steps.AddToNewListSteps;
import com.steps.AddToWatchListSteps;
import com.steps.SignInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)

public class AddToWatchListTest {

    @Managed(uniqueSession = true)
    public WebDriver driver ;

    @Steps
    public SignInSteps signInSteps;

    @Steps
    public AddToWatchListSteps addToWatchListSteps;

    @Steps
    public AddToNewListSteps addToNewListSteps;

    @Test
    public void successfully_add_to_watch_list() throws InterruptedException {
        signInSteps.is_the_home_page();
        driver.manage().window().maximize();
        signInSteps.user_navigates_to_sign_in_page();
        signInSteps.user_click_on_google_button();
        signInSteps.user_enters_valid_username("talos.marian@gmail.com");
        Thread.sleep(2000);
        signInSteps.user_enters_valid_password("topsecret92");
        Thread.sleep(7000);
        addToWatchListSteps.user_enter_keyword("narcos");
        addToWatchListSteps.user_select_title();
        addToWatchListSteps.user_add_to_watch_list();


    }

}

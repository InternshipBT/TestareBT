package com.tests;

import com.steps.AddCommentsToListSteps;
import com.steps.SignInSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

@RunWith(SerenityRunner.class)
public class AddCommentsToListTest {


    @Managed(uniqueSession = true)
    public WebDriver driver ;


    @Steps
    public SignInSteps signInSteps;

    @Steps
    public AddCommentsToListSteps addCommentsToListSteps;

    @Test
        public void successfully_add_comments_to_list() throws InterruptedException {
        signInSteps.is_the_home_page();
        driver.manage().window().maximize();
        signInSteps.user_navigates_to_sign_in_page();
        signInSteps.user_click_on_google_button();
        signInSteps.user_enters_valid_username("talos.marian@gmail.com");
        Thread.sleep(2000);
        signInSteps.user_enters_valid_password("topsecret92");
        Thread.sleep(5000);
        addCommentsToListSteps.user_create_new_watchlist("test1","seriale");
        Thread.sleep(7000);

//        int size = driver.findElements(By.tagName("iframe")).size();
//        System.out.println("lista iframeurilor");
//        for(int i=0; i<=size; i++){
//            driver.switchTo().frame(i);
//            int total=driver.findElements(By.id("fbComments")).size();
//
//            System.out.println(total);
//            driver.switchTo().defaultContent();}


        driver.switchTo().frame(4); //Switching to the frame
        System.out.println("********We are switched to the iframe*******");
        driver.switchTo().defaultContent();
//        driver.switchTo().frame(driver.findElement(By.xpath("\"//*[@id=\\\"fb-comments-container\\\"]/span/iframe\"")));
//        System.out.println("********We are switched to the iframe*******");
//                int size = driver.findElements(By.name("f23599339bb55e")).size();
//        System.out.println("lista iframeurilor");
//        for(int i=0; i<=size; i++){
//            driver.switchTo().frame(i);
//            int total=driver.findElements(By.xpath("//*[@id=\"facebook\"]/body/div/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div[2]")).size();
//
//            System.out.println(total);
//            driver.switchTo().defaultContent();}
//
       driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div/div/div/div/div/div[2]/div[2]/div/div/div[1]")).click();

       // Clicking the element in line with Advertisement
        System.out.println("*********We are done***************");


        //        driver.switchTo().frame("fbComments");
//        driver.switchTo().frame(5);
//        System.out.println("First Switch");
//        driver.switchTo().frame("f176fee21882a1");
//        driver.switchTo().frame(14);
//        System.out.println("********We are switched to the iframe*******");


//        addCommentsToListSteps.user_add_a_comment();


        Thread.sleep(5000);

    }

    @Test
    public void frame(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marian.talos\\Documents\\Imdb_Nou_Marian\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        int size = driver.findElements(By.tagName("iframe")).size();

        for(int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            int total=driver.findElements(By.xpath("html/body/a/img")).size();
            System.out.println(total);
            driver.switchTo().defaultContent();}
    }
}

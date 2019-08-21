package Testare.Tests.AutoPracticeTests;


import Testare.Credentials;
import Testare.steps.AutoPracticeSteps.AutoPracticeAddtoCartSteps;
import Testare.steps.AutoPracticeSteps.AutoPracticeStartSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/AutoPracticeTestData.csv", separator = ';')

public class SearchItemDataDrivenAutoPracticeTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AutoPracticeStartSteps anna;

    @Steps
    AutoPracticeAddtoCartSteps addToCardSteps;

    public String name, description, price;


    @Qualifier
    public String getQualifier() {
        return name;
    }

//    @Qualifier
//    public String getDescription() {
//        return description;
//    }
//
//    @Qualifier
//    public int getPrice() {
//        return Integer.parseInt(price);
//    }


    @Test
    public void testSearchWithCSV(){
        anna.is_the_home_page();
        anna.searchProducts(name);
        addToCardSteps.assertDescription(description);
        addToCardSteps.assertPrice(price);


    }
}

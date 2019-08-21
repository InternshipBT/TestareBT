package Testare.Tests.AutomationPracticeTest;

import Testare.steps.AutomationPracticeSteps.AutomationPracticeAddToCartSteps;
import Testare.steps.AutomationPracticeSteps.AutomationPracticeLogInSteps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Qualifier;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/AutomationPracticeTestData.csv", separator=';')

public class SearchItemDataDrivenAutomationPracticeTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    public String name, description, price;

    @Qualifier
    public String getQualifier(){
        return name;
    }



    @Steps
    AutomationPracticeLogInSteps autprLogIn;
    @Steps
    AutomationPracticeAddToCartSteps autprAdd;

    @Test
    public void searchTestWithCSV() {
        autprLogIn.openPage();
        autprAdd.autPracticeAddItemsToCart(name);
        autprAdd.assertDescription(description);
        autprAdd.assertPrice(price);
    }

}

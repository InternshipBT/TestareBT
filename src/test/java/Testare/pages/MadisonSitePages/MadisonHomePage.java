package Testare.pages.MadisonSitePages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;


public class MadisonHomePage extends PageObject {

    @FindBy(xpath = "//p[@class='welcome-msg']")
    private WebElementFacade welcomeMSG;

    @FindBy(css = "#search")
    private WebElementFacade searchBar;

    @FindBy(css = ".button.search-button")
    private WebElementFacade enterTextSearchBar;

   public String assertLogin() {
        return welcomeMSG.getText();
    }

    public void enterTextInSearchBar(String textForSearchBar) {
        searchBar.type(textForSearchBar);
    }

    public void searchElementIntroduced(){
        enterTextSearchBar.click();
    }
}

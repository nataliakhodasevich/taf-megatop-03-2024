package by.megatop.ui;
import by.megatop.pages.HomePage;
import by.megatop.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
    @DisplayName("Search results displayed")
    @Disabled
    public void testSearch(){
        HomePage homePage = new HomePage(driver);
        Steps steps = new Steps(driver, homePage);
        steps.removeModalsMainPage();
        steps.clickSearchBtnAndSendKeysSearchInput("туфли");
        homePage.clickFirstItemSearchResults();
        Assertions.assertEquals("Туфли", homePage.getItemTitle());
    }

    @Test
    @DisplayName("Check number of search results displayed")
    @Disabled
    public void testSearchResultsNumber(){
        HomePage homePage = new HomePage(driver);
        Steps steps = new Steps(driver, homePage);
        steps.removeModalsMainPage();
        steps.clickSearchBtnAndSendKeysSearchInput("туфли");
        Assertions.assertEquals(40, homePage.getNumberOfSearchResults());
    }
}

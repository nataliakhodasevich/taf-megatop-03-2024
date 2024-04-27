package by.megatop.ui;

import by.megatop.pages.HomePage;
import by.megatop.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
    @DisplayName("Search results displayed")
    public void testSearch() {
        HomePage homePage = new HomePage();
        Steps steps = new Steps();
        steps.removeModalsMainPage();
        steps.clickSearchBtnAndSendKeysSearchInput("туфли");
        homePage.clickFirstItemSearchResults();
        String result = homePage.getItemTitle();
        Assertions.assertTrue(result.contains("Туфли"));
    }

    @Test
    @DisplayName("Check number of search results displayed")
    public void testSearchResultsNumber() {
        HomePage homePage = new HomePage();
        Steps steps = new Steps();
        steps.removeModalsMainPage();
        steps.clickSearchBtnAndSendKeysSearchInput("туфли");
        Assertions.assertEquals(40, homePage.getNumberOfSearchResults());
    }
}

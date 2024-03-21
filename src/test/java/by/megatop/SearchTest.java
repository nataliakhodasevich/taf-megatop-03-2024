package by.megatop;

import by.megatop.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    @DisplayName("Search results displayed")
    public void testSearch() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickYesCityBtn();
        homePage.clickYesCookie();
        homePage.clickSearchBtn();
        homePage.senKeysSearchInput("туфли");
        homePage.clickFirstItemSearchResults();
        Assertions.assertEquals("Tуфли", homePage.getItemTitle());
    }
}

package by.megatop.ui;
import by.megatop.pages.HomePage;
import by.megatop.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FavouritesTest extends BaseTest {
    @Test
    @DisplayName("Check not adding to favorites while not logged in")
    public void testAddToFavourites() {
        HomePage homePage = new HomePage();
        Steps steps = new Steps();
        steps.removeModalsMainPage();
        steps.openItemFromCatalog();
        homePage.clickAddToFavBtn();
        Assertions.assertEquals("Необходимо авторизоваться", homePage.getTextFavError());
    }
}

package by.megatop;

import by.megatop.pages.HomePage;
import by.megatop.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartTest extends BaseTest {

    @Test
    @DisplayName("Check item is added to cart")
    public void testItemAddedToCart() {
        HomePage homePage = new HomePage(driver);
        Steps steps = new Steps(driver, homePage);
        steps.removeModalsMainPage();
        steps.openItemFromCatalog();
        String expectedArticul = homePage.getTextProductPage();
        steps.addItemToCartStep();
        Assertions.assertTrue(homePage.getActualItemArticul().contains(expectedArticul));
    }
}

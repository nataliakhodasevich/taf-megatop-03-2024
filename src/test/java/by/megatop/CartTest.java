package by.megatop;

import by.megatop.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartTest extends BaseTest{

    @Test
    @DisplayName("Check item is added to cart")
    public void testItemAddedToCart(){
        HomePage homePage=new HomePage(driver);
        homePage.clickYesCityBtn();
        homePage.clickYesCookie();
        homePage.clickShoesBtn();
        homePage.clickCatalogSection();
        homePage.clickFirstCatalogItem();
        String expectedArticul=homePage.getTextProductPage();
        homePage.clickAddToCart();
        homePage.selectSizeAndAddToCart();
        homePage.goTooCartBtnClick();
        Assertions.assertTrue(homePage.getActualItemArticul().contains(expectedArticul));
    }
}

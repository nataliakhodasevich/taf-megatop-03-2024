package by.megatop.steps;

import by.megatop.pages.HomePage;
import by.megatop.driver.Driver;
import org.openqa.selenium.WebDriver;

public class Steps {
    WebDriver driver;
    HomePage homePage=new HomePage();

    public Steps() {
        this.driver = Driver.getDriver();

    }

    public void removeModalsMainPage() {
        homePage.clickYesCityBtn();
        homePage.clickYesCookie();
    }

    public void openItemFromCatalog() {
        homePage.clickShoesBtn();
        homePage.clickCatalogSection();
        homePage.clickFirstCatalogItem();
    }

    public void addItemToCartStep() {
        homePage.clickAddToCart();
        homePage.selectSizeAndAddToCart();
        homePage.goTooCartBtnClick();
    }

    public void clickSearchBtnAndSendKeysSearchInput(String item) {
        homePage.clickSearchBtn();
        homePage.senKeysSearchInput(item);
    }
}

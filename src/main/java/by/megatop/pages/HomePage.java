package by.megatop.pages;

import by.megatop.driver.Driver;
import by.megatop.util.WaiterHelper;
import org.openqa.selenium.*;
import org.awaitility.Awaitility;

import static java.util.concurrent.TimeUnit.*;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    public String getCopyRightText() {
        return driver.findElement(By.xpath(HomePageLocator.COPY_RIGHT_XPATH)).getText();
    }

    public void clickYesCookie() {
        driver.findElement(By.xpath(HomePageLocator.YES_COOKIE_BTN)).click();
    }

    public void clickYesCityBtn() {
        driver.findElement(By.xpath(HomePageLocator.SELECT_CITY_YES_BTN)).click();
    }

    public void clickLoginBtn() {
        driver.findElement(By.xpath(HomePageLocator.PROFILE_BTN_XPATH)).click();
    }

    public void clickSearchBtn() {
        driver.findElement(By.xpath(HomePageLocator.SEARCH_BTN)).click();
    }

    public void senKeysSearchInput(String item) {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.SEARCH_INPUT_XPATH);
        driver.findElement(By.xpath(HomePageLocator.SEARCH_INPUT_XPATH)).sendKeys(item);
        driver.findElement(By.xpath(HomePageLocator.SEARCH_INPUT_XPATH)).sendKeys(Keys.ENTER);
    }

    public int getNumberOfSearchResults() {
        WaiterHelper.waitAwaitilityUntilElementAppears(39, HomePageLocator.SEARCH_RESULTS_FIRST_ITEM);
        List<WebElement> results = driver.findElements(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM));
        return results.size();
    }

    public void clickFirstItemSearchResults() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.SEARCH_RESULTS_FIRST_ITEM);
        driver.findElement(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM)).click();
    }

    public String getItemTitle() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.SEARCH_RESULTS_FIRST_ITEM_TITLE);
        return driver.findElement(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM_TITLE)).getText();
    }

    public void clickShoesBtn() {
        driver.findElement(By.xpath(HomePageLocator.SHOES_MAIN_PAGE_BTN)).click();
    }

    public void clickCatalogSection() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.SANDALS_BTN_CATALOG);
        driver.findElement(By.xpath(HomePageLocator.SANDALS_BTN_CATALOG)).click();
    }

    public void clickFirstCatalogItem() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.SANDALS_FIRST_ITEM_XPATH);
        driver.findElement(By.xpath(HomePageLocator.SANDALS_FIRST_ITEM_XPATH)).click();
    }

    public String getTextProductPage() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.ARTICUL_EXPECTED_XPATH);
        return driver.findElement(By.xpath(HomePageLocator.ARTICUL_EXPECTED_XPATH)).getText();
    }

    public void clickAddToCart() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.ADD_TO_CART_BTN_ITEM_PAGE);
        driver.findElement(By.xpath(HomePageLocator.ADD_TO_CART_BTN_ITEM_PAGE)).click();
    }

    public void selectSizeAndAddToCart() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.SELECT_SIZE_XPATH);
        driver.findElement(By.xpath(HomePageLocator.SELECT_SIZE_XPATH)).click();
        driver.findElement(By.xpath(HomePageLocator.ADD_TO_CART_SIZE_MODAL_XPATH)).click();
    }

    public void goTooCartBtnClick() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.GO_TO_CART_BTN_XPATH);
        driver.findElement(By.xpath(HomePageLocator.GO_TO_CART_BTN_XPATH)).click();
    }

    public String getActualItemArticul() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.CART_ITEM_ARTICUL);
        return driver.findElement(By.xpath(HomePageLocator.CART_ITEM_ARTICUL)).getText();
    }

    public void deleteFromCartBtnClick() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.DELETE_FROM_CART_BTN_XPATH);
        driver.findElement(By.xpath(HomePageLocator.DELETE_FROM_CART_BTN_XPATH)).click();
    }

    public String getTextEmptyCart() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.CART_IS_EMPTY_TEXT_XPATH);
        return driver.findElement(By.xpath(HomePageLocator.CART_IS_EMPTY_TEXT_XPATH)).getText();
    }

    public void clickAddToFavBtn() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.ADD_TO_FAV_BTN_ITEM_PAGE);
        driver.findElement(By.xpath(HomePageLocator.ADD_TO_FAV_BTN_ITEM_PAGE)).click();
    }

    public String getTextFavError() {
        WaiterHelper.waitAwaitilityUntilElementAppears(0, HomePageLocator.FAV_ERROR_NOT_LOGGED);
        return driver.findElement(By.xpath(HomePageLocator.FAV_ERROR_NOT_LOGGED)).getText();
    }
}

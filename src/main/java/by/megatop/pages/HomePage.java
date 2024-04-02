package by.megatop.pages;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.awaitility.Awaitility;
import static java.util.concurrent.TimeUnit.*;
import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = Driver.getDriver();
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageLocator.SEARCH_INPUT_XPATH)));
        driver.findElement(By.xpath(HomePageLocator.SEARCH_INPUT_XPATH)).sendKeys(item);
        driver.findElement(By.xpath(HomePageLocator.SEARCH_INPUT_XPATH)).sendKeys(Keys.ENTER);
    }

    public int getNumberOfSearchResults() {
        Awaitility.await()
                .atMost(60, SECONDS)
                .pollInterval(100, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM)).size() > 39;
                });
        List<WebElement> results = driver.findElements(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM));
        return results.size();
    }

    public void clickFirstItemSearchResults() {
        Awaitility.await()
                .atMost(40, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM)).click();
    }

    public String getItemTitle() {
        Awaitility.await()
                .atMost(40, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM_TITLE)).size() > 0;
                });
        return driver.findElement(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM_TITLE)).getText();
    }

    public void clickShoesBtn() {
        driver.findElement(By.xpath(HomePageLocator.SHOES_MAIN_PAGE_BTN)).click();
    }

    public void clickCatalogSection() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.SANDALS_BTN_CATALOG)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.SANDALS_BTN_CATALOG)).click();
    }

    public void clickFirstCatalogItem() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.SANDALS_FIRST_ITEM_XPATH)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.SANDALS_FIRST_ITEM_XPATH)).click();
    }

    public String getTextProductPage() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.ARTICUL_EXPECTED_XPATH)).size() > 0;
                });
        return driver.findElement(By.xpath(HomePageLocator.ARTICUL_EXPECTED_XPATH)).getText();
    }

    public void clickAddToCart() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.ADD_TO_CART_BTN_ITEM_PAGE)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.ADD_TO_CART_BTN_ITEM_PAGE)).click();
    }

    public void selectSizeAndAddToCart() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.SELECT_SIZE_XPATH)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.SELECT_SIZE_XPATH)).click();
        driver.findElement(By.xpath(HomePageLocator.ADD_TO_CART_SIZE_MODAL_XPATH)).click();
    }

    public void goTooCartBtnClick() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.GO_TO_CART_BTN_XPATH)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.GO_TO_CART_BTN_XPATH)).click();
    }

    public String getActualItemArticul() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.CART_ITEM_ARTICUL)).size() > 0;
                });
        return driver.findElement(By.xpath(HomePageLocator.CART_ITEM_ARTICUL)).getText();
    }

    public void deleteFromCartBtnClick() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.DELETE_FROM_CART_BTN_XPATH)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.DELETE_FROM_CART_BTN_XPATH)).click();
    }

    public String getTextEmptyCart() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.CART_IS_EMPTY_TEXT_XPATH)).size() > 0;
                });
        return driver.findElement(By.xpath(HomePageLocator.CART_IS_EMPTY_TEXT_XPATH)).getText();
    }

    public void clickAddToFavBtn() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.ADD_TO_FAV_BTN_ITEM_PAGE)).size() > 0;
                });
        driver.findElement(By.xpath(HomePageLocator.ADD_TO_FAV_BTN_ITEM_PAGE)).click();
    }

    public String getTextFavError() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath(HomePageLocator.FAV_ERROR_NOT_LOGGED)).size() > 0;
                });
        return driver.findElement(By.xpath(HomePageLocator.FAV_ERROR_NOT_LOGGED)).getText();
    }
}

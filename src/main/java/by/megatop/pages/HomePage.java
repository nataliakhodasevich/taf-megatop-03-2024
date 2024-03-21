package by.megatop.pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.awaitility.Awaitility;

import static java.util.concurrent.TimeUnit.*;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = Driver.getDriver();
    }

    public String getCopyRightText() {
        return driver.findElement(By.xpath(HomePageLocator.COPY_RIGHT_XPATH)).getText();
    }

    public void clickLoginBtn() {
        driver.findElement(By.xpath(HomePageLocator.PROFILE_BTN_XPATH)).click();
    }

    public void clickYesCityBtn() {
        driver.findElement(By.xpath(HomePageLocator.SELECT_CITY_YES_BTN)).click();
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

    public void clickFirstItemSearchResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM)));
        driver.findElement(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM)).click();
    }

    public String getItemTitle() {
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(500, MILLISECONDS)
                .until(() -> {
                    // Здесь происходит поиск элемента
                    return driver.findElements(By.xpath("(//h1[@data-v-0944d46a]/span)[1]")).size() > 0;
                });
        return driver.findElement(By.xpath(HomePageLocator.SEARCH_RESULTS_FIRST_ITEM_TITLE)).getText();
    }

    public void clickYesCookie() {
        driver.findElement(By.xpath(HomePageLocator.YES_COOKIE_BTN)).click();
    }
}

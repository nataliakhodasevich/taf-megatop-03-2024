package by.megatop.util;

import by.megatop.driver.Driver;
import by.megatop.pages.HomePageLocator;
import by.megatop.pages.LoginPageLocator;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class WaiterHelper {

    public static void waitAwaitilityUntilElementAppears(int minNumberOfElements, String locator){
        Awaitility.await()
                .atMost(10, SECONDS)
                .pollInterval(100, MILLISECONDS)
                .until(() -> {
                    return Driver.getDriver().findElements(By.xpath(locator)).size() > minNumberOfElements;
                });
    }

    public static void waitElementTobeClickable(String locator){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}

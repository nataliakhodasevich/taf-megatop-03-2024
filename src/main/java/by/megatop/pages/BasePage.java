package by.megatop.pages;

import by.megatop.driver.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    public BasePage() {
        this.driver = Driver.getDriver();
    }

    public void openMainPage(String url) {
        driver = Driver.getDriver();
        driver.get(url);
    }
}

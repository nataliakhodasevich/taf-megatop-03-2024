package by.megatop.ui;

import by.megatop.driver.Driver;
import by.megatop.pages.BasePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    BasePage basePage = new BasePage();

    @BeforeEach
    public void warmUp() {
        basePage.openMainPage("https://megatop.by/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}

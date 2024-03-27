package by.megatop;

import by.megatop.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class HomePageTest extends BaseTest {
    @Test
    @DisplayName("Check the main page is opened")
    public void isPageOpened() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("© Megatop.\n" +
                "Все права защищены. 2023", homePage.getCopyRightText());
    }
}

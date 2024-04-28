package by.megatop.ui;

import by.megatop.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePageTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger(HomePageTest.class);
    @Test
    @DisplayName("Check the main page is opened")
    public void isPageOpened() {
        HomePage homePage = new HomePage();
        logger.info("Это информационное сообщение");
        Assertions.assertEquals("© Megatop.\n" +
                "Все права защищены. 2023", homePage.getCopyRightText());
    }
}

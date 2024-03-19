package by.megatop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    WebDriver driver;
    @Test
    public void isLoginPageOpened(){
        HomePage homePage=new HomePage(driver);
        homePage.clickLoginBtn();
        LoginPage loginPage= new LoginPage(driver);
        Assertions.assertEquals("Вход", loginPage.getLoginPageTitle());
    }
}

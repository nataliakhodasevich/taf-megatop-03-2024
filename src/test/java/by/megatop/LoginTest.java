package by.megatop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseTest{

    @Test
    public void isLoginPageOpened(){
        HomePage homePage=new HomePage(driver);
        homePage.clickYesCityBtn();
        homePage.clickLoginBtn();
        LoginPage loginPage= new LoginPage(driver);
        Assertions.assertEquals("ВХОД", loginPage.getLoginPageTitle());
    }

    @Test
    public void testPhonePwdEmpty(){
        HomePage homePage=new HomePage(driver);
        homePage.clickYesCityBtn();
        homePage.clickLoginBtn();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.clickLoginBtn();
        Assertions.assertEquals("Телефон обязательное поле", loginPage.getErrorText());
    }

    @Test
    public void testPhoneEmpty(){
        HomePage homePage=new HomePage(driver);
        homePage.clickYesCityBtn();
        homePage.clickLoginBtn();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.sendKeysPwd();
        loginPage.clickLoginBtn();
        Assertions.assertEquals("Телефон обязательное поле", loginPage.getErrorText());
    }

    @Test
    public void testPwdEmpty(){
        HomePage homePage=new HomePage(driver);
        homePage.clickYesCityBtn();
        homePage.clickLoginBtn();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.sendKeysPhone();
        loginPage.clickLoginBtn();

        Assertions.assertEquals("Вы ввели неверный номер телефона и/или пароль", loginPage.getErrorText());
    }

}

package by.megatop;
import by.megatop.pages.HomePage;
import by.megatop.pages.LoginPage;
import by.megatop.steps.Steps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Check page is opened")
    public void isLoginPageOpened() {
        HomePage homePage = new HomePage(driver);
        Steps steps=new Steps(driver,homePage);
       steps.removeModalsMainPage();
        homePage.clickLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertEquals("ВХОД", loginPage.getLoginPageTitle());
    }

    @Test
    @DisplayName("Check login with both fields empty")
    public void testPhonePwdEmpty() {
        HomePage homePage = new HomePage(driver);
        Steps steps=new Steps(driver,homePage);
        steps.removeModalsMainPage();
        homePage.clickLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginBtn();
        Assertions.assertEquals("Телефон обязательное поле", loginPage.getErrorText());
    }

    @Test
    @DisplayName("Check login with phone empty")
    public void testPhoneEmpty() {
        HomePage homePage = new HomePage(driver);
        Steps steps=new Steps(driver,homePage);
        steps.removeModalsMainPage();
        homePage.clickLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysPwd();
        loginPage.clickLoginBtn();
        Assertions.assertEquals("Телефон обязательное поле", loginPage.getErrorText());
    }

    @Test
    @DisplayName("Check login with password empty")
    public void testPwdEmpty() {
        HomePage homePage = new HomePage(driver);
        Steps steps=new Steps(driver,homePage);
        steps.removeModalsMainPage();
        homePage.clickLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysPhone();
        loginPage.clickLoginBtn();
        Assertions.assertEquals("Вы ввели неверный номер телефона и/или пароль", loginPage.getErrorText());
    }

    @Test
    @DisplayName("Check login with password and phone invalid")
    public void testPwdPhoneInvalid() {
        HomePage homePage = new HomePage(driver);
        Steps steps=new Steps(driver,homePage);
        steps.removeModalsMainPage();
        homePage.clickLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysPhone();
        loginPage.sendKeysPwd();
        loginPage.clickLoginBtn();
        Assertions.assertEquals("Вы ввели неверный номер телефона и/или пароль", loginPage.getErrorText());
    }
}

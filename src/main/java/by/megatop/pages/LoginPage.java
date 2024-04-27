package by.megatop.pages;
import by.megatop.util.Utils;
import by.megatop.driver.Driver;
import by.megatop.util.WaiterHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    public String getLoginPageTitle() {
        WaiterHelper.waitElementTobeClickable(LoginPageLocator.PHONE_XPATH);
        return driver.findElement(By.xpath(LoginPageLocator.LOGIN_PAGE_TITLE_XPATH)).getText();
    }

    public void clickPhoneInput() {
        driver.findElement(By.xpath(LoginPageLocator.PHONE_XPATH)).click();
    }

    public void sendKeysPhone() {
        WaiterHelper.waitElementTobeClickable(LoginPageLocator.PHONE_XPATH);
        clickPhoneInput();
        driver.findElement(By.xpath(LoginPageLocator.PHONE_XPATH)).sendKeys(Utils.generateNumber());
    }

    public void clickLoginBtn() {
        WaiterHelper.waitElementTobeClickable(LoginPageLocator.PHONE_XPATH);
        driver.findElement(By.xpath(LoginPageLocator.LOGIN_BTN_XPATH)).click();
    }

    public String getErrorText() {
        WaiterHelper.waitElementTobeClickable(LoginPageLocator.ERROR_WRONG_PHONE_OR_PWD);
        return driver.findElement(By.xpath(LoginPageLocator.ERROR_WRONG_PHONE_OR_PWD)).getText();
    }

    public void sendKeysPwd() {
        WaiterHelper.waitElementTobeClickable(LoginPageLocator.PWD_XPATH);
        driver.findElement(By.xpath(LoginPageLocator.PWD_XPATH)).sendKeys(Utils.generatePassword(8));
    }
}

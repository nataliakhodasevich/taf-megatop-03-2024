package by.megatop;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    LoginPage(WebDriver driver) {
        this.driver = Driver.getDriver();
    }

    public String getLoginPageTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocator.PHONE_XPATH)));
        return driver.findElement(By.xpath(LoginPageLocator.LOGIN_PAGE_TITLE_XPATH)).getText();
    }

    public void clickPhoneInput(){
        driver.findElement(By.xpath(LoginPageLocator.PHONE_XPATH)).click();
    }

    public void sendKeysPhone(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocator.PHONE_XPATH)));
        clickPhoneInput();

        driver.findElement(By.xpath(LoginPageLocator.PHONE_XPATH)).sendKeys(Utils.generateNumber());
    }

    public void clickLoginBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocator.PHONE_XPATH)));
        driver.findElement(By.xpath(LoginPageLocator.LOGIN_BTN_XPATH)).click();
    }

    public String getErrorText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocator.PHONE_XPATH)));
       return driver.findElement(By.xpath(LoginPageLocator.ERROR_WRONG_PHONE_OR_PWD)).getText();
    }

    public void sendKeysPwd(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LoginPageLocator.PWD_XPATH)));


        driver.findElement(By.xpath(LoginPageLocator.PWD_XPATH)).sendKeys(Utils.generateNumber());
    }
}

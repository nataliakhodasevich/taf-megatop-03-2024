package by.megatop;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    LoginPage(WebDriver driver) {
        this.driver = Driver.getDriver();
    }

    public String getLoginPageTitle(){
        return driver.findElement(By.xpath(LoginPageLocator.LOGIN_PAGE_TITLE_XPATH)).getText();
    }
}

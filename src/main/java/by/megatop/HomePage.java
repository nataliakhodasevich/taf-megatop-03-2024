package by.megatop;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    HomePage(WebDriver driver) {
        this.driver = Driver.getDriver();
    }

    public String getCopyRightText(){
       return driver.findElement(By.xpath(HomePageLocator.COPY_RIGHT_XPATH)).getText();
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;
    String url;

    public BasePage(WebDriver driver, String url){
        this.driver = driver;
        this.url = url;
    }

    public boolean isPageDisplayed(){
        return url.equals(driver.getCurrentUrl());
    }
    public WebElement getElement(By by){
        return driver.findElement(by);
    }
}

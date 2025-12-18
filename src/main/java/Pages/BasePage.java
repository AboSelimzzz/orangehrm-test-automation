package Pages;

import PageSections.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    HeaderSection headerSection;
    String url;
    SidePanel sidePanel;

    public BasePage(WebDriver driver){
        this.driver = driver;
        sidePanel = new SidePanel();
        headerSection = new HeaderSection();
    }

    public boolean isPageDisplayed(){
        return url.equals(driver.getCurrentUrl());
    }
    public WebElement getElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public PIMPage goToPIMPage(){
        getElement(sidePanel.getPimButton()).click();
        return new PIMPage(driver);
    }

    public TimePage goToTimePage(){
        getElement(sidePanel.getTimeButton()).click();
        return new TimePage(driver);
    }

    public DashboardPage goToDashboardPage(){
        getElement(sidePanel.getDashboardButton()).click();
        return new DashboardPage(driver);
    }
    public AdminPage goToAdminPage(){
        getElement(sidePanel.getAdminButton()).click();
        return new AdminPage(driver);
    }

    public String getPageName(){
        return getElement(headerSection.getPageName()).getText();
    }
    public void logout(){
        getElement(headerSection.getProfileButton()).click();
        getElement(headerSection.getLogoutButton()).click();
    }
}

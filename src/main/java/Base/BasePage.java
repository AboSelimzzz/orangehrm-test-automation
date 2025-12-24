package Base;

import PageSections.*;
import Pages.Admin.*;
import Pages.*;
import Pages.PIM.*;
import Pages.Time.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected String url;
    protected WebDriverWait wait;
    HeaderSection headerSection;
    SidePanel sidePanel;

    public BasePage(WebDriver driver){
        this.driver = driver;
        sidePanel = new SidePanel();
        headerSection = new HeaderSection();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isPageDisplayed(){
        return url.equals(driver.getCurrentUrl());
    }

    public AdminPage goToAdminPage(){
        click(sidePanel.getAdminButton());
        return new AdminPage(driver);
    }

    public PIMPage goToPIMPage(){
        click(sidePanel.getPimButton());
        return new PIMPage(driver);
    }

    public DashboardPage goToDashboardPage(){
        click(sidePanel.getDashboardButton());
        return new DashboardPage(driver);
    }

    public TimePage goToTimePage(){
        click(sidePanel.getTimeButton());
        return new TimePage(driver);
    }

    public EmployeeProfilePage goToMyInfoPage(){
        click(sidePanel.getMyInfoButton());
        return new EmployeeProfilePage(driver);
    }

    public String getPageName(){
        return getText(headerSection.getPageName());
    }

    public LoginPage logout(){
        click(headerSection.getProfileButton());
        click(headerSection.getLogoutButton());
        return new LoginPage(driver);
    }

    public void scrollDownTo(WebElement e){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
    }

    public void type(By locator, String text){
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public String getText(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    public WebElement getElement(By by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitToPageToLoad(String pageUrl){
        wait.until(ExpectedConditions.urlContains(pageUrl));
    }

    public void chooseFromDropDown(By dropDown, String desired){
        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/div[@role='option']/span"));
        click(dropDown);
        for(WebElement option: options){
            if(option.getText().equals(desired)){
                option.click();
                return;
            }
        }
    }
}

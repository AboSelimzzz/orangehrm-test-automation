package Pages.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UserManagementPage extends AdminPage{
    private final By usernameField;
    private final By searchButton;
    private By users;

    public UserManagementPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers/187";
        this.usernameField = By.xpath("//input[@class = 'oxd-input oxd-input--active' and parent::div[@class='']]");
        this.searchButton = By.cssSelector("button[type='submit']");
        this.users = By.cssSelector("div[class='oxd-table-row oxd-table-row--with-border'][role='row']");
    }
    public boolean isExisted (String username){
        List<WebElement> users = driver.findElements(this.users);
        for(WebElement user : users){
            String searchedUsername = user.findElement(By.xpath("//div[text()='Username']")).getText();
            if(searchedUsername.equals(username)){
                return true;
            }
        }
        return false;
    }
    public WebElement searchByUsername(String username){
        type(usernameField, username);
        click(searchButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> !d.findElements(this.users).isEmpty());
        List<WebElement> users = driver.findElements(this.users);
        for (int i = 1; i < users.size(); i++) {
            WebElement user = users.get(i);
            String searchedUsername = user.findElement(
                    By.xpath(".//div[@role='cell'][2]/div")).getText();
            if (searchedUsername.equals(username)) {
                return user;
            }
        }
        return null;
    }
    public EditEmployeePage openEmployeePage(String username){
        WebElement user = searchByUsername(username);
        user.findElement(By.xpath(".//i[@class='oxd-icon bi-pencil-fill']")).click();
        return new EditEmployeePage(driver);
    }
}

package Pages.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserManagementPage extends AdminPage{
//    private final By usernameField;
//    private final By searchButton;
//    private final By users;
//    private By role;

    public UserManagementPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
//        this.usernameField = By.xpath("//input[@class = 'oxd-input oxd-input--active']/parent::div[@class='']");
//        this.searchButton = By.cssSelector("button[type='submit']");
//        this.users = By.className("card-center");
    }
//    public boolean isExisted (String username){
//        List<WebElement> users = driver.findElements(this.users);
//        for(WebElement user : users){
//            String searchedUsername = user.findElement(By.xpath("//div[text()='Username']")).getText();
//            if(searchedUsername.equals(username)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public WebElement searchByUsername(String username){
//        if(!isExisted(username))
//            return null;
//        getElement(usernameField).sendKeys(username);
//        getElement(searchButton).click();
//        List<WebElement> users = driver.findElements(this.users);
//        for(WebElement user : users){
//            String searchedUsername = user.findElement(By.xpath("//div[text()='Username']")).getText();
//            if(searchedUsername.equals(username)){
//                return user;
//            }
//        }
//        return null;
//    }
//    public void editUser(String username, String role){
//        WebElement user = searchByUsername(username);
//        user.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
//        getElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
//    }

}

package Pages;

import org.openqa.selenium.*;

public class AdminPage extends BasePage{

    public AdminPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
    }
}

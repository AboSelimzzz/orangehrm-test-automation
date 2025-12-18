package Pages;

import org.openqa.selenium.*;

public class PIMPage extends BasePage{

    public PIMPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
    }
}

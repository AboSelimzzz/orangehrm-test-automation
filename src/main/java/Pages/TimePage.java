package Pages;

import org.openqa.selenium.*;

public class TimePage extends BasePage{

    public TimePage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet";
    }
}

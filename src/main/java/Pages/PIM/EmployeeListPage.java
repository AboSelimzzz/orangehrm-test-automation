package Pages.PIM;

import Base.BasePage;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage extends PIMPage {

    public EmployeeListPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
    }
}

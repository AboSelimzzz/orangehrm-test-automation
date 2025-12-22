package Pages.PIM.EmployeeInfo;

import Base.BasePage;
import Pages.PIM.EmployeeProfilePage;
import org.openqa.selenium.WebDriver;

public class PersonalDetailsPage extends EmployeeProfilePage {

    public PersonalDetailsPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/";
    }
}

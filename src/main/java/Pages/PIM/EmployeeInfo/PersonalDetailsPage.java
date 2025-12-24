package Pages.PIM.EmployeeInfo;

import Base.BasePage;
import Pages.Admin.UserManagementPage;
import Pages.PIM.EmployeeProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PersonalDetailsPage extends EmployeeProfilePage {
    private final By nationalityButton;
    private final By martialStatusButton;
    private final By saveButton;


    public PersonalDetailsPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/";
        nationalityButton = By.xpath("//label[text()='Nationality']/following::div[contains(@class,'oxd-select-text')][1]");
        martialStatusButton = By.xpath("//label[text()='Marital Status']/following::div[contains(@class,'oxd-select-text')][1]");
        saveButton = By.cssSelector("button[type='submit']");
    }

    public void changeNationality(String nationality){
        chooseFromDropDown(nationalityButton, nationality);
    }

    public void changeMartialStatus(String status){
        chooseFromDropDown(martialStatusButton, status);
    }

    public void saveChanges(){click(saveButton);}
}

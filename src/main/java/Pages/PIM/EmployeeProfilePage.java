package Pages.PIM;

import Pages.PIM.EmployeeInfo.DependentsPage;
import Pages.PIM.EmployeeInfo.EmergencyContactsPage;
import Pages.PIM.EmployeeInfo.PersonalDetailsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeProfilePage extends PIMPage {

    private final By personalDetailsButton;
    private final By emergencyContactsButton;
    private final By dependentsButton;

    public EmployeeProfilePage(WebDriver driver){
        super(driver);
        personalDetailsButton = By.cssSelector("a[href*='viewPersonalDetails']");
        emergencyContactsButton = By.cssSelector("a[href*='viewEmergencyContacts']");
        dependentsButton = By.cssSelector("a[href*='viewDependents']");
    }

    public PersonalDetailsPage OpenPersonalDetailsPage(){
        click(personalDetailsButton);
        return new PersonalDetailsPage(driver);
    }

    public EmergencyContactsPage openEmergencyContacts() {
        click(emergencyContactsButton);
        return new EmergencyContactsPage(driver);
    }

    public DependentsPage openDependents() {
        click(dependentsButton);
        return new DependentsPage(driver);
    }
}

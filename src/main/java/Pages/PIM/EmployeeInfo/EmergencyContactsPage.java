package Pages.PIM.EmployeeInfo;

import Base.BasePage;
import Pages.PIM.EmployeeProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmergencyContactsPage extends EmployeeProfilePage {

    private final By addButton;

    private final By nameField;
    private final By relationshipField;
    private final By homeTelephoneField;
    private final By mobileField;
    private final By workTelephoneField;

    private final By saveButton;

    public EmergencyContactsPage(WebDriver driver){
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmergencyContacts/empNumber/";
        addButton = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--text'][@type='button'])[1]");

        nameField = By.xpath("//label[text()='Name']/following::input[1]");
        relationshipField = By.xpath("//label[text()='Relationship']/following::input[1]");
        homeTelephoneField = By.xpath("//label[text()='Home Telephone']/following::input[1]");
        mobileField = By.xpath("//label[text()='Mobile']/following::input[1]");
        workTelephoneField = By.xpath("//label[text()='Work Telephone']/following::input[1]");

        saveButton = By.cssSelector("button[type='submit']");
    }

    public void addEmergencyContact(String name, String relationship, String home, String mobile, String work){
        click(addButton);
        type(nameField, name);
        type(relationshipField, relationship);
        type(homeTelephoneField, home);
        type(mobileField, mobile);
        type(workTelephoneField, work);

        click(saveButton);
    }
}

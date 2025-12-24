package Pages.PIM.EmployeeInfo;

import Pages.PIM.EmployeeProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactDetailsPage extends EmployeeProfilePage{
    private final By street1Field;
    private final By street2Field;
    private final By cityField;
    private final By stateField;
    private final By postalCodeField;
    private final By countryField;
    private final By saveButton;

    public ContactDetailsPage(WebDriver driver){
        super(driver);
        street1Field = By.cssSelector("//label[text()='Street 1']/following::input[1]");
        street2Field = By.cssSelector("//label[text()='Street 2']/following::input[1]");
        cityField = By.cssSelector("//label[text()='City']/following::input[1]");
        stateField = By.cssSelector("//label[text()='State/Province']/following::input[1]");
        postalCodeField = By.cssSelector("//label[text()='Zip/Postal Code']/following::input[1]");
        countryField = By.className("oxd-select-text-input");
        saveButton = By.cssSelector("button[type='submit']");
    }

    public void changeContactDetails(String street1, String street2, String city, String state, String postalCode, String country){
        type(street1Field, street1);
        type(street2Field, street2);
        type(cityField, city);
        type(stateField, state);
        type(postalCodeField, postalCode);
        chooseFromDropDown(countryField, "Egypt");
        click(saveButton);
    }
}

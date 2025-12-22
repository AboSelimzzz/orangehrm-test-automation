package Tests;

import DataDriven.ExcelFileManager;
import DataDriven.JSONFileManager;
import Pages.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    JSONFileManager jsonFileManager;
    ExcelFileManager excelFileManager;

    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage =new LoginPage(driver);
        assertTrue(loginPage.isPageDisplayed(), "Error: The Login page is not displayed!!");
        excelFileManager = new ExcelFileManager("src/main/resources/Excel File.xlsx");
        jsonFileManager = new JSONFileManager("src/main/resources/JSON File.json");
    }

    @AfterMethod
    public void shutDown(){
        driver.quit();
    }

    public void assertTrue(boolean condition, String message){
        Assert.assertTrue(condition, message);
    }

    public void assertEquals(String s1, String s2, String message){
        Assert.assertEquals(s1, s2, message);
    }

}

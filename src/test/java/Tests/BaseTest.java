package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterMethod
    public void shutDown(){
        driver.quit();
    }

    public void assertTrue(boolean condition, String message){
        Assert.assertTrue(condition, message);
    }
    public void assertEquals(String s1, String s2){
        Assert.assertEquals(s1, s2);
    }
}

package Tests;

import Pages.DashboardPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void something(){
        LoginPage loginPage =new LoginPage(driver);
        assertTrue(loginPage.isPageDisplayed(), "Error: The Login page is not displayed!!");
        DashboardPage dashboardPage = loginPage.login("Admin", "admin123");
        assertTrue(dashboardPage.isPageDisplayed(), "Error: The Dashboard is not displayed!!");
        assertEquals(dashboardPage.getPageName(), "Dashboard", "Error the Dashboard page name is incorrect");
        dashboardPage.logout();
    }
}

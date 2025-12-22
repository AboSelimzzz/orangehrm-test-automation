package Tests;

import DataClasses.EmployeeData;
import DataDriven.EmployeeDataProviders;
import Pages.Admin.AdminPage;
import Pages.DashboardPage;
import Pages.PIM.PIMPage;
import org.testng.annotations.*;

public class AddEmployeeTest extends BaseTest{
    PIMPage pimPage;

    @BeforeMethod
    public void login(){
        DashboardPage dashboardPage = loginPage.login("Admin", "admin123");
        assertTrue(dashboardPage.isPageDisplayed(), "Error: The Dashboard is not displayed!!");
        assertEquals(dashboardPage.getPageName(), "Dashboard", "Error the Dashboard page name is incorrect");
        pimPage = dashboardPage.goToPIMPage();
        assertTrue(pimPage.isPageDisplayed(), "Error: The PIM Page is not dispalyed");
        assertEquals(pimPage.getPageName(), "PIM", "Error: THe PIM Page name is incorrect");
    }

    @Test (dataProvider = "validEmployeeDataProvider", dataProviderClass = EmployeeDataProviders.class)
    public void addValidEmployee(EmployeeData data){
        pimPage.AddEmployee(data);
        AdminPage adminPage = pimPage.goToAdminPage();
        if(adminPage.searchByUsername(data.username) != null)
            adminPage.scrollDownTo(adminPage.searchByUsername(data.username));

    }
    @Test
    public void addValidEmployee(){
        pimPage.AddEmployee(createEmployee());
        AdminPage adminPage = pimPage.goToAdminPage();

    }
}

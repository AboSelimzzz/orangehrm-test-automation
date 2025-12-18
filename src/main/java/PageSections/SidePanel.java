package PageSections;

import org.openqa.selenium.*;

public class SidePanel {
    private final By adminButton;
    private final By pimButton;
    private final By timeButton;
    private final By dashboardButton;

    public SidePanel(){
        this.adminButton = By.linkText("Admin");
        this.pimButton = By.linkText("PIM");
        this.timeButton = By.linkText("Time");
        this.dashboardButton = By.linkText("Dashboard");
    }

    public By getAdminButton() {
        return adminButton;
    }

    public By getPimButton() {
        return pimButton;
    }

    public By getTimeButton() {
        return timeButton;
    }

    public By getDashboardButton() {
        return dashboardButton;
    }
}

package utils;

import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializers {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    public static void initializePageObjects() {
        // initializing objects of the LoginPage class
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
    }
}

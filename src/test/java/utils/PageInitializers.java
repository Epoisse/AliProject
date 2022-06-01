package utils;

import pages.LoginPage;

public class PageInitializers {

    public static LoginPage loginPage;

    public static void initializePageObjects() {
        // initializing objects of the LoginPage class
        loginPage = new LoginPage();
    }
}

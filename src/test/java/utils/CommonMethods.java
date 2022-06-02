package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods extends PageInitializers{

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication() {
        // open the Browser
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertiesValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        // launching the application and to do so we need to provide the url (the link)
        driver.get(ConfigReader.getPropertiesValue("url"));
        initializePageObjects();
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.sendKeys(text);
    }
}

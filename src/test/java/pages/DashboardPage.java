package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(xpath = "//div[@class='menu']/ul/li")
    public List<WebElement> menuTabs;

    @FindBy(linkText = "PIM")
    public WebElement pimTab;

    @FindBy(id = "btnAdd")
    public WebElement addButton;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}

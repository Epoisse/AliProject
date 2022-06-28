package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "middleName")
    public WebElement middleNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "employeeId")
    public WebElement empIdLocator;

    @FindBy(id = "photofile")
    public WebElement photograph;

    @FindBy(id = "chkLogin")
    public WebElement checkbox;

    @FindBy(id = "user_name")
    public WebElement createUsername;

    @FindBy(id = "user_password")
    public WebElement createPassword;

    @FindBy(id = "re_password")
    public WebElement confirmPassword;

    @FindBy(id = "status")
    public WebElement statusDD;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public AddEmployeePage() {
        PageFactory.initElements(driver,this);
    }
}

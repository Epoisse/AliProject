package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {


    @And("user clicks on PIM option")
    public void userClicksOnPIMOption() {
        click(dashboardPage.pimTab);
    }

    @And("user clicks on Add employee option")
    public void userClicksOnAddEmployeeOption() {
        click(dashboardPage.addButton);
    }

    @When("user enters firstname, middle name, and last name")
    public void userEntersFirstnameMiddleNameAndLastName() {
        sendText(addEmployeePage.firstNameField, "John");
        sendText(addEmployeePage.middleNameField, "Jr");
        sendText(addEmployeePage.lastNameField, "Biden");
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        click(addEmployeePage.saveButton);
    }

    @Then("employee is added successfully")
    public void employeeIsAddedSuccessfully() {
        System.out.println("Fantastic");
    }
}

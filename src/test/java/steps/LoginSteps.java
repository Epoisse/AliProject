package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {

    @Given("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        sendText(loginPage.usernameField, "admin");
        sendText(loginPage.passwordField, "Hum@nhrm123");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        //click(loginPage.loginButton);
    }
    @Then("admin user is navigated to dashboard page")
    public void admin_user_is_navigated_to_dashboard_page() {
        System.out.println("Everything is great");
    }
}

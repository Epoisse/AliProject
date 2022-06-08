package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {

    @Then("admin user verifies all the dashboard tabs")
    public void admin_user_verifies_all_the_dashboard_tabs(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedTabs = dataTable.asList();
        List<String> actualTabs = new ArrayList<>();

        for (WebElement tabs :
                dashboardPage.menuTabs) {
            actualTabs.add(tabs.getText());
        }

        System.out.println(actualTabs);
        System.out.println(expectedTabs);

        Assert.assertTrue(actualTabs.equals(expectedTabs));
    }
}

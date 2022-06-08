package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.CommonMethods;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        // glue is where we find implementations for our feature files
        // we provide the path of package to get all the steps definitions
        glue = "steps",
        dryRun = false,
        monochrome = true,
        tags = "@dashboard"
)

public class RunnerClass {
}

package steps;


import io.cucumber.java.Before;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void start() {
        openBrowserAndLaunchApplication();
    }
    //@After
}

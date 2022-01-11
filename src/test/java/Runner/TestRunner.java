package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/Features",
		glue= {"stepDefinitions"},
		plugin = {"pretty"},
		monochrome = true,
		strict= true,
		dryRun = false
		        )

public class TestRunner {

}

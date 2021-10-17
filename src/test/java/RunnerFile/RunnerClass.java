package RunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFiles",
				 glue = "StepDefinitionFile",
				 dryRun = false,
				 plugin = {"pretty","html:target/report.html","json:target/report.json","junit:target/report.xml"},
				 monochrome = true,
				 stepNotifications = true,
				 strict = true,
				 tags = "@test"
				)
public class RunnerClass { 

}

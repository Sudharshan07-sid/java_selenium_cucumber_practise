package testrunner;  // Add this as the very first line

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {".//feature/Irctc.feature"},
    glue = "com.stepdefenation",
    dryRun = false,
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
)
public class Runner2 {
}

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
    plugin = {"pretty", "html:test-output/cucumber-report.html", "json:target/cucumber.json", "rerun:target/failed_scenarios.txt"}
)
public class Runner2 {
}

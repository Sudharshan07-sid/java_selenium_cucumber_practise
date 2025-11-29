package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "@target/failed_scenarios.txt",   // <--- READ FROM FILE
    glue = "com.stepdefenation",
    monochrome = true,
    plugin = {"pretty", "html:test-output/rerun-report.html"}
)
public class RerunFailed {
}

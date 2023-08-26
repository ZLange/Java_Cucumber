package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// needed annotations in brackets
@CucumberOptions(features = "src/test/java/features",
        glue = "stepDefinitions", monochrome = true )
// to run tests with cucumber need to extend with class -> AbstractTestNGCucumberTests
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

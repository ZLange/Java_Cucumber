package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// needed annotations in brackets to add feature file(add path), for steps only folder name
@CucumberOptions(features = "src/test/java/features",
        glue = "stepDefinitions", monochrome = true ) // monochrome by default is true
// to run tests with cucumber need to extend with class -> AbstractTestNGCucumberTests
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

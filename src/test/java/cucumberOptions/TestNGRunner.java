package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*
needed annotations in brackets to add feature file(add path), for steps only folder name
features -> add full path of features file
glue -> add name of step definition file (code part)
monochrome - > by default true
tags - > to select what tests to run and to order them
plugin -> to generate reports/pretty adds colors
dryRun -> if true won't run tests if something is missing
 */
@CucumberOptions(features = "src/test/java/features",
        glue = "stepDefinitions", monochrome = true, tags="@SmokeTest or @RegressionTest",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
// to run tests with cucumber need to extend with class -> AbstractTestNGCucumberTests
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

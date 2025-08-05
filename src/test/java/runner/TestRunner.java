package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features/login.feature",glue = "stepsdef", tags = "@Regression or @Sanity", plugin ={"pretty", "html:target/report/LoginReport.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}


/*features = "src/main/resources/features" , glue = "stepsdef" , plugin = {"pretty" , "html:target/reports/report.html"}

 */
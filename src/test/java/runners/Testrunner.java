package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features" ,
		glue = "Steps"
		)
public class Testrunner extends AbstractTestNGCucumberTests {
 
}

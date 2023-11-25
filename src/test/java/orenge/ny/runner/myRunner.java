package orenge.ny.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "./Features/" },

		glue = "orenge.ny.stepdefenition"

)

public class myRunner extends AbstractTestNGCucumberTests {

}

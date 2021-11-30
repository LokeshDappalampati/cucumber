package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:\\radic workspace\\Cucumber\\src\\main\\resources\\Features\\google.feature",
glue="stepDefinitions"
				   
					)
public class TestRunner {

}

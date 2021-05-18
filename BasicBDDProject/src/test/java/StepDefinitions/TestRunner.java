package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFile", glue = "StepDefinitions",				
				 plugin = {"pretty",
				 		  "json:target/cucumber/cucumber.json"	})
public class TestRunner {


}

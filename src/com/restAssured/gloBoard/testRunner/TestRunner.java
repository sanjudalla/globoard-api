package com.restAssured.gloBoard.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features = "src//Feature", 
					glue = {"com.restAssured.gloBoard.stepDefinition"},
					format = {"pretty", "html:./Output"},
					tags= {"@smoke","@regression"}
)
				

public class TestRunner extends BaseClass {
	
	
	
	}
		
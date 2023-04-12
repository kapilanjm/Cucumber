package org.cucumberclass;

import org.junit.runner.RunWith;
import org.stepdefinitions.*;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "org.stepdefinitions",dryRun = false)
public class NileAirlines {
		
}

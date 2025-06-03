package org.cucumberclass;

import org.junit.runner.RunWith;
import org.stepdefinitions.*;
import io.cucumber.junit.*;
import cucumber.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/", glue = "org.stepdefinitions",plugin={"pretty","html:TheCucumber/target/reports"}, monochrome= true,dryRun = false)
public class NileAirlines {
		
}

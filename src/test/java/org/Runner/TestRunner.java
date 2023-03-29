package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
		features ="src/test/resources/Features",
		glue= {"org.stepdefinitions"},
		//tags="@tag33",
			plugin = {"json:target/cucumber.json"}

		)
public class TestRunner {
	
}

package com.cucumber.LLMavenCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //allows us to run test as junit
/*
@CucumberOptions(
		format = {"pretty" , "html:target/html"},
		features = "src/test/resource")
*/

@CucumberOptions( plugin = {"pretty", "html:target/html/"},
							features = "src/test/resource") 

public class RunnerTest {

}

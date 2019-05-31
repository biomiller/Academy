package com.bae.CucumberPractice.TeaTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\CucumberPractice\\src\\test\\java\\com\\bae\\CucumberPractice\\TeaTest\\TeaTesting.feature", glue = {"com.bae.CucumberPractice.TeaTest"})

public class Runner {
	
	
	
}

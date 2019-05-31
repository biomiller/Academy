package com.bae.CucumberPractice.Parametisation;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import java.io.File;

public class Tests {
	
	public static WebDriver driver;
	public static Actions actions;
	
	public static WebDriverWait wait;


	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 4);
	}
	
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
		
		driver.manage().window().maximize();
		driver.navigate().to(arg1);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
		
		WebElement searchBox = driver.findElement(By.id("sb_form_q"));
		actions.moveToElement(searchBox).click().perform();
		actions.moveToElement(searchBox).sendKeys(arg1).perform();
		WebElement go = driver.findElement(By.name("go"));
		actions.moveToElement(go).click().perform();
	}

	@Then("^I am taken to a list of data of \"([^\"]*)\" for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search(String arg1) {
		
		System.out.println(arg1.replace(" ", "+"));
		System.out.println(driver.getCurrentUrl());
		String urlTerm =  driver.getCurrentUrl();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());


		
		assertTrue(urlTerm.contains(arg1.replace(" ", "+")));
				
	}
	
	@After
	public void finalise() {
		driver.quit();

	}



}

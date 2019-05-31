package com.bae.CucumberPractice.TeaTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tests {

	public static WebDriver driver;
	public static Actions actions;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
	}
	
	@After
	public void finalise() {
		driver.quit();

	}

	@Given("^the correct web address$")
	public void the_correct_web_address() {

		// Write code here that turns the phrase above into concrete actions

		driver.manage().window().maximize();
		driver.navigate().to(Constant.URL);
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {

		WebElement menuButton = driver
				.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
		actions.moveToElement(menuButton).click().perform();

	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.practiceselenium.com/menu.html");
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {

		WebElement menuButton = driver
				.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a"));
		actions.moveToElement(menuButton).click().perform();

		WebElement checkoutButton = driver.findElement(By.linkText("Check Out"));
		actions.moveToElement(checkoutButton).click().perform();


	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.practiceselenium.com/check-out.html");
		// Write code here that turns the phrase above into concrete actions
	}



}

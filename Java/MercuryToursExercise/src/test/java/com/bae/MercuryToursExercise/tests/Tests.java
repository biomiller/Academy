package com.bae.MercuryToursExercise.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@AfterClass
	public static void teardown() {
		driver.quit(); // Must quit or will continue to run in background!
	}

	
	@Test
	public void test1() throws InterruptedException {
		
		String username = "Mr_Bun";
		String password = "Baker";
		
		Actions action = new Actions(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		driver.navigate().to(Constant.URL);
		
		WebElement signOn = driver.findElement(By.linkText("SIGN-ON"));
		//wait.until(ExpectedConditions.visibilityOf(signOn));
		action.moveToElement(signOn).click().perform();
		
		WebElement registerLink = driver.findElement(By.linkText("registration form"));
		action.moveToElement(registerLink).click().perform();
		
		WebElement registerUsernameBox = driver.findElement(By.id("email"));
		registerUsernameBox.sendKeys(username);
		
		WebElement passwordBox = driver.findElement(By.name("password"));
		passwordBox.sendKeys(password);
		
		WebElement confirmPasswordBox = driver.findElement(By.name("confirmPassword"));
		confirmPasswordBox.sendKeys(password);
		
		WebElement registerButton = driver.findElement(By.name("register"));
		registerButton.submit();
		
		
		


		
		
		Thread.sleep(2000);
				
		
		
		
		
	}
	
}

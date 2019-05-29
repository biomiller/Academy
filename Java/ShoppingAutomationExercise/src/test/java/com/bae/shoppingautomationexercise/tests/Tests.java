package com.bae.shoppingautomationexercise.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Tests {
	
	public static WebDriver driver;
	String url = "http://automationpractice.com/index.php";
	
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
		
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).submit();
		
		
		assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[7]/div/div[2]/h5/a")).isDisplayed());
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[7]/div/div[2]/h5/a")).click();
		
		WebElement submitButton = driver.findElement(By.name("Submit"));
		
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		
		submitButton.click();
		
		
		// go to checkout
		WebElement checkoutButton = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		
		wait.until(ExpectedConditions.visibilityOf(checkoutButton));
		
		checkoutButton.click();
		
		WebElement proceedCheckoutButton = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));

		proceedCheckoutButton.click();
		
		
		
		Thread.sleep(1000);
		
		
	}

}

package com.bae.seleniumpractice.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

	public static WebDriver driver;
	String url = "https://www.google.com/";
	
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void teardown() {
		driver.quit(); // Must quit or will continue to run in background!
	}

	@Ignore
	@Test
	public void test1() {
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	
	@Test
	public void test2() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Norwegian Cheese");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).submit(); //sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}




}

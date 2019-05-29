package com.bae.namepainter.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tests {
	
	public static WebDriver driver;
	String url = "https://www.youidraw.com/apps/painter/";

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
		
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("brush"))).click().perform();
		
		action.moveToElement(driver.findElement(By.id("painter"))).perform();
		
		action.moveByOffset(-400, -100)
		.clickAndHold()
		.moveByOffset(80,0)
		.moveByOffset(0,100)
		.moveByOffset(-80,0)
		.moveByOffset(0,-100)
		.release()
		.moveByOffset(120,0)
		.clickAndHold()
		.moveByOffset(30,100)
		.moveByOffset(30,-100)
		.moveByOffset(30,100)
		.moveByOffset(30,-100)
		.release()
		.moveByOffset(40,0)
		.clickAndHold()
		.moveByOffset(40,0)
		.release()
		.moveByOffset(-40,0)
		.clickAndHold()
		.moveByOffset(0,50)
		.clickAndHold()
		.moveByOffset(40,0)
		.release()
		.moveByOffset(-40,0)
		.clickAndHold()
		.moveByOffset(0,50)
		.clickAndHold()
		.moveByOffset(40,0)
		.release()
		.moveByOffset(50,0)
		.clickAndHold()
		.moveByOffset(0,-100)
		.moveByOffset(60,100)
		.moveByOffset(0,-100)


		.release()
		
		.perform();

		
		Thread.sleep(1000);
		
		
		
	}


}

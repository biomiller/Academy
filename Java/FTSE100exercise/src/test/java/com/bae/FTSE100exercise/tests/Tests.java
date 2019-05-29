package com.bae.FTSE100exercise.tests;

import java.awt.List;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {
	
    JavascriptExecutor js = (JavascriptExecutor) driver;

	
	public static WebDriver driver;
	
	String url = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";
	
	
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
		
		WebDriverWait wait = new WebDriverWait(driver,10);

		
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		WebElement risersButton = driver.findElement(By.linkText("RISERS"));
		
		System.out.println(risersButton.getText());
		
		Actions actions = new Actions(driver);
		
		js.executeScript("window.scrollBy(0,500)");

		wait.until(ExpectedConditions.visibilityOf(risersButton));
		
		actions.moveToElement(risersButton).click().perform();
		
		
		js.executeScript("window.scrollBy(0,500)");

		java.util.List<WebElement>  rows =  driver.findElements(By.xpath("//*[@id=\"view-constituents\"]/div[2]/table/tbody/tr/td[1]"));
		System.out.println(rows.get(0).getText());
		
		
		Thread.sleep(2000);

	}

}



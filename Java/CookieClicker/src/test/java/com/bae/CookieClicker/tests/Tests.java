package com.bae.CookieClicker.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	public static WebDriver driver;

	String url = "https://orteil.dashnet.org/cookieclicker/";

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
	public void test1() {

		//WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();
		driver.navigate().to(url);

		Actions actions = new Actions(driver);

		WebElement cookie = driver.findElement(By.id("bigCookie"));

		WebElement product0 = driver.findElement(By.id("productName0"));

		actions.moveToElement(cookie).perform();

		while (true) {
			actions.moveToElement(cookie).click().perform();
			if (product0.isDisplayed() == true) {
				actions.moveToElement(product0).click().perform();
			}
		}

	}

}

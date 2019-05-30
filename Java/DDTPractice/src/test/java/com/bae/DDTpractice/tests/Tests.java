package com.bae.DDTpractice.tests;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

	public static WebDriver driver;
	String url = "http://thedemosite.co.uk/";

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

		FileInputStream file = null;
		try {
			file = new FileInputStream(Constant.PATH_TESTDATA + Constant.FILE_TESTDATA);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}

		XSSFWorkbook workbook = null;

		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
		}

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int numRows = sheet.getPhysicalNumberOfRows()-1;
		
		for (int i = 1; i <=numRows; i++) {

			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();

			driver.manage().window().maximize();
			driver.navigate().to(url);

			// Find the add user link at the top of the page and click it
			driver.findElement(
					By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"))
					.click();

			// Find the username box and enter "Mr_Bun"
			driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"))
					.sendKeys(username);

			// Find the password box and enter "Baker"
			driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"))
					.sendKeys(password);

			// Find the 'save' button and click it
			driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"))
					.click();

			// Find the login button at the top of the page and click it
			driver.findElement(
					By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"))
					.click();

			// Find the username box and enter "Mr_Bun"
			driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"))
					.sendKeys(username);

			// Find the password box and enter "Baker"
			driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"))
					.sendKeys(password);

			// Find the 'Test Login' button and click it
			driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"))
					.click();

			String result = driver
					.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"))
					.getText();

			System.out.println(result);


			sheet.getRow(i).createCell(2).setCellValue(result.replaceAll("\\*\\*", ""));

		}

		try {
			FileOutputStream fileOut = new FileOutputStream(Constant.PATH_TESTDATA + "test.xlsx");
			workbook.write(fileOut);
			fileOut.close();
			System.out.println("File saved successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

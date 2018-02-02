package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class OrderKitInstructionsPageProd {
	
	private WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
//		System.out.println("Performing driver quit operation");
		 driver.quit();
	}

	@Test
	public void testOrderKitInstructionsPage() throws Exception {
		
		System.out.println("Starting testOrderKitInstructionsPage");

		String baseURL = "https://mystikit.com/Kit/Search";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

//		System.out
//				.println("The browser window with website opened and maximized");
		driver.get("https://mystikit.com/diy-lovely-earphone-case/-FVT");

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("//div[@id='kit_tabs']/ul/li[3]/a"))
				.click();
//
//		assertEquals(
//				driver.findElement(
//						By.xpath("//div[@id='kit_detail']//div/div/h4"))
//						.isDisplayed(), true);
//
//		try {
//			if (driver.findElement(
//					By.xpath("//div[@id='kit_detail']//div/div/h4"))
//					.isDisplayed() == true
//					|| driver
//							.findElement(
//									By.xpath("//div[@id='out-of-stock-notice']/ul/li[1]"))
//							.isDisplayed() == true
//					|| driver
//							.findElement(
//									By.xpath("//div[@id='out-of-stock-notice']/ul/li[2]"))
//							.isDisplayed() == true
//					|| driver
//							.findElement(
//									By.xpath("//div[@id='out-of-stock-notice']/ul/li[3]"))
//							.isDisplayed() == true
//					|| driver.findElement(
//							By.xpath("//div[@id='kit_detail']/div[1]/span"))
//							.isDisplayed() == true) {
//				System.out
//						.println("The Out Of Stock notice is correctly displayed on Tools page");
//			} else {
//				System.out
//						.println("The Out Of Stock Notice incorrectly displayed");
//			}
//		}
//
//		catch (NoSuchElementException e1) {
//			System.out
//					.println("Caught an exception looking for the Out Of Stock Notice on Tools page");
//		}

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[1]/td[1]"))
						.isDisplayed(), true);
//		assertEquals(
//				driver.findElement(
//						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[1]/td[1]"))
//						.getText(), "Materials (4 selected)");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[1]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[2]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[2]/td[1]"))
						.getText(), "Tools (0 selected)");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[2]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[3]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[3]/td[1]"))
						.getText(), "Quantity of Kits");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[3]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[3]/td[2]"))
						.getText(), "1");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[4]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[4]/td[1]"))
						.getText(), "Subtotal:");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[4]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[5]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[5]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[6]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[6]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[7]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[7]/td[1]"))
						.getText(), "Kit yields");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[7]/td[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[7]/td[2]"))
						.getText(), "21 Cases");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[8]/td[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[8]/td[1]"))
						.getText(), "Cost / unit");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[8]/td[2]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='buy_now']//div/img"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='buy_now']//div[2]/a"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']/h3/small"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']/h3/small"))
						.getText(), "Kit Details");

		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[1]"))
						.isDisplayed(), true);
		assertEquals("Age Group: Adults Only", 
				driver.findElement(By.xpath("//div[@id='details']//ul/li[1]"))
						.getText());
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[2]"))
						.getText(), "Skill Level: Intermediate");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[3]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[3]"))
						.getText(), "Time to Complete: 1 Hour(s)");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[4]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[4]"))
						.getText(), "Special Skills: sewing");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[5]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[5]"))
						.getText(), "Category: Fabric Arts/Sewing");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[6]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='details']//ul/li[6]"))
						.getText(), "Tags: earphones, earbuds, headphones, keychain, gift, gifts, music, organize, case");

		assertEquals(
				driver.findElement(By.xpath("//div[@id='share']/h3")).getText(),
				"Share this Kit");

		assertEquals(
				driver.findElement(By.xpath("//div[@id='share']//ul/li[1]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='share']//ul/li[2]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='share']//ul/li[3]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='share']//ul/li[4]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='share']//ul/li[5]"))
						.isDisplayed(), true);

		try {
			if (driver.findElement(
					By.xpath("//div[@id='footer-content']/div[2]"))
					.isDisplayed() == true) {
				String actDisclaimer = driver.findElement(
						By.xpath("//div[@id='footer-content']/div[2]"))
						.getText();
				String expDisclaimer = "CERTAIN CONTENT THAT APPEARS ON THIS SITE COMES FROM AMAZON SERVICES LLC. THIS CONTENT IS PROVIDED ‘AS IS’ AND IS SUBJECT TO CHANGE OR REMOVAL AT ANY TIME.";

				assertEquals(actDisclaimer, expDisclaimer);
			} else {
				System.out.println("Could not find the disclaimer");
			}
		} catch (NoSuchElementException e1) {
			System.out.println("Disclaimer is not displayed on the page");
		}

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='similarkits']//h3/small"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='similarkits']//a[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='similarkits']//a[5]"))
						.isDisplayed(), true);
		assertEquals(driver.findElement(By.id("underline-bar"))
				.isDisplayed(), true);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='kit_tabs']//ul[2]/li[3]/div"))
						.isDisplayed(), true);
		String expLink = "View Kit Instructions Here:\nhttp://www.usefuldiy.com/diy-lovely-earphone-case/";
		String actLink = driver.findElement(
				By.xpath("//div[@id='kit_tabs']//ul[2]/li[3]/div")).getText();

		assertEquals(expLink, actLink);

		System.out.println("Finished testOrderKitInstructionsPage");
	}
}

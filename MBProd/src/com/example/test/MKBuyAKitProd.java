package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import java.sql.Timestamp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.common.YahooLogOff;
import com.example.common.YahooLoginToMystiKit;

public class MKBuyAKitProd {

	private WebDriver driver;

	private YahooLoginToMystiKit login = new YahooLoginToMystiKit();
	private YahooLogOff logoff = new YahooLogOff();

	@BeforeMethod
	public void beforeTest() throws Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterTest() throws Exception {
//		System.out.println("Performing driver quit operation");
		driver.quit();
	}

	@Test
	public void testMKBuyAKitNotLoggedIn() throws Exception {

		System.out.println("Starting testMKBuyAKitNotLoggedIn");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get("https://mystikit.com/");

		driver.findElement(By.id("kit-search")).sendKeys("DIY Egg Popper Tree");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[@id='mason-container']/div/div/a[2]")).click();

		assertEquals(driver.findElement(By.id("kit-title")).getText(),
				"DIY Egg Popper Tree");

		assertEquals(
				driver.findElement(By.xpath("//div[@id='buy_now']/div[2]/a"))
						.getText(), "Add to Cart");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");

		Thread.sleep(1500);

		driver.findElement(By.linkText("Add to Cart")).click();

		Thread.sleep(8000);

		assertEquals(driver.getTitle(),
				"Amazon.com: Please Confirm Your Action");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@class='bucket']/div/p/strong"))
						.getText(),
				"Please confirm that you want to add the item(s) listed below to your cart.");

		assertEquals(
				driver.findElement(
						By.xpath("//table[@class='itemq']/tbody/tr[2]/td[1]"))
						.getText(),
				"Jumbo Plastic Printed Bright Easter Eggs (12)");

		assertEquals(
				driver.findElement(
						By.xpath("//table[@class='itemq']/tbody/tr[5]/td[1]"))
						.getText(),
				"3M Double-Sided Tape with Dispenser, Permanent, 1/2 X 250 Inches, Clear (MMM136)");

		assertEquals(driver.findElement(By.xpath("//form/span/input[8]"))
				.isDisplayed(), true);

		assertEquals(driver.findElement(By.xpath("//form/span/a")).getText(),
				"Amazon.com");

		java.util.Date endTime = new java.util.Date();
		System.out.println("Suite ending time is "
				+ new Timestamp(endTime.getTime()));

		System.out.println("Finished testMKBuyAKitNotLoggedIn");

	}

	@Test
	public void testMKBuyAKitLoggedIn() throws Exception {

		System.out.println("Starting testMKBuyAKitLoggedIn");

		login.LoginYahoo(driver);

		Thread.sleep(5000);

		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

		driver.findElement(By.id("kit-search")).sendKeys("DIY Egg Popper Tree");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[@id='mason-container']/div/div/a[2]")).click();

		assertEquals(driver.findElement(By.id("kit-title")).getText(),
				"DIY Egg Popper Tree");

		assertEquals(
				driver.findElement(By.xpath("//div[@id='buy_now']/div[2]/a"))
						.getText(), "Add to Cart");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");

		Thread.sleep(1500);

		driver.findElement(By.linkText("Add to Cart")).click();

		Thread.sleep(8000);

		assertEquals(driver.getTitle(),
				"Amazon.com: Please Confirm Your Action");

		assertEquals(
				"Please confirm that you want to add the item(s) listed below to your cart.",
				driver.findElement(
						By.xpath("//div[@class='bucket']/div/p/strong"))
						.getText());

		assertEquals(
				"Jumbo Plastic Printed Bright Easter Eggs (12)",
				driver.findElement(
						By.xpath("//table[@class='itemq']/tbody/tr[2]/td[1]"))
						.getText());

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

		assertEquals(
				"3M Double-Sided Tape with Dispenser, Permanent, 1/2 X 250 Inches, Clear (MMM136)",
				driver.findElement(
						By.xpath("//table[@class='itemq']/tbody/tr[5]/td[1]"))
						.getText());

		assertEquals(driver.findElement(By.xpath("//form/span/input[8]"))
				.isDisplayed(), true);

		assertEquals("Amazon.com", driver
				.findElement(By.xpath("//form/span/a")).getText());

		driver.get("https://mystikit.com");
		
		logoff.LogoffYahoo(driver);

		System.out.println("Finished testMKBuyAKitLoggedIn");

	}

}

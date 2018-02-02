package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import static org.junit.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MKSearchForKitProd {

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
	public void testSearchForKitByString() throws Exception {
		
		System.out.println("Starting testSearchForKitByString");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get("https://mystikit.com/");

//		System.out
//				.println("The browser window with website opened and maximized");
//
//		String i = driver.getCurrentUrl();
//		String ti = driver.getTitle();
//		System.out.println("The current URL is " + i);
//		System.out.println("The current page title is " + ti);

		driver.findElement(By.id("kit-search")).sendKeys("DIY Egg Popper Tree");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='mason-container']/div/a/span"))
				.click();

		assertEquals("DIY Egg Popper Tree", driver.findElement(By.id("kit-title")).getText());

		System.out.println("Finished testSearchForKitByString");

	}

	@Test
	public void testMKSearchForKitByKitterName() throws Exception {
		
		System.out.println("Starting testMKSearchForKitByKitterName");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get("https://mystikit.com/");

//		System.out
//				.println("The browser window with website opened and maximized");
//
//		String i = driver.getCurrentUrl();
//		String ti = driver.getTitle();
//		System.out.println("The current URL is " + i);
//		System.out.println("The current page title is " + ti);

		driver.findElement(By.id("kit-search")).sendKeys("Illya Katsyuk");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='mason-container']/div[1]/a/span"))
				.click();
		
		Thread.sleep(3000);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='kit_detail']/div[2]/h2/div/a"))
						.getText(), "Illya Katsyuk");

		driver.findElement(By.id("logo")).click();

		Thread.sleep(3000);

		System.out
				.println("Searchng by Kitter Name with all lower case letters");

		driver.get("https://mystikit.com/");

		driver.findElement(By.id("kit-search")).sendKeys("illya katsyuk");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='mason-container']/div/a/span"))
				.click();

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='kit_detail']/div[2]/h2/div/a"))
						.getText(), "Illya Katsyuk");

		Thread.sleep(3000);

		System.out
				.println("Searchng by Kitter Name with all upper case letters");

		driver.get("https://mystikit.com/");

		driver.findElement(By.id("kit-search")).sendKeys("ILLYA KATSYUK");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='mason-container']/div/a/span"))
				.click();

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='kit_detail']/div[2]/h2/div/a"))
						.getText(), "Illya Katsyuk");

		Thread.sleep(3000);

		System.out
				.println("Searchng by Kitter Name with random mixed case letters");

		driver.get("https://mystikit.com/");

		driver.findElement(By.id("kit-search")).sendKeys("iLlYa kAtsYUk");
		driver.findElement(By.id("magnified-glass")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='mason-container']/div/a/span"))
				.click();

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='kit_detail']/div[2]/h2/div/a"))
						.getText(), "Illya Katsyuk");

		Thread.sleep(3000);

		System.out.println("Finished testMKSearchForKitByKitterName");

	}

	@Test
	public void testMKSearchByCategory() throws Exception {
		
		System.out.println("Starting testMKSearchByCategory");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get("https://mystikit.com/");

//		System.out
//				.println("The browser window with website opened and maximized");

//		String i = driver.getCurrentUrl();
//		String ti = driver.getTitle();
//		System.out.println("The current URL is " + i);
//		System.out.println("The current page title is " + ti);

		driver.findElement(By.linkText("Electronics")).click();

		driver.findElement(By.xpath("//div[@id='mason-container']/div/a/span"))
				.click();

		Thread.sleep(5000);

		assertEquals("Category: Electronics/Gatgets", 
				driver.findElement(By.xpath("//div[@id='details']/ul/li[5]"))
						.getText());

		System.out.println("Finished testMKSearchByCategory");

	}

	@Test
	public void testMKSearchByRecommendedNowTrendingKits() throws Exception {
		
		System.out
				.println("Starting testMKSearchByRecommendedNowTrendingKits");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get("https://mystikit.com/");

//		System.out
//				.println("The browser window with website opened and maximized");

//		String i = driver.getCurrentUrl();
//		String ti = driver.getTitle();
//		System.out.println("The current URL is " + i);
//		System.out.println("The current page title is " + ti);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,650)");

		assertEquals(
				driver.findElement(By.xpath("//dd[@id='recommended7Tab']/a"))
						.isDisplayed(), true);

		driver.findElement(By.xpath("//dd[@id='recommended7Tab']/a")).click();

		Thread.sleep(7000);

		assertEquals(true, 
				driver.findElement(
						By.xpath("//li[@id='recommended7Content']/a[2]/div"))
						.isDisplayed());
		driver.findElement(By.xpath("//li[@id='recommended7Content']/a[2]/div"))
				.click();
		
		Thread.sleep(3000);

		assertEquals(
				driver.findElement(By.xpath("//div[@id='buy_now']/div/img"))
						.isDisplayed(), true);

		System.out
				.println("Finished testMKSearchByRecommendedNowTrendingKits");

	}

}

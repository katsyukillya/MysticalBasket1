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

public class SearchKitOtherLinksAndLablesProd {

	private WebDriver driver;
	String baseURL = "https://mystikit.com/Kit/Search";

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
	public void testSearchKitUpperLabels() {

		System.out.println("Starting testSearchKitUpperLabels");

//		String baseURL = "https://mystikit.com/Kit/Search";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

//		System.out
//				.println("The browser window with website opened and maximized");

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//		String iUrl = driver.getCurrentUrl();
//		String iTitle = driver.getTitle();
//		System.out.println("The current URL is " + iUrl);
//		System.out.println("The current page title is " + iTitle);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='bottom-slogan']//../div[1]"))
						.getText(), "Choose your project. Customize your kit.");
//		System.out.println("The upper slogan is displayed on the page");

		assertEquals(driver.findElement(By.xpath("//div[@id='bottom-slogan']"))
				.getText(), "Have everything shipped with just a few clicks!");
//		System.out.println("The lower slogan is displayed on the page");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='sorting-container']/span[1]"))
						.getText(), "Sort By:");
//		System.out.println("The 'Sort By:' label is displayed on the page");

		assertEquals(true, driver.findElement(By.linkText("Recent"))
				.isDisplayed());
//		System.out.println("The sorting link 'Recent' is displayed");

		assertEquals(true, driver.findElement(By.linkText("Popular Last Week"))
				.isDisplayed());
//		System.out.println("The sorting link 'Popular Last Week' is displayed");

		assertEquals(true, driver
				.findElement(By.linkText("Popular Last Month")).isDisplayed());
//		System.out
//				.println("The sorting link 'Popular Last Month' is displayed");

		assertEquals(true, driver.findElement(By.linkText("Popular All Time"))
				.isDisplayed());
//		System.out.println("The sorting link 'Popular All Time' is displayed");

		assertEquals(true, driver.findElement(By.linkText("Highest Cost"))
				.isDisplayed());
//		System.out.println("The sorting link 'Highest Cost' is displayed");

		assertEquals(true, driver.findElement(By.linkText("Lowest Cost"))
				.isDisplayed());
//		System.out.println("The sorting link 'Lowest Cost' is displayed");

		System.out.println("Finished testSearchKitUpperLabels");
	}

	@Test
	public void testSearchKitBottomPage() {

		System.out.println("Starting testSearchKitBottomPage");

		

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

//		System.out
//				.println("The browser window with website opened and maximized");

//		String iUrl = driver.getCurrentUrl();
//		String iTitle = driver.getTitle();
//		System.out.println("The current URL is " + iUrl);
//		System.out.println("The current page title is " + iTitle);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 2000)");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='pagination-container']/div/div/ul/li[1]/a"))
						.isDisplayed());
//		System.out.println("Left Arrow in pagination is displayed");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='pagination-container']/div/div/ul/li[2]/a"))
						.isDisplayed());
//		System.out.println("The pagination first page selection is displayed");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='pagination-container']/div/div/ul/li[7]/a"))
						.isDisplayed());
//		System.out.println("The right arrow in Pagination is displayed");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div/img"))
						.isDisplayed());
//		System.out
//				.println("The MB Logo is displayed at the bottom of the page");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div/span[1]"))
						.isDisplayed());
//		System.out
//				.println("The Copyright symbol is displayed at the bottom of the page");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div/span[2]"))
						.isDisplayed());
//		System.out
//				.println("The Copyright terms 'Mystical Basket 2013 - 2014' is displayed at the bottom of the page");

		assertEquals(true, driver.findElement(By.id("prices-disclaimer"))
				.isDisplayed());
//		System.out
//				.println("The Price Disclaimer is displayed at the bottom of the page");

		assertEquals(
				"* KIT PRICES SHOWN ON THIS PAGE COULD BE UP TO 24 HOURS OLD. CLICK ON A KIT TO SEE CURRENT PRICES.",
				driver.findElement(By.id("prices-disclaimer")).getText());
//		System.out.println("The Price Disclaimer's wording is correct");

		assertEquals(true, driver.findElement(By.id("underline-bar"))
				.isDisplayed());
//		System.out
//				.println("The grey underline is displayed at the bottom of the page");

		assertEquals(true,
				driver.findElement(By.xpath("//div[@class='main row']/div[2]"))
						.isDisplayed());
//		System.out
//				.println("The grey advertising area is displayed at the left hand side of the page");

		assertEquals(true, driver.findElement(By.id("mason-container"))
				.isDisplayed());
//		System.out.println("The kits area is displayed on the page");

		System.out.println("Finished testSearchKitBottomPage");
	}
}

package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;



public class SearchKitAgeDifficultyTimeProd {

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
	public void testSearchKitAgeDifficulty() throws Exception{

		System.out.println("Starting testSearchKitAgeDifficulty");

		String baseURL = "https://mystikit.com/Kit/Search";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

//		System.out
//				.println("The browser window with website opened and maximized");
//
//		String iUrl = driver.getCurrentUrl();
//		String iTitle = driver.getTitle();
//		System.out.println("The current URL is " + iUrl);
//		System.out.println("The current page title is " + iTitle);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 400)");

		assertEquals(true, driver.findElement(By.linkText("Age")).isDisplayed());
//		System.out.println("The Age link is displayed");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[1]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[1]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Age --> Kids is displayed and is unchecked");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[2]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[2]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Age --> Tweens is displayed and is unchecked");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[3]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[3]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Age --> Teens is displayed and is unchecked");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[4]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='age-selection']//div/div/form/label[4]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Age --> Adults is displayed and is unchecked");

		assertEquals(true, driver.findElement(By.linkText("Difficulty"))
				.isDisplayed());
//		System.out.println("The Difficulty link is displayed");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='difficulty-selection']//div/div/form/label[1]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='difficulty-selection']//div/div/form/label[1]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Difficulty --> Beginner is displayed and is unchecked");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='difficulty-selection']//div/div/form/label[2]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='difficulty-selection']//div/div/form/label[2]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Difficulty --> Intermediate is displayed and is unchecked");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//li[@id='difficulty-selection']//div/div/form/label[3]/span"))
						.isDisplayed());
		assertEquals(
				false,
				driver.findElement(
						By.xpath("//li[@id='difficulty-selection']//div/div/form/label[3]/span"))
						.isSelected());
//		System.out
//				.println("The checkbox Difficulty --> Advanced is displayed and is unchecked");

		System.out.println("Finished testSearchKitAgeDifficulty");

	}

	@Test
	public void testSearchKitCostTime() throws Exception {

		System.out.println("Starting testSearchKitCostTime");

		String baseURL = "https://mystikit.com/Kit/Search";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

//		System.out
//				.println("The browser window with website opened and maximized");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 550)");

		assertEquals(true, driver.findElement(By.linkText("Cost"))
				.isDisplayed());
//		System.out.println("The Cost link is displayed");

//		String minCost = driver.findElement(
//				By.xpath("//li[@id='cost-selection']//div/div/label/span[1]"))
//				.getText();
//		String maxCost = driver.findElement(
//				By.xpath("//li[@id='cost-selection']//div/div/label/span[2]"))
//				.getText();

//		System.out.println("Minimal cost is " + minCost + ", Maximal cost is "
//				+ maxCost);

		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//div[@id='slider-cost']/a[1]"));
		action.dragAndDropBy(we, 35, 0).build().perform();

		Thread.sleep(5000);

//		String newMinCost = driver.findElement(
//				By.xpath("//li[@id='cost-selection']//div/div/label/span[1]"))
//				.getText();
//		String newMaxCost = driver.findElement(
//				By.xpath("//li[@id='cost-selection']//div/div/label/span[2]"))
//				.getText();

//		System.out.println("Now, the minimal cost is " + newMinCost
//				+ ", and Maximal cost is " + newMaxCost);

//		System.out.println("The page URL is " + driver.getCurrentUrl());

		WebElement we1 = driver.findElement(By
				.xpath("//div[@id='slider-cost']/a[1]"));
		action.dragAndDropBy(we1, -35, 0).build().perform();

		Thread.sleep(5000);

//		String minCostNew = driver.findElement(
//				By.xpath("//li[@id='cost-selection']//div/div/label/span[1]"))
//				.getText();
//		String maxCostNew = driver.findElement(
//				By.xpath("//li[@id='cost-selection']//div/div/label/span[2]"))
//				.getText();

//		System.out.println("Minimal cost is " + minCostNew
//				+ ", Maximal cost is " + maxCostNew);
//		System.out.println("The page URL is " + driver.getCurrentUrl());

		// ------------------------------------------------------------------------------

		driver.get(baseURL);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 600)");

		assertEquals(true, driver.findElement(By.linkText("Time"))
				.isDisplayed());
//		System.out.println("The section Time is visible");

//		String minTime = driver.findElement(
//				By.xpath("//li[@id='time-selection']/div/div/label/span[1]"))
//				.getText();
//		String maxTime = driver.findElement(
//				By.xpath("//li[@id='time-selection']/div/div/label/span[2]"))
//				.getText();

//		System.out.println("Minimal time is " + minTime + ", Maximal time is "
//				+ maxTime);

		// Actions action = new Actions(driver);
		WebElement we2 = driver.findElement(By
				.xpath("//div[@id='slider-time']/a[1]"));
		action.dragAndDropBy(we2, 35, 0).build().perform();

		Thread.sleep(10000);

//		String newMinTime = driver.findElement(
//				By.xpath("//li[@id='time-selection']/div/div/label/span[1]"))
//				.getText();
//		String newMaxTime = driver.findElement(
//				By.xpath("//li[@id='time-selection']/div/div/label/span[2]"))
//				.getText();

//		System.out.println("Now, the minimal time is " + newMinTime
//				+ ", and Maximal time is " + newMaxTime);

//		System.out.println("The page URL is " + driver.getCurrentUrl());

		WebElement we3 = driver.findElement(By
				.xpath("//div[@id='slider-time']/a[1]"));
		action.dragAndDropBy(we3, -35, 0).build().perform();

		Thread.sleep(8000);

		String minTimeNew = driver.findElement(
				By.xpath("//li[@id='time-selection']/div/div/label/span[1]"))
				.getText();
		String maxTimeNew = driver.findElement(
				By.xpath("//li[@id='time-selection']/div/div/label/span[2]"))
				.getText();

		System.out.println("Minimal time is " + minTimeNew
				+ ", Maximal time is " + maxTimeNew);
//		System.out.println("The page URL is " + driver.getCurrentUrl());

		System.out.println("Finished testSearchKitCostTime");
	}

	@Test
	public void testSearchKitSocialMedia() throws Exception{

		System.out.println("Starting testSearchKitSocialMedia");

		String baseURL = "https://mystikit.com/Kit/Search";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

//		System.out
//				.println("The browser window with website opened and maximized");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800)");

//		System.out.println("Section "
//				+ driver.findElement(
//						By.xpath("//div[@id='follow-section-header']"))
//						.getText() + " is present");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//ul[@id='social-container']/li[2]/div/span[1]"))
						.isDisplayed());
//		System.out.println("Button 'Like Us on Facebook' is displayed");

		assertEquals(true,
				driver.findElement(By.xpath("//ul[@id='social-container']/li[2]/div/span[2]"))
						.isDisplayed());
//		System.out.println("Button 'Follow Us on Twitter' is displayed");

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//ul[@id='social-container']/li[2]/div/span[3]"))
						.isDisplayed());
//		System.out.println("Button 'Follow Me on Pinterest' is displayed");

		// ---------------------------------------------------------------------------

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100)");

//		System.out.println("Section "
//				+ driver.findElement(
//						By.xpath("//div[@id='share-section-header']"))
//						.getText() + " is present");

		assertEquals(true, driver.findElement(By.id("share-section"))
				.isDisplayed());
//		System.out
//				.println("'Share MystiKit...' section with icons is displayed");
		
		System.out.println("Finished testSearchKitSocialMedia");

	}
}

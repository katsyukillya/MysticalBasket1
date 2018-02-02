package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MKSearchKitsCategoriesProd {
	
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
	public void testSearchKitsCategories() {
		
		System.out.println("Starting testSearchKitsCategories");

		String baseURL = "https://mystikit.com/Kit/Search";

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
		
		assertEquals(true, driver.findElement(By.id("kit-search")).isDisplayed());
		
		assertEquals(true, driver.findElement(By.id("magnified-glass")).isDisplayed());

		assertEquals(true, driver.findElement(By.id("clear-all")).isDisplayed());
//		System.out.println("The View All Kits link is displayed");

		assertEquals(true, driver.findElement(By.id("clear-categories")).isDisplayed());
//		System.out.println("The All Categories link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Baby")).isDisplayed());
//		System.out.println("The Baby link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Electronics")).isDisplayed());
//		System.out.println("The Electronics link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Entertaining")).isDisplayed());
//		System.out.println("The Entertaining link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Fabric Arts")).isDisplayed());
//		System.out.println("The Fabric Arts link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Fine Art")).isDisplayed());
//		System.out.println("The Fine Art link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Food Crafting")).isDisplayed());
//		System.out.println("The Food Crafting link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Health & Beauty")).isDisplayed());
//		System.out.println("The Health & Beauty link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Home Decor")).isDisplayed());
//		System.out.println("The Home Decor link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Household")).isDisplayed());
//		System.out.println("The Household link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Kids Crafts")).isDisplayed());
//		System.out.println("The Kids Crafts link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Outdoor")).isDisplayed());
//		System.out.println("The Outdoor link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Paper Arts")).isDisplayed());
//		System.out.println("The Paper Arts link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Pets")).isDisplayed());
//		System.out.println("The Pets link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Seasonal Crafting")).isDisplayed());
//		System.out.println("The Seasonal Crafting link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Style & Fashion")).isDisplayed());
//		System.out.println("The Style & Fashion link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Technology")).isDisplayed());
//		System.out.println("The Technology link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Wedding & Reception")).isDisplayed());
//		System.out.println("The Wedding & Reception link is displayed");

		assertEquals(true, driver.findElement(By.linkText("Woodworking")).isDisplayed());
//		System.out.println("The Woodworking link is displayed");
		
		System.out.println("Finished testSearchKitsCategories");

	}

}

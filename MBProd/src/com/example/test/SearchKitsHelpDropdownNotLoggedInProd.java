package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;;

public class SearchKitsHelpDropdownNotLoggedInProd {
	
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
	public void testSearchKitsHelpDropdownNotLoggedIn() throws Exception {
		
		System.out
				.println("Starting testSearchKitsHelpDropdownNotLoggedIn");

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

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("HELP"));
		action.moveToElement(we)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li[2]/ul/li[2]/a")))
				.click().build().perform();
		
		Thread.sleep(2000);

//		System.out.println("The page title is " + driver.getTitle());
		
		assertEquals(true, driver.findElement(By.id("ordering-instructions")).isDisplayed());

		driver.get(baseURL);
		
		WebElement we1 = driver.findElement(By.linkText("HELP"));
		action.moveToElement(we1)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li[2]/ul/li[3]/a")))
				.click().build().perform();

		Thread.sleep(2000);

//		System.out.println("The page title is " + driver.getTitle());
		
		Thread.sleep(2000);
		
		assertEquals(true, driver.findElement(By.id("searching-instructions")).isDisplayed());

		System.out
				.println("Finished testSearchKitsHelpDropdownNotLoggedIn");
	}

}

package com.example.test;

import java.util.Iterator;
import java.util.Set;
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
import static org.junit.Assert.assertEquals;

public class SearchKitsAboutDropdownNotLoggedInProd {

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
	public void testSearchKitsAboutDropdownNotLoggedIn() throws Exception {
		
		System.out
				.println("Starting testSearchKitsAboutDropdownNotLoggedIn");

//		String baseURL = "https://mkqa.azurewebsites.net";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);
		
		driver.findElement(By.id("clear-all")).click();

//		System.out
//				.println("The browser window with website opened and maximized");
//
//		String iUrl = driver.getCurrentUrl();
//		String iTitle = driver.getTitle();
//		System.out.println("The current URL is " + iUrl);
//		System.out.println("The current page title is " + iTitle);
		
		Thread.sleep(5000);


		assertEquals(true, driver.findElement(By.id("logo")).isDisplayed());

		assertEquals(true, driver.findElement(By.xpath("//li[@id='tagline']/div/span"))
					.isDisplayed());

		assertEquals(true, driver.findElement(By.linkText("CREATE+")).isDisplayed());

		assertEquals(true, driver.findElement(By.linkText("ABOUT")).isDisplayed());

		assertEquals(true, driver.findElement(By.linkText("HELP")).isDisplayed());

		assertEquals(true, driver.findElement(By.linkText("LOGIN")).isDisplayed());

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.linkText("ABOUT"));
		action.moveToElement(we)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li/ul/li[2]/a")))
				.click().build().perform();

		Thread.sleep(2000);

		assertEquals(driver.getTitle(), "How MystiKit Works");

		driver.get(baseURL);

		WebElement we1 = driver.findElement(By.linkText("ABOUT"));
		action.moveToElement(we1)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li/ul/li[3]/a")))
				.click().build().perform();

		Thread.sleep(2000);

		assertEquals("Become a Kitter", driver.getTitle());

		driver.get(baseURL);

		String mainWindowHandle = driver.getWindowHandle();

		WebElement we2 = driver.findElement(By.linkText("ABOUT"));
		action.moveToElement(we2)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li/ul/li[4]/a")))
				.click().build().perform();

		Set<String> s = driver.getWindowHandles();
//		System.out.println("Got all handles for all opened windows");

		// Switching focus to the pop-up window

		Iterator<String> ite = s.iterator();
		while (ite.hasNext()) {
			String popupHandle = ite.next().toString();
			if (!popupHandle.contains(mainWindowHandle)) {
				driver.switchTo().window(popupHandle);
//				System.out.println("The page title is " + driver.getTitle());

				driver.close();
				driver.switchTo().window(mainWindowHandle);

			}
		}

		driver.get(baseURL);
		
		driver.findElement(By.id("clear-all")).click();
		
		Thread.sleep(5000);

		WebElement we4 = driver.findElement(By.linkText("ABOUT"));
		action.moveToElement(we4)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li/ul/li[5]/a")))
				.click().build().perform();

		Thread.sleep(2000);

		assertEquals("Terms of Use - MystiKit.com", driver.getTitle());

		driver.get(baseURL);
		
		driver.findElement(By.id("clear-all")).click();
		
		Thread.sleep(5000);

		WebElement we5 = driver.findElement(By.linkText("ABOUT"));
		action.moveToElement(we5)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li/ul/li[6]/a")))
				.click().build().perform();

		Thread.sleep(2000);
		
		assertEquals("Privacy Notice - MystiKit.com", driver.getTitle());
		
		driver.get(baseURL);
		
		driver.findElement(By.id("clear-all")).click();
		
		Thread.sleep(5000);

		WebElement we6 = driver.findElement(By.linkText("ABOUT"));
		action.moveToElement(we6)
				.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li/ul/li[7]/a")))
				.click().build().perform();

		Thread.sleep(2000);
		
		assertEquals("Contact Us", driver.getTitle());
		
		System.out
				.println("Finished testSearchKitsAboutDropdownNotLoggedIn");

	}
}

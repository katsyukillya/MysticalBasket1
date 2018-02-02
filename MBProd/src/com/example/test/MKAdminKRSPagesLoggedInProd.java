package com.example.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.common.YahooLogOff;
import com.example.common.YahooLoginToMystiKit;

public class MKAdminKRSPagesLoggedInProd {

	private WebDriver driver;

	private YahooLoginToMystiKit login = new YahooLoginToMystiKit();
	private YahooLogOff logoff = new YahooLogOff();

	@BeforeMethod
	public void setUp() throws Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(125, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(130, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {

		logoff.LogoffYahoo(driver);
		driver.quit();
	}


	@Test
	public void testMKAdminKitRefreshServicePage() throws Exception {

		System.out.println("Starting testMKAdminKitRefreshServicePage");

		login.LoginYahoo(driver);

		assertEquals(
				driver.getTitle(),
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.");

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//ul[@id='persistent-area']/li[5]/a"));

		Thread.sleep(1500);

		action.moveToElement(we).build().perform();

		Thread.sleep(1500);

		action.moveToElement(
				driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[8]/a")))
				.click().build().perform();

		assertEquals(driver.getTitle(), "KitRefreshService");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div[2]/h2"))
						.getText(), "Kit Refresh Service");

		assertEquals(
				driver.findElement(By.xpath("//ul[@id='creation-area']/li[1]"))
						.getText(),
				"Drag this Link to your bookmarks -> Add Product");
		assertEquals(
				driver.findElement(
						By.xpath("//ul[@id='creation-area']/li[3]/a"))
						.getText(), "CREATE +");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[1]/a"))
						.getText(), "ABOUT");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[2]/a"))
						.getText(), "HELP");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[4]/a"))
						.getText(), "Illya Katsyuk");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[5]/a"))
						.getText(), "ADMIN");

		assertEquals(
				driver.findElement(By.xpath("//div[@id='container']/div[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[2]/div"))
						.isDisplayed(), true);
		assertEquals(driver.findElement(By.xpath("//div[@id='header']/a"))
				.getText(), "Launch Kit Refresh Service");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[1]"))
						.getText(), "Status");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[2]"))
						.getText(), "Start Time");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[3]"))
						.getText(), "Stop Time");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[4]"))
						.getText(), "Total Time (minutes)");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[5]"))
						.getText(), "Refresh Velocity (Kits/minute)");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[6]"))
						.getText(), "Kits To Refresh");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[7]"))
						.getText(), "Kits Refreshed");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[8]"))
						.getText(), "Paapi Calls");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[9]"))
						.getText(), "Reported OOS Kits");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/table/thead/tr/td[10]"))
						.getText(), "Exception");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/div/div/div/ul/li[1]/a"))
						.isDisplayed(), true);
		// System.out.println("Left arrow in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='container']/div[3]/div/div/div/ul/li[2]/a"))
						.isDisplayed(), true);
		// System.out.println("# 1 in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div/img"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div/span[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div/span[2]"))
						.isDisplayed(), true);

		System.out.println("Finished testMKAdminKitRefreshServicePage");
	}

}

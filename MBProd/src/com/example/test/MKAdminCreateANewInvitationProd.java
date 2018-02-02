package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.common.YahooLogOff;
import com.example.common.YahooLoginToMystiKit;

public class MKAdminCreateANewInvitationProd {

	private WebDriver driver;
	
	private YahooLoginToMystiKit login = new YahooLoginToMystiKit();
	private YahooLogOff logoff = new YahooLogOff();

	@BeforeMethod
	public void setUp() throws Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {

		
		driver.quit();
	}

	@Test
	public void testMKAdminUseANewInvitation() throws Exception {
		
		System.out.println("Starting testMKAdminUseANewInvitation");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		login.LoginYahoo(driver);

		Thread.sleep(5000);

		assertEquals(driver.getTitle(), 
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.");

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//ul[@id='persistent-area']/li[5]/a"));

		Thread.sleep(1500);

		action.moveToElement(we).build().perform();

		Thread.sleep(1500);

		action.moveToElement(
				driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[3]/a")))
				.click().build().perform();

		assertEquals(driver.getTitle(), "Invitations");
		assertEquals("Invitations", 
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div/h2"))
						.getText());

		driver.findElement(By.xpath("//input[@id='HideExpired']")).click();
		driver.findElement(By.xpath("//input[@id='HideExpired']/..//input[3]"))
				.click();

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[@id='uvTab']/../div[2]/form/input[2]")).click();

		Thread.sleep(8000);

		driver.navigate().refresh();
		
		String invLink = driver.findElement(
				By.xpath("//div[@id='invitationRpt']/table/tbody/tr[2]/td[1]"))
				.getText();

		System.out.println("A new invitation link has been generated \n '"
				+ invLink + "'");

		// Starting registration process for the new invitation
		
		logoff.LogoffYahoo(driver);

		driver.close();
		Thread.sleep(5000);
		
		driver = new FirefoxDriver();
		driver.get(invLink);
		Thread.sleep(2000);
		
		System.out.println("Finished testMKAdminUseANewInvitation");
	}

	@Test
	public void testRegisterWithClaimedInvitation() throws Exception {
		
		System.out.println("Starting testRegisterWithClaimedInvitation");
		
		driver.get("https://mystikit.com/Account/Manage?InvitationId=dwBK4OSf70mDfx6uOpexTw");
		
		assertEquals("Welcome to Mystikit.", driver.getTitle());
		
		assertEquals(driver.findElement(By.id("logo")).isDisplayed(), true);
		assertEquals(driver.findElement(By.xpath("//li[@id='tagline']/div/span")).getText(), "Idea to \"I did it!\"");
		
		String headerText = driver.findElement(
						By.xpath("//div[@class='signin-message-wrapper']/h2"))
						.getText();
		assertEquals(headerText, "SIGN IN");

		driver.findElement(By.xpath("(//button[@name='provider'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys(
				"automation.test_05062014@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("t3$tAcc0unt");
		driver.findElement(By.id("pLabelC")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id(".save")).click();
		
		Thread.sleep(8000);
		
		String errorMessage = driver.findElement(
								By.xpath("//div[@class='externalLogin-error']/div/div[2]/div/div/ul/li"))
								.getText();
		
		assertEquals("Invitation provided has already been claimed.", errorMessage);
		
		System.out.println("Finished testRegisterWithClaimedInvitation");
	}

	@Test
	public void testRegisterWithExpiredInvitation() throws Exception {
		
		System.out.println("Starting testRegisterWithExpiredInvitation");
		
		driver.get("https://mystikit.com/Account/Manage?InvitationId=sdBCXXCphU62N3L8VrLGuw");
		
		assertEquals(driver.getTitle(), "Welcome to Mystikit.");
		
		assertEquals(driver.findElement(By.id("logo")).isDisplayed(), true);
		assertEquals(driver.findElement(By.xpath("//li[@id='tagline']/div/span")).getText(), "Idea to \"I did it!\"");
		
		String headerText = driver.findElement(
						By.xpath("//div[@class='signin-message-wrapper']/h2"))
						.getText();
		assertEquals(headerText, "SIGN IN");

		driver.findElement(By.xpath("(//button[@name='provider'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys(
				"automation.test_05062014@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("t3$tAcc0unt");
		driver.findElement(By.id("pLabelC")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id(".save")).click();
		
		Thread.sleep(8000);
		
		String errorMessage = driver.findElement(
								By.xpath("//div[@class='externalLogin-error']/div/div[2]/div/div/ul/li"))
								.getText();
		
		assertEquals(errorMessage, "Invitation provided has expired.");
		
		System.out.println("Finished testRegisterWithExpiredInvitation");
		
	}
}


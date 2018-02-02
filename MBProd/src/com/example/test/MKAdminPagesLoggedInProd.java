package com.example.test;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
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

public class MKAdminPagesLoggedInProd {

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
	public void testMKAdminEarningsPage() throws Exception {

		System.out.println("Starting testMKAdminEarningsPage");

		java.util.Date date = new java.util.Date();
		System.out.println("Suite starting time is "
				+ new Timestamp(date.getTime()));

		login.LoginYahoo(driver); // Calling the external Login method

		// String til = driver.getTitle();
		// String il = driver.getCurrentUrl();
		// System.out.println("The current URL is " + il);
		// System.out.println("The current page title is " + til);
		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

		// System.out.println("Logged into the account");

		Actions action = new Actions(driver);
		WebElement adminLink = driver.findElement(By
				.xpath("//ul[@id='persistent-area']/li[5]/a"));

		Thread.sleep(1500);

		action.moveToElement(adminLink).build().perform();

		Thread.sleep(1500);

		action.moveToElement(
				driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[2]/a")))
				.click().build().perform();

		assertEquals(
				"Earnings",
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div[2]/h2"))
						.getText());
		assertEquals("Earnings", driver.getTitle());
		assertEquals("Drag this Link to your bookmarks -> Add Product", driver
				.findElement(By.xpath("//ul[@id='creation-area']/li[1]"))
				.getText());
		assertEquals(
				"CREATE +",
				driver.findElement(
						By.xpath("//ul[@id='creation-area']/li[3]/a"))
						.getText());
		assertEquals(
				"ABOUT",
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[1]/a"))
						.getText());
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

		assertEquals(driver.findElement(By.xpath("//input[@id='file']"))
				.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//input[@id='file']/..//input[2]"))
						.isDisplayed(), true);

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

		// System.out.println("Finished checking out the Earnings page");

		System.out.println("Finished testMKAdminEarningsPage");
	}

	@Test
	public void testMKAdminInvitationsPage() throws Exception {

		System.out.println("Starting testMKAdminInvitationsPage");

		login.LoginYahoo(driver);

		// System.out.println("Logged into the account");

		Thread.sleep(5000);

		// String til = driver.getTitle();
		// String il = driver.getCurrentUrl();
		// System.out.println("The current URL is " + il);
		// System.out.println("The current page title is " + til);
		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

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

		assertEquals("Invitations", driver.getTitle());
		assertEquals("Invitations",
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div/h2"))
						.getText());
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
				driver.findElement(
						By.xpath("//div[@id='invitationHdr']/div/form/div"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div/form/input[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div/form/input[2]"))
						.getAttribute("value"), "Create New");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationHdr']/div/form/span"))
						.getText(), "Hide Expired");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationHdr']/div/form/input"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationHdr']/div/form/input"))
						.isSelected(), false);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationHdr']/div/form/input[3]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[1]"))
						.getText(), "Invitation Link");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[2]"))
						.getText(), "Issued On");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[3]"))
						.getText(), "Issued By");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[4]"))
						.getText(), "Claimed On");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[5]"))
						.getText(), "Claimed By");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[6]"))
						.getText(), "Expires On");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/table/tbody/tr[1]/th[7]"))
						.getText(), "Status");

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

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/div/div/div/ul/li[1]"))
						.isDisplayed(), true);
		// System.out.println("Left arrow in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/div/div/div/ul/li[2]"))
						.isDisplayed(), true);
		// System.out.println("# 1 in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/div/div/div/ul/li[3]"))
						.isDisplayed(), true);
		// System.out.println("# 2 in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='invitationRpt']/div/div/div/ul/li[7]"))
						.isDisplayed(), true);
		// System.out.println("Right arrow in pagination is displayed");

		System.out.println("Finished testMKAdminInvitationsPage");
	}

	@Test
	public void testMKAdminSubaffiliatesPage() throws Exception {

		System.out.println("Starting testMKAdminSubaffiliatesPage");

		login.LoginYahoo(driver);

		// String til = driver.getTitle();
		// String il = driver.getCurrentUrl();
		// System.out.println("The current URL is " + il);
		// System.out.println("The current page title is " + til);
		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//ul[@id='persistent-area']/li[5]/a"));

		Thread.sleep(1500);

		action.moveToElement(we).build().perform();

		Thread.sleep(1500);

		action.moveToElement(
				driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[4]/a")))
				.click().build().perform();

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
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div[1]/form/input[2]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div[1]/form/input[3]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div[2]/h5[1]"))
						.getText(), "Subaffiliate Id");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div[2]/h5[2]"))
						.getText(), "Assigned To");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[1]"))
						.isDisplayed(), true);
		// System.out.println("Left arrow in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[2]"))
						.isDisplayed(), true);
		// System.out.println("# 1 in pagination is displayed");

		System.out.println("Finished testMKAdminSubaffiliatesPage");
	}

	@Test
	public void testMKAdminUsersPage() throws Exception {

		System.out.println("Starting testMKAdminUsersPage");

		login.LoginYahoo(driver);

		Thread.sleep(5000);

		// String til = driver.getTitle();
		// String il = driver.getCurrentUrl();
		// System.out.println("The current URL is " + il);
		// System.out.println("The current page title is " + til);
		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//ul[@id='persistent-area']/li[5]/a"));

		Thread.sleep(1500);

		action.moveToElement(we).build().perform();

		Thread.sleep(1500);

		action.moveToElement(
				driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[5]/a")))
				.click().build().perform();

		Thread.sleep(5000);

		assertEquals(driver.getTitle(), "Users");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div[2]/h2"))
						.getText(), "Users");

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
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[1]/tbody/tr/th"))
						.getText(), "Total Users");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[1]/tbody/tr/td"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[1]/tbody/tr[2]/th"))
						.getText(), "Total Kits");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[1]/tbody/tr[2]/td"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[1]/tbody/tr[3]/th"))
						.getText(), "Total Kits Published");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[1]/tbody/tr[3]/td"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[1]"))
						.getText(), "User Name");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[2]"))
						.getText(), "User Email");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[3]"))
						.getText(), "SubAffiliate Id");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[4]"))
						.getText(), "Date of Enrollment");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[5]"))
						.getText(), "Number of Kits");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[6]"))
						.getText(), "Date of last published Kit creation");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[1]/th[7]"))
						.getText(), "Impersonate User");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[2]/td[7]/form/input[2]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[1]"))
						.isDisplayed(), true);
		// System.out.println("Left arrow in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[2]"))
						.isDisplayed(), true);
		// System.out.println("# 1 in pagination is displayed");

		driver.findElement(
				By.xpath("//div[@id='uvTab']/..//div[2]/table[2]/tbody/tr[2]/td[7]/form/input[2]"))
				.click();

		Thread.sleep(5000);

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
//		assertEquals(
//				driver.findElement(
//						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[4]/a"))
//						.getText(), "(mysticalbasket@gmail)");

		System.out.println("Finished testMKAdminUsersPage");
	}

	@Test
	public void testMKAdminWarnedKitsPage() throws Exception {

		System.out.println("Starting testMKAdminWarnedKitsPage");

		login.LoginYahoo(driver);

		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//ul[@id='persistent-area']/li[5]/a"));

		Thread.sleep(1500);

		action.moveToElement(we).build().perform();

		Thread.sleep(1500);

		action.moveToElement(
				driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[6]/a")))
				.click().build().perform();

		assertEquals(driver.getTitle(), "Kits With Warnings");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div[2]/h2"))
						.getText(), "Kits With Warning Supplies");

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

		assertEquals(driver.findElement(By.id("searchCntr")).getText(),
				"Show Fixed Kits:");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='searchCntr']/input[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='searchCntr']/input[1]"))
						.isSelected(), false);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='searchCntr']/input[3]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='searchCntr']/..//div[2]"))
						.isDisplayed(), true);

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[1]"))
						.getText(), "Kit");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[2]"))
						.getText(), "Edit Kit");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[3]"))
						.getText(), "Fixed");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[4]"))
						.getText(), "Kit Name");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[5]"))
						.getText(), "KitId");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[6]"))
						.getText(), "Kit Creator");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[7]"))
						.getText(), "Supply Name");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[9]"))
						.getText(), "First Date OOS");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[8]"))
						.getText(), "Supply Type");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[10]"))
						.getText(), "Last Date OOS");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[11]"))
						.getText(), "# Of Occurrences");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td/a[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td/a[1]"))
						.getText(), "View Kit");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td[2]/a"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td[2]/a"))
						.getText(), "Edit Kit");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[1]"))
						.isDisplayed(), true);
		// System.out.println("Left arrow in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[2]"))
						.isDisplayed(), true);
		// System.out.println("# 1 in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[5]/a"))
						.getText(), "ADMIN");

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

		System.out.println("Finished testMKAdminWarnedKitsPage");
	}

	@Test
	public void testMKAdminOOSKitsPage() throws Exception {

		System.out.println("Starting testMKAdminOOSKitsPage");

		login.LoginYahoo(driver);

		Thread.sleep(5000);

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
						.xpath("//ul[@id='persistent-area']/li[5]/ul/li[7]/a")))
				.click().build().perform();

		assertEquals(driver.getTitle(), "OutOfStockKits");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='uvTab']/..//div[2]/h2"))
						.getText(), "Out Of Stock Kit Supplies");

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

		assertEquals(driver.findElement(By.id("searchCntr")).getText(),
				"Show Fixed Kits:");
		assertEquals(
				driver.findElement(By.xpath("//div[@id='searchCntr']/input[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='searchCntr']/input[1]"))
						.isSelected(), false);
		assertEquals(
				driver.findElement(By.xpath("//div[@id='searchCntr']/input[3]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='searchCntr']/..//div[2]"))
						.isDisplayed(), true);

		assertEquals(
				"Kit",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[1]"))
						.getText());
		assertEquals(
				"Edit Kit",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[2]"))
						.getText());
		assertEquals(
				"Fixed",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[3]"))
						.getText());
		assertEquals(
				"Kit State",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[4]"))
						.getText());
		assertEquals(
				"Kit Name",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[5]"))
						.getText());
		assertEquals(
				"KitId",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[6]"))
						.getText());
		assertEquals(
				"Kit Creator",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[7]"))
						.getText());
		assertEquals(
				"Supply Name",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[8]"))
						.getText());
		assertEquals(
				"Supply Type",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[9]"))
						.getText());
		assertEquals(
				"First Date OOS",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[10]"))
						.getText());
		assertEquals(
				"Last Date OOS",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[11]"))
						.getText());
		assertEquals(
				"# Of Occurrences",
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr/th[12]"))
						.getText());
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td/a[1]"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td/a[1]"))
						.getText(), "View Kit");
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td[2]/a"))
						.isDisplayed(), true);
		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='oosKitRpt']/table/tbody/tr[2]/td[2]/a"))
						.getText(), "Edit Kit");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[1]"))
						.isDisplayed(), true);
		// System.out.println("Left arrow in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//div[2]/div/div/div/ul/li[2]"))
						.isDisplayed(), true);
		// System.out.println("# 1 in pagination is displayed");

		assertEquals(
				driver.findElement(
						By.xpath("//div[@id='uvTab']/..//header/div/nav/section/ul[2]/li[5]/a"))
						.getText(), "ADMIN");

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

		System.out.println("Finished testMKAdminOOSKitsPage");
	}

}

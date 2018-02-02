package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class OrderKitMaterialsPageProd {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() throws Exception {
//		System.out.println("Performing driver quit operation");
		driver.quit();
	}

	@Test
	public void testOrderKitMaterialsPage() throws Exception {

		System.out.println("Starting testOrderKitMaterialsPage");

		String baseURL = "https://mystikit.com/Kit/Search";

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

		// System.out
		// .println("The browser window with website opened and maximized");

		Thread.sleep(5000);

		// String iUrl = driver.getCurrentUrl();
		// String iTitle = driver.getTitle();
		// System.out.println("The current URL is " + iUrl);
		// System.out.println("The current page title is " + iTitle);

		driver.get("https://mystikit.com/silent-night-sign/-1A5");
		// System.out.println("Clicked on a kit to open Order page");

		// String iUrl2 = driver.getCurrentUrl();
		// String iTitle2 = driver.getTitle();
		// System.out.println("The current URL is " + iUrl2);
		// System.out.println("The current page title is " + iTitle2);
/*
		String warningHeader = driver
				.findElement(
						By.xpath("//div[@id='out-of-stock-notice']/h4"))
				.getText();
		String expectWarningHeader = "For this kit, please note one or more of the following:";

		assertEquals(warningHeader, expectWarningHeader);
		// System.out.println("The warning is displayed on the Order page");

		String leftWarning = driver.findElement(
				By.xpath("//div[@id='out-of-stock-notice']//ul/li[1]"))
				.getText();
		String expectLeftWarning = "There are some materials in this kit currently out of stock. You can still purchase the kit, but the out of stock items will not be included.";

		assertEquals(leftWarning, expectLeftWarning);
		// System.out
		// .println("The text of left warning is displayed on the Order page");

		String middleWarning = driver.findElement(
				By.xpath("//div[@id='out-of-stock-notice']//ul/li[2]"))
				.getText();
		String expectMiddleWarning = "Required material/tool is configured with products from outside of Amazon site.";

		assertEquals(middleWarning, expectMiddleWarning);
		// System.out
		// .println("The text of middle warning is displayed on the Order page");

		String rightWarning = driver.findElement(
				By.xpath("//div[@id='out-of-stock-notice']//ul/li[3]"))
				.getText();
		String expectRightWarning = "Required material/tool is a vintage item (marked as non-purchasable) or a common household item and a user is expected to find it on their own.";

		assertEquals(rightWarning, expectRightWarning);
		// System.out
		// .println("The text of right warning is displayed on the Order page");
*/
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='kit_detail']//div/span"))
						.isDisplayed());

		String kitTitle = driver.findElement(By.id("kit-title")).getText();
		String expectKitTitle = "Silent Night Sign";

		assertEquals(expectKitTitle, kitTitle);
		// System.out
		// .println("The correct kit title is displayed on the Order page");

		String begin = driver.findElement(
				By.xpath("//div[@id='kit_detail']//div[2]/h2/div/span[1]"))
				.getText();
		String expBegin = "Kit by";

		assertEquals(expBegin, begin);
		// System.out.println("Kit by is displayed");

		String kitter = driver.findElement(
				By.xpath("//div[@id='kit_detail']//div[2]/h2/div/a[1]"))
				.getText();
		String expKitter = "ThatsMyLetter";

		assertEquals(expKitter, kitter);
		// System.out.println("Kitter name is correctly displayed");

//		String staticLabel = driver.findElement(
//				By.xpath("//div[@id='kit_detail']//div[2]/h2/div/span[2]"))
//				.getText();
//		String expStaticLabel = ", project featured on";
//
//		assertEquals(staticLabel, expStaticLabel);

		String website = driver.findElement(By.linkText("ThatsMyLetter"))
				.getText();
		String expWebsite = "ThatsMyLetter";

		assertEquals(website, expWebsite);
		// System.out
		// .println("The string \"Kit by ThatsMyLetter, project featured on That's My Letter"
		// + "\" is displayed correctly on Order page");

		assertEquals(true, driver.findElement(By.id("description"))
				.isDisplayed());
		// System.out.println("The kit description '"
		// + driver.findElement(By.id("description")).getText()
		// + "' is displayed");

		String actMat = driver.findElement(
				By.xpath("//div[@id='buy_now']/div/table/tbody/tr[1]/td[1]"))
				.getText();
		String expMat = "Materials (5 selected)";
		assertEquals(expMat, actMat);

		String actTool = driver.findElement(
				By.xpath("//div[@id='buy_now']//div/table/tbody/tr[2]/td[1]"))
				.getText();
		String expTool = "Tools (1 selected)";
		assertEquals(expTool, actTool);

		String actKits = driver.findElement(
				By.xpath("//div[@id='buy_now']//div/table/tbody/tr[3]/td[2]"))
				.getText();
		assertEquals("1", actKits);

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='buy_now']//div/table/tbody/tr[4]/td[2]"))
						.isDisplayed());
		// System.out
		// .println("The Kit total price is displayed "
		// + driver.findElement(
		// By.xpath("//div[@id='buy_now']//div/table/tbody/tr[4]/td[2]"))
		// .getText());

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='carousel']//div/ul/li[1]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='carousel']//div/ul/li[2]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='carousel']//div/ul/li[3]"))
						.isDisplayed());
		// System.out.println("Pictures are displayed");

		assertEquals("Kit Details",
				driver.findElement(By.xpath("//div[@id='details']/h3"))
						.getText());

		assertEquals("Age Group: Teens & Older",
				driver.findElement(By.xpath("//div[@id='details']//ul/li[1]"))
						.getText());

		assertEquals("Skill Level: Beginner",
				driver.findElement(By.xpath("//div[@id='details']//ul/li[2]"))
						.getText());

		assertEquals("Time to Complete: 1 Hour(s)",
				driver.findElement(By.xpath("//div[@id='details']//ul/li[3]"))
						.getText());

		assertEquals("Special Skills: None",
				driver.findElement(By.xpath("//div[@id='details']//ul/li[4]"))
						.getText());

		assertEquals("Category: Home Decor/Home Accessories", driver
				.findElement(By.xpath("//div[@id='details']//ul/li[5]"))
				.getText());

		assertEquals("Tags: holiday decor, Christmas, signs", driver
				.findElement(By.xpath("//div[@id='details']//ul/li[6]"))
				.getText());

		assertEquals("Share this Kit",
				driver.findElement(By.xpath("//div[@id='share']/h3")).getText());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='share']//ul/li[1]"))
						.isDisplayed());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='share']//ul/li[2]"))
						.isDisplayed());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='share']//ul/li[3]"))
						.isDisplayed());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='share']//ul/li[4]"))
						.isDisplayed());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='share']//ul/li[5]"))
						.isDisplayed());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='buy_now']//div/img"))
						.isDisplayed());

		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='buy_now']//div[2]/a"))
						.isDisplayed());

		assertEquals("active", driver.findElement(By.id("materials_link"))
				.getAttribute("class"));

		assertEquals(true, driver.findElement(By.id("tools_link"))
				.isDisplayed());
		assertEquals(true, driver.findElement(By.id("instructions_link"))
				.isDisplayed());
		assertEquals(true, driver.findElement(By.id("comments_link"))
				.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='kit_tabs']//ul[2]/li/div/div/a[1]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='kit_tabs']//ul[2]/li/div/div/a[2]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='kit_tabs']//ul[2]/li/div/span"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='kit_tabs']//ul[2]/li/div[2]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='materials-list']/div[1]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='materials-list']/div[2]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='materials-list']/div[3]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='materials-list']/div[4]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='materials-list']/div[5]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div[1]/img"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div[1]/span[1]"))
						.isDisplayed());
		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div[1]/span[2]"))
						.isDisplayed());

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='footer-content']/div[2]"))
						.isDisplayed());
		String actDisclaimer = driver.findElement(
				By.xpath("//div[@id='footer-content']/div[2]")).getText();
		String expDisclaimer = "CERTAIN CONTENT THAT APPEARS ON THIS SITE COMES FROM AMAZON SERVICES LLC. THIS CONTENT IS PROVIDED ‘AS IS’ AND IS SUBJECT TO CHANGE OR REMOVAL AT ANY TIME.";
		assertEquals(expDisclaimer, actDisclaimer);

		assertEquals(
				true,
				driver.findElement(
						By.xpath("//div[@id='similarkits']//h3/small"))
						.isDisplayed());
		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='similarkits']//a[1]"))
						.isDisplayed());
		assertEquals(true,
				driver.findElement(By.xpath("//div[@id='similarkits']//a[5]"))
						.isDisplayed());
		assertEquals(true, driver.findElement(By.id("underline-bar"))
				.isDisplayed());

		System.out.println("Finished testOrderKitMaterialsPage");
	}
}

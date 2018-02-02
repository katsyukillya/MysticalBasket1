package com.example.test;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.common.YahooLogOff;
import com.example.common.YahooLoginToMystiKit;

public class MkCreateNewKitDeployProd {

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
	public void testCreateAKit() throws Exception {
		
		System.out.println("Starting testCreateAKit");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================
		
		login.LoginYahoo(driver);

		Thread.sleep(5000);

//		String til = driver.getTitle();
//		String il = driver.getCurrentUrl();
//		System.out.println("The current URL is " + il);
//		System.out.println("The current page title is " + til);
		assertEquals(
				"Mystikit: Find a project. View the kit. Buy everything you need with the click of a button! For all DIY project supplies - Arts & Crafts, Weddings, gifts, parties.",
				driver.getTitle());

		String homeHeader = driver.findElement(
				By.xpath("//div[@id='main-content-container']/div/div"))
				.getText();
		assertEquals(homeHeader, "Choose your project. Customize your kit.");
//		System.out.println("The text " + homeHeader + " is found");

		String slogan = driver.findElement(By.id("bottom-slogan")).getText();
		assertEquals(slogan, "Have everything shipped with just a few clicks!");
//		System.out.println("The text \"" + slogan + "\" is found");

		String browseAll = driver.findElement(By.id("browse-all-link"))
				.getText();
		assertEquals(browseAll, "BROWSE ALL");
//		System.out.println("The link \"" + browseAll + "\" is found");

		String viewAllKits = driver.findElement(By.linkText("View All Kits"))
				.getText();
		assertEquals(viewAllKits, "View All Kits");
//		System.out.println("The link \"" + viewAllKits + "\" is found");

		String clearCategories = driver.findElement(By.id("clear-categories"))
				.getText();
		assertEquals(clearCategories, "All Categories");
//		System.out.println("The link \"" + clearCategories + "\" is found");

		String catWoodworking = driver.findElement(By.linkText("Baby"))
				.getText();
		assertEquals(catWoodworking, "Baby");
//		System.out.println("The link \"" + catWoodworking + "\" is found");

		String catFoodCraft = driver.findElement(By.linkText("Electronics"))
				.getText();
		assertEquals(catFoodCraft, "Electronics");
//		System.out.println("The link \"" + catFoodCraft + "\" is found");

		String catFabricArt = driver.findElement(By.linkText("Entertaining"))
				.getText();
		assertEquals(catFabricArt, "Entertaining");
//		System.out.println("The link \"" + catFabricArt + "\" is found");

		String catHealthBeaut = driver.findElement(By.linkText("Fabric Arts"))
				.getText();
		assertEquals(catHealthBeaut, "Fabric Arts");
//		System.out.println("The link \"" + catHealthBeaut + "\" is found");

		String catHomeDec = driver.findElement(By.linkText("Fine Art"))
				.getText();
		assertEquals(catHomeDec, "Fine Art");
//		System.out.println("The link \"" + catHomeDec + "\" is found");

		String catPapArt = driver.findElement(By.linkText("Food Crafting"))
				.getText();

		assertEquals(catPapArt, "Food Crafting");
//		System.out.println("The link \"" + catPapArt + "\" is found");

		String catStFn = driver.findElement(By.linkText("Health & Beauty"))
				.getText();
		assertEquals(catStFn, "Health & Beauty");
//		System.out.println("The link \"" + catStFn + "\" is found");

		String catFineArt = driver.findElement(By.linkText("Home Decor"))
				.getText();
		assertEquals(catFineArt, "Home Decor");
//		System.out.println("The link \"" + catFineArt + "\" is found");

		String catWedding = driver.findElement(By.linkText("Household"))
				.getText();
		assertEquals(catWedding, "Household");
//		System.out.println("The link \"" + catWedding + "\" is found");

		String catSeason = driver.findElement(By.linkText("Kids Crafts"))
				.getText();
		assertEquals(catSeason, "Kids Crafts");
//		System.out.println("The link \"" + catSeason + "\" is found");

		String catKidsCraft = driver.findElement(By.linkText("Outdoor"))
				.getText();
		assertEquals(catKidsCraft, "Outdoor");
//		System.out.println("The link \"" + catKidsCraft + "\" is found");

		String catEntertain = driver.findElement(By.linkText("Paper Arts"))
				.getText();
		assertEquals(catEntertain, "Paper Arts");
//		System.out.println("The link \"" + catEntertain + "\" is found");

		String catElectr = driver.findElement(By.linkText("Pets")).getText();
		assertEquals(catElectr, "Pets");
//		System.out.println("The link \"" + catElectr + "\" is found");

		String catBaby = driver.findElement(By.linkText("Seasonal Crafting"))
				.getText();
		assertEquals(catBaby, "Seasonal Crafting");
//		System.out.println("The link \"" + catBaby + "\" is found");

		String catTech = driver.findElement(By.linkText("Style & Fashion"))
				.getText();
		assertEquals(catTech, "Style & Fashion");
//		System.out.println("The link \"" + catTech + "\" is found");

		String catPets = driver.findElement(By.linkText("Technology"))
				.getText();
		assertEquals(catPets, "Technology");
//		System.out.println("The link \"" + catPets + "\" is found");

		String catHouse = driver
				.findElement(By.linkText("Wedding & Reception")).getText();
		assertEquals(catHouse, "Wedding & Reception");
//		System.out.println("The link \"" + catHouse + "\" is found");

		String catOutdr = driver.findElement(By.linkText("Woodworking"))
				.getText();
		assertEquals(catOutdr, "Woodworking");
//		System.out.println("The link \"" + catOutdr + "\" is found");

		String catAge = driver.findElement(By.linkText("Age")).getText();
		assertEquals(catAge, "Age");
//		System.out.println("The link \"" + catAge + "\" is found");

		String catAgeKid = driver.findElement(By.xpath("//label")).getText();
		assertEquals(catAgeKid, "Kids");
//		System.out.println("The link \"" + catAgeKid + "\" is found");

		String catAgeTween = driver.findElement(By.xpath("//label[2]"))
				.getText();
		assertEquals(catAgeTween, "Tweens");
//		System.out.println("The link \"" + catAgeTween + "\" is found");

		String catAgeTeen = driver.findElement(By.xpath("//label[3]"))
				.getText();
		assertEquals(catAgeTeen, "Teens");
//		System.out.println("The link \"" + catAgeTeen + "\" is found");

		String catAgeAd = driver.findElement(By.xpath("//label[4]")).getText();
		assertEquals(catAgeAd, "Adults");
//		System.out.println("The link \"" + catAgeAd + "\" is found");

		String catDiffic = driver.findElement(By.linkText("Difficulty"))
				.getText();
		assertEquals(catDiffic, "Difficulty");
//		System.out.println("The link \"" + catDiffic + "\" is found");

		String catDifficBeg = driver.findElement(
				By.xpath("//li[4]/div/div/form/label")).getText();
		assertEquals(catDifficBeg, "Beginner");
//		System.out.println("The link \"" + catDifficBeg + "\" is found");

		String catDifficInter = driver.findElement(
				By.xpath("//li[4]/div/div/form/label[2]")).getText();
		assertEquals(catDifficInter, "Intermediate");
//		System.out.println("The link \"" + catDifficInter + "\" is found");

		String catDifficAdv = driver.findElement(
				By.xpath("//li[4]/div/div/form/label[3]")).getText();
		assertEquals(catDifficAdv, "Advanced");
//		System.out.println("The link \"" + catDifficAdv + "\" is found");

		String cost = driver.findElement(By.linkText("Cost")).getText();
		assertEquals(cost, "Cost");
//		System.out.println("The link \"" + cost + "\" is found");

		String costRange = driver.findElement(By.xpath("//div/label"))
				.getText();
		assertEquals(costRange, "$0 - Unlimited");
//		System.out.println("The sliders \"" + costRange + "\" is found");

		String time = driver.findElement(By.xpath("//li[6]/div/a")).getText();
		assertEquals(time, "Time");
//		System.out.println("The link \"" + time + "\" is found");

		String timeRange = driver
				.findElement(By.xpath("//li[6]/div/div/label")).getText();
		assertEquals(timeRange, "0 Hrs - Unlimited");
//		System.out.println("The sliders \"" + timeRange + "\" is found");

		String connect = driver.findElement(By.id("follow-section-header"))
				.getText();
		assertEquals(connect, "Connect with MystiKit...");
//		System.out.println("The link \"" + connect + "\" is found");

		String share = driver.findElement(By.id("share-section-header"))
				.getText();
		assertEquals(share, "Share MystiKit...");
//		System.out.println("The link \"" + share + "\" is found");

		String fbIcon = driver.findElement(By.xpath("//span/span/span"))
				.getText();
		assertEquals(fbIcon, "");
//		System.out.println("The icon \"Facebook\" is found");

		String twitIcon = driver.findElement(By.xpath("//span[2]/span/span"))
				.getText();
		assertEquals(twitIcon, "");
//		System.out.println("The icon \"Twitter\" is found");

		String pinIcon = driver.findElement(By.xpath("//span[3]/span/span"))
				.getText();
		assertEquals(pinIcon, "");
//		System.out.println("The icon \"Pinterest\" is found");

		String gIcon = driver.findElement(By.xpath("//span[4]/span/span"))
				.getText();
		assertEquals(gIcon, "");
//		System.out.println("The icon \"G+\" is found");

		String mailIcon = driver.findElement(By.xpath("//span[6]/span/span"))
				.getText();
		assertEquals(mailIcon, "");
//		System.out.println("The icon \"mail\" is found");

		String stIcon = driver.findElement(By.xpath("//span[7]/span/span"))
				.getText();
		assertEquals(stIcon, "");
//		System.out.println("The icon \"Share This\" is found");

		String shop = driver
				.findElement(
						By.linkText("SHOP Take me straight to the inspiring MystiKits!"))
				.getText();
		assertEquals("SHOP Take me straight to the inspiring MystiKits!", shop);
//		System.out
//				.println("The link \"SHOP\" Take me straight to the inspiring MystiKits! is found");

		String create = driver.findElement(
				By.linkText("CREATE KITS Become a MystiKit Kitter today..."))
				.getText();
		assertEquals(create, "CREATE KITS Become a MystiKit Kitter today...");
//		System.out
//				.println("The link \"CREATE KITS Become a MystiKit Kitter today...\" is found");

		String update = driver
				.findElement(
						By.linkText("UPDATES Get the latest delivered to your inbox..."))
				.getText();
		assertEquals(update,
				"UPDATES Get the latest delivered to your inbox...");
//		System.out
//				.println("The link \"UPDATES Get the latest delivered to to your inbox...\" is found");

		String imge = driver.findElement(By.className("mb-logo-center"))
				.getText();
		assertEquals(imge, "");
//		System.out.println("The image is found");
		String copyrt = driver.findElement(By.id("footer-content")).getText();
		assertEquals(copyrt, "©Mystical Basket 2013 - 2014");
//		System.out.println("The Copyright text is found");

		String view = driver.findElement(By.linkText("VIEW MORE")).getText();
		assertEquals(view, "VIEW MORE");
//		System.out.println("The link \"" + view + "\" is found");

//		System.out.println("Starting creating a new kit");
		// -------------------------------------------------------------------------------

		long tstamp = 0;
		java.util.Date date = new java.util.Date();
		System.out.println(new Timestamp(date.getTime()));
		tstamp = date.getTime();
//		System.out.println("Timestamp is " + tstamp);

//		System.out.println("Starting creating a new kit");
		// Selecting an item hidden in the drop down menu under User Name
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By
				.xpath("//a[contains(text(),'Illya Katsyuk')]"));
		action.moveToElement(we)
				.moveToElement(driver.findElement(By.xpath("//li[3]/a/strong")))
				.click().build().perform();

		Thread.sleep(2000);

		driver.findElement(By.id("createKitModal")).click();
		driver.findElement(By.xpath("//footer/div/form/input")).sendKeys(
				"Selenium" + tstamp);

		driver.findElement(By.xpath("//input[@value='Create']")).click();

//		String ny = driver.getCurrentUrl();
//		String nty = driver.getTitle();
//		System.out.println("The new page title is " + nty);
//		System.out.println("And the URL is " + ny);

		Timestamp msgTstamp = new Timestamp(date.getTime());
		driver.findElement(By.xpath("//li[@id='InfoTab']/div[4]/textarea"))
				.sendKeys(
						"This Kit has been created by new automated script based on Web-Driver "
								+ msgTstamp);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(
				"https://www.yahoo.com");

//		System.out.println("Entered website URL");

		// ========================================================================

		Thread.sleep(3000);

		String projUrl = driver.findElement(By.id("project-url")).getText();
		assertEquals("View URL", projUrl);
//		System.out.println("The link " + projUrl + " is found");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");

		Thread.sleep(1500);

		// Selecting an item hidden in the drop down menu under Category
//		System.out.println("Trying to select a Category");
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,150)");

		driver.findElement(
					By.xpath("//a[contains(text(),'Select a Category...')]"))
					.click();
			
			WebElement selWe = driver.findElement(By
					.xpath("//li[@id='InfoTab']/div[10]/div/div/ul/li[2]"));
//			System.out
//					.println("The element 'Baby' is found");
			
			Thread.sleep(2000);
			
			action.moveToElement(selWe)
					.moveToElement(
							driver.findElement(By.xpath("//li[@id='InfoTab']/div[10]/div/div/ul/li[2]")))
					.click().build().perform();
		
		Thread.sleep(1500);
		
		assertEquals("Baby", driver.findElement(By.xpath("//li[@id='InfoTab']/div[10]/div[1]/div/a[1]")).getText());

//		System.out.println("Category selection is finished");

		// Selecting an item hidden in the drop down menu under Sub-Category

//		System.out.println("Trying to select a Subcategory");

		try {
			driver.findElement(
					By.xpath("//a[contains(text(),'Select a SubCategory...')]"))
					.click();
			WebElement subWe = driver.findElement(By
					.xpath("//div[3]/div/ul/li[2]"));
			action.moveToElement(subWe)
					.moveToElement(
							driver.findElement(By
									.xpath("//div[3]/div/ul/li[2]"))).click()
					.build().perform();
		} catch (Error e) {
			System.out.println("Could not select a Sub-Category");
		}

		try {
			String cat = driver.findElement(
					By.xpath("//a[contains(text(),'Decor')]")).getText();
			assertEquals(cat, "Decor");
		} catch (Error e) {
			System.out.println("The 'Decor' link has not been found");
		}
//		System.out.println("Sub-Category selection is finished");

		Thread.sleep(3000);

		if (!driver.findElement(By.xpath("//div[4]/span")).isSelected()) {
			try {
				driver.findElement(By.cssSelector("span.custom.checkbox"))
						.click();
//				System.out.println("Checked the checkbox for URL verification");
			} catch (Error e) {
				System.out.println(e.toString());
			}
		}

		try {
			driver.findElement(By.xpath("//div[8]/div/div[2]")).click();
//			System.out.println("Closed modal popup - URL verification");
		} catch (Error e) {
			System.out.println(e.toString());
		}

		// ==============================================================================

		driver.findElement(By.xpath("//input[@name='hours']")).clear();
		driver.findElement(By.xpath("//input[@name='hours']")).sendKeys("1");
//		System.out.println("Entered 1 hour of the project completion");

		driver.findElement(By.xpath("//input[@name='minutes']")).clear();
		driver.findElement(By.xpath("//input[@name='minutes']")).sendKeys("30");
//		System.out
//				.println("Added 30 minutes. The total time is 1 hour 30 minutes");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
//		System.out.println("Scrolled back to the top of the page");

//		System.out.println("Switching to the Images tab");
		driver.findElement(By.xpath("//a[@id='Images_link']")).click();
		String imTitle = driver.getTitle();
		assertEquals("Edit - Selenium" + tstamp, imTitle);

		String imagesTitle = driver.findElement(By.xpath("//li[2]/h5"))
				.getText();
		assertEquals("Images", imagesTitle);
//		System.out.println("Correct title on the page " + imagesTitle
//				+ " found");

		String tabTitle = driver.findElement(By.xpath("//li[2]/div/label"))
				.getText();
		assertEquals("Kit Images", tabTitle);
//		System.out.println("The table header " + tabTitle + " found");

		String descr = driver.findElement(By.xpath("//div[2]/em")).getText();
		assertEquals(
				"You can upload up to 12 images (up to 4mb each). After uploading you can delete or rearrange their order",
				descr);
//		System.out
//				.println("Found correct text description above the Upload box");

		String instr = driver.findElement(By.xpath("//span/span")).getText();
		assertEquals("Drag photos here or", instr);
//		System.out.println("Instructions text " + instr + " found");

		String browseLink = driver.findElement(By.xpath("//span[2]/span"))
				.getText();
		assertEquals("browse", browseLink);
//		System.out.println("The '" + browseLink + "' link is found");

		String restInstr = driver.findElement(By.xpath("//span/span[3]"))
				.getText();
		assertEquals("for images on your computer", restInstr);
//		System.out.println("The rest of instruction '" + restInstr
//				+ "' is found");

		// Adding materials to the kit

		try {
			driver.findElement(By.id("Materials_link")).click();
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			System.out.println("Caught Exception");
			e1.printStackTrace();
		}

		String ttl = driver.getTitle();
		assertEquals("Edit - Selenium" + tstamp, ttl);
//		System.out.println("The page title is " + ttl);

		try {
			Boolean logo = driver.findElement(By.xpath("//div[2]/div/img"))
					.isDisplayed();
			assertEquals(true, logo);

			// assertEquals(true, logo);
		} catch (Exception e) {
			System.out.println("Incorrect verification of the logo presence");
		}
//		System.out
//				.println("Finished verifying the Logo presence at the bottom of page");

		String upperAddMat = driver.findElement(By.xpath("//li[3]/div[2]/a"))
				.getText();
		String lowerAddMat = driver.findElement(By.xpath("//div[5]/a"))
				.getText();
		assertEquals("Add Material", upperAddMat);
//		System.out.println("The upper '" + upperAddMat + "' link is found");

		assertEquals("Add Material", lowerAddMat);
//		System.out.println("The lower '" + lowerAddMat + "' link is found");

		String prvew = driver.findElement(By.id("preview")).getText();
		assertEquals("Preview", prvew);
//		System.out.println("The link '" + prvew + "' is found");

		String cprt = driver.findElement(
				By.xpath("//div[@id='footer-content']/div/span[2]")).getText();
		assertEquals(cprt, "Mystical Basket 2013 - 2014");
//		System.out.println("The correct copyright string '" + cprt
//				+ "'is found");

//		System.out.println("Scrolling back the page");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-200)");

		driver.findElement(By.xpath("//div[5]/a")).click();
//		System.out.println("Clicked on 'Add Material' link");

		driver.findElement(By.xpath("//div/ul/li/div/div/div/input")).sendKeys(
				"Water");
		driver.findElement(By.xpath("//dd[2]/a")).click();
//		System.out.println("Entered material name 'Water'");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//dd/a")).click();

		Thread.sleep(1500);

//		System.out.println("Switched back to the 'Material Information' tab");

		driver.findElement(By.xpath("//dd[2]/a")).click();
//		System.out.println("Switched to Products tab");

		String mainWindowHandle = driver.getWindowHandle();
//		System.out.println("The handle for main window is " + mainWindowHandle);

		driver.findElement(By.xpath("//li[2]/div/div/a")).click();
//			System.out.println("Clicked on 'Add Product' link");

		Thread.sleep(3000);
//		System.out.println("Waited for 3 seconds");

		// Getting all open windows handles
		Set<String> s = driver.getWindowHandles();
//		System.out.println("Got all handles for all opened windows");

		// Switching focus to the pop-up window

		Iterator<String> ite = s.iterator();
		while (ite.hasNext()) {
			String popupHandle = ite.next().toString();
			if (!popupHandle.contains(mainWindowHandle)) {
				driver.switchTo().window(popupHandle);

//				System.out.println("The pop-up handle is " + popupHandle);
			}
		}
//		System.out.println("Selected the pop-up");

		// Selecting the water from available products
		driver.findElement(By.xpath("//div[3]/h3/a/span")).click();
//		System.out.println("Selected a water product");

		// ====================================================================

		driver.get("https://mystikit.com/kit/AddProduct?vendor=amazon&productId=B000GD653C");
//		System.out.println("'Clicked' on the 'Add Product' bookmarklet");

		Thread.sleep(8000);
//		System.out.println("Waited for 8 seconds to popup fully load");

		driver.findElement(By.xpath("//form/div[3]/button[1]")).click();

		driver.close();
//		System.out.println("Closed pop-up");

		driver.switchTo().window(mainWindowHandle);
//		System.out.println("Switched to the main window");

//		System.out.println("Switched to the main window. The window title is "
//				+ driver.getTitle());

		driver.findElement(By.id("Tools_link")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Add Tool")).click();
//		System.out.println("Clicked on 'Add Tool' link");

		try {
			if (driver
					.findElement(
							By.xpath("//*[@id='simpleTool0_1Tab']/div/div[2]/ul/li[1]/select"))
					.isDisplayed()) {
//				System.out.println("The 'Required...' dropdown is present");
			} else {
				System.out.println("The drop down 'Required...' is missing");
			}
		} catch (NoSuchElementException e) {
			System.out
					.println("Caught an exception looking for 'Required...' drop down");
		}

		try {
			if (driver
					.findElement(
							By.xpath("//*[@id='simpleTool0_1Tab']/div/div[2]/ul/li[2]/select"))
					.isDisplayed()) {
//				System.out
//						.println("The 'Available for Purchase' dropdown is present");
			} else {
				System.out
						.println("The drop down 'Available for Purchase' is missing");
			}
		} catch (NoSuchElementException e) {
			System.out
					.println("Caught an exception looking for 'Available for Purchase' drop down");
		}

		driver.findElement(
				By.xpath("//*[@id='simpleTool0_1Tab']/div/div[1]/div[1]/input"))
				.sendKeys("Mug");
//		System.out.println("Entered tool name - 'Mug'");

		driver.findElement(By.partialLinkText("Products")).click();

		driver.findElement(By.linkText("Products (0)")).click();
//		System.out.println("Switched to 'Products' sub-tab");
		// driver.findElement(By.linkText("Add Product)[2]")).click();
		driver.findElement(
				By.xpath("//form/ul/li[4]/div[3]/div/div/div/ul/li[2]/div/div/a"))
				.click();
//		System.out.println("Clicked on the 'Add Product' link");

		Thread.sleep(3000);

		Set<String> st = driver.getWindowHandles();
//		System.out.println("Got all handles for all opened windows");

		// Switching focus to the pop-up window

		Iterator<String> iter = st.iterator();
		while (iter.hasNext()) {
			String popupHandle = iter.next().toString();
			if (!popupHandle.contains(mainWindowHandle)) {
				driver.switchTo().window(popupHandle);

//				System.out.println("The Tools pop-up handle is " + popupHandle);
			}
		}
//		System.out.println("Selected the pop-up");

		driver.findElement(By.linkText("Morning Mug (1)")).click();

//		System.out.println("Selected a first mug in the list");
//		String mugPrice = driver.findElement(By.id("priceblock_ourprice"))
//				.getText();
//		System.out.println("Price of the mucg is " + mugPrice);

		driver.close();
//		System.out.println("Closed pop-up");

		driver.switchTo().window(mainWindowHandle);
//		System.out.println("Switched to the main window");

//		System.out.println("Switched to the main window. The window title is "
//				+ driver.getTitle());

		driver.findElement(By.id("Instructions_link")).click();
//		System.out.println("Opened the Instructions sub-tab");

		Thread.sleep(3000);
//		System.out
//				.println("Slept for 3 seconds to have Instructions page fully loaded");

		driver.findElement(By.id("cke_30_label")).click();

		driver.findElement(By.xpath("//div[@id='cke_1_contents']/textarea"))
				.click();
		driver.findElement(By.xpath("//div[@id='cke_1_contents']/textarea"))
				.sendKeys(
						"The instructions for this kit were automatically generated via Selenium - Web Driver. More instructions can be found on the project URL");

//		System.out.println("Entered project instructions");

		driver.findElement(By.id("Publish_link")).click();

//		System.out.println("Switched to the 'Publish' sub-tab");

		driver.findElement(By.xpath("//li[@id='PublishTab']/div[2]/div/a[2]"))
				.click();
//		System.out.println("Selected the kit status drop down");

		Thread.sleep(1500);
//		System.out
//				.println("Slept for 3 seconds to have Instructions page fully loaded");

//		driver.findElement(
//				By.xpath("//li[@id='PublishTab']/div[2]/div/ul/li[2]")).click();
//		System.out.println("Selected the Deploy status for the kit");

//		System.out.println("The kit now is in 'Deployed' state");

//		tstamp = 0;
//		java.util.Date dateTwo = new java.util.Date();
//		System.out.println(new Timestamp(dateTwo.getTime()));
		
		System.out.println("Finished testCreateAKit");

	}

}

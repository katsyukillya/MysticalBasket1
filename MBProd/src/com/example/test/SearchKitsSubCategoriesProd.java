package com.example.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class SearchKitsSubCategoriesProd {

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
		// System.out.println("Performing driver quit operation");
		driver.quit();
	}

	@Test
	public void testSearchKitsSubCategories() throws Exception {

		System.out.println("Starting testSearchKitsSubCategories");

		// ===========================================================
		FirefoxProfile profile = new FirefoxProfile();
		profile.setEnableNativeEvents(true);
		// ===========================================================

		driver.get(baseURL);

		// System.out
		// .println("The browser window with website opened and maximized");
		//
		// String iUrl = driver.getCurrentUrl();
		// String iTitle = driver.getTitle();
		// System.out.println("The current URL is " + iUrl);
		// System.out.println("The current page title is " + iTitle);

		driver.findElement(By.linkText("Baby")).click();
		// System.out.println("Clicked on Baby category");

		Thread.sleep(4000);

		assertEquals(
				"Decor",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[1]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Baby --> Decor link is displayed");

		assertEquals(
				"Favors & Gifts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[1]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Baby --> Favors & Gifts link is displayed");

		assertEquals(
				"Floral",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[1]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Baby --> Floral link is displayed");

		assertEquals(
				"Stationery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[1]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Baby --> Stationery link is displayed");

		assertEquals(
				"Style & Fashion",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[1]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Baby --> Style & Fashion link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Electronics")).click();
		// System.out.println("Clicked on Electronics category");

		Thread.sleep(4000);

		assertEquals(
				"Gadgets",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[2]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Electronics --> Gadgets link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Entertaining")).click();
		// System.out.println("Clicked on Entertaining category");

		Thread.sleep(4000);

		assertEquals(
				"Decorating",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[3]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Entertaining --> Decorating link is displayed");

		assertEquals(
				"Favors & Gifts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[3]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Entertaining --> Favors & Gifts link is displayed");

		assertEquals(
				"Food Crafting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[3]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Entertaining --> Food Crafting link is displayed");

		assertEquals(
				"Stationery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[3]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Entertaining --> Stationery link is displayed");

		assertEquals(
				"Tailgating",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[3]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Entertaining --> Tailgating link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Fabric Arts")).click();
		// System.out.println("Clicked on the Fabric Arts link");

		Thread.sleep(4000);

		assertEquals(
				"Embroidery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Fabric Arts --> Embroidery link is displayed");

		assertEquals(
				"Fiber Arts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Fabric Arts --> Fiber Arts link is displayed");

		assertEquals(
				"Knitting / Crocheting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Fabric Arts --> Knitting / Crocheting link is displayed");

		assertEquals(
				"Needle Crafts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Fabric Arts --> Needle Crafts link is displayed");

		assertEquals(
				"No-sew",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Fabric Arts --> No-sew link is displayed");

		assertEquals(
				"Quilting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[6]/a"))
						.getText());
		// System.out.println("The Fabric Arts --> Quilting link is displayed");

		assertEquals(
				"Sewing",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[7]/a"))
						.getText());
		// System.out.println("The Fabric Arts --> Sewing link is displayed");

		assertEquals(
				"Upholstery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[4]/div/ul/li[8]/a"))
						.getText());
		// System.out.println("The Fabric Arts --> Upholstery link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Fine Art")).click();
		// System.out.println("Clicked on the Fine Art link");

		Thread.sleep(4000);

		assertEquals(
				"Ceramics/Pottery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[5]/div/ul/li[1]/a"))
						.getText());
		// System.out
		// .println("The Fine Art --> Ceramics/Pottery link is displayed");

		assertEquals(
				"Drawing/Painting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[5]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Fine Art --> Drawing/Painting link is displayed");

		assertEquals(
				"Glass",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[5]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Fine Art --> Glass link is displayed");

		assertEquals(
				"Photography",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[5]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Fine Art --> Photography link is displayed");

		assertEquals(
				"Print Making",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[5]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Fine Art --> Pring Making link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Food Crafting")).click();
		// System.out.println("Clicked on the Food Crafting link");

		Thread.sleep(4000);

		assertEquals(
				"Baking",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[6]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Food Crafting --> Baking link is displayed");

		assertEquals(
				"Candy",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[6]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Food Crafting --> Candy link is displayed");

		assertEquals(
				"Cooking",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[6]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Food Crafting --> Cooking link is displayed");

		assertEquals(
				"Decorating",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[6]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Food Crafting --> Decorating link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Health & Beauty")).click();
		// System.out.println("Clicked on the Health & Beauty link");

		Thread.sleep(4000);

		assertEquals(
				"Hair Styling",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[7]/div/ul/li[1]/a"))
						.getText());
		// System.out
		// .println("The Health & Beauty --> Hair Styling link is displayed");

		assertEquals(
				"Make Up",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[7]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Health & Beauty --> Make Up link is displayed");

		assertEquals(
				"Nail Care",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[7]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Health & Beauty --> Nail Care link is displayed");

		assertEquals(
				"Skin Care",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[7]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Health & Beauty --> Skin Care link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Home Decor")).click();
		// System.out.println("Clicked on Home Decor category");

		Thread.sleep(4000);

		assertEquals(
				"Flooring",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Home Decor --> Flooring link is displayed");

		assertEquals(
				"Floral Design",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Home Decor --> Floral Design link is displayed");

		assertEquals(
				"Home Accessories",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Home Decor --> Home Accessories link is displayed");

		assertEquals(
				"Lighting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Home Decor --> Lighting link is displayed");

		assertEquals(
				"Organization",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Home Decor --> Organization link is displayed");

		assertEquals(
				"Tablescapes",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[6]/a"))
						.getText());
		// System.out.println("The Home Decor --> Tablescapes link is displayed");

		assertEquals(
				"Wall Treatments",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[7]/a"))
						.getText());
		// System.out
		// .println("The Home Decor --> Wall Treatments link is displayed");

		assertEquals(
				"Window Treatments",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[8]/div/ul/li[8]/a"))
						.getText());
		// System.out
		// .println("The Home Decor --> Window Treatments link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Household")).click();
		// System.out.println("Clicked on Household category");

		Thread.sleep(4000);

		assertEquals(
				"Cleaning",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[9]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Household --> Cleaning link is displayed");

		assertEquals(
				"Emergency Supplies",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[9]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Household --> Wall Treatments link is displayed");

		assertEquals(
				"Installation",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[9]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Household --> Installation link is displayed");

		assertEquals(
				"Storage",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[9]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Household --> Storage link is displayed");

		assertEquals(
				"Maintenance",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[9]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Household --> Maintenance link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Kids Crafts")).click();
		// System.out.println("Clicked on Kids Crafts category");

		Thread.sleep(4000);

		assertEquals(
				"Decorating",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Kids Crafts --> Decorating link is displayed");

		assertEquals(
				"Fabric Arts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Kids Crafts --> Fabric Arts link is displayed");

		assertEquals(
				"Food Crafting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Kids Crafts --> Food Crafting link is displayed");

		assertEquals(
				"Games, Toys, Fun",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Kids Crafts --> Games, Toys, Fun link is displayed");

		assertEquals(
				"Learning Activities",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[5]/a"))
						.getText());
		// System.out
		// .println("The Kids Crafts --> Learning Activities link is displayed");

		assertEquals(
				"Paper Arts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[6]/a"))
						.getText());
		// System.out.println("The Kids Crafts --> Paper Arts link is displayed");

		assertEquals(
				"Style & Fashion",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[7]/a"))
						.getText());
		// System.out
		// .println("The Kids Crafts --> Style & Fashion link is displayed");

		assertEquals(
				"Visual Arts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[10]/div/ul/li[8]/a"))
						.getText());
		// System.out.println("The Kids Crafts --> Visual Arts link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 150)");

		driver.findElement(By.linkText("Outdoor")).click();
		// System.out.println("Clicked on Outdoor category");

		Thread.sleep(4000);

		assertEquals(
				"Decor",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[11]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Outdoor --> Decor link is displayed");

		assertEquals(
				"Garden",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[11]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Outdoor --> Garden link is displayed");

		assertEquals(
				"Landscaping",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[11]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Outdoor --> Landscaping link is displayed");

		assertEquals(
				"Lawn Maintenance",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[11]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Outdoor --> Lawn Maintenance link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 150)");

		driver.findElement(By.linkText("Paper Arts")).click();
		// System.out.println("Clicked on Paper Arts category");

		Thread.sleep(4000);

		assertEquals(
				"Drawing",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[12]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Paper Arts --> Drawing link is displayed");

		assertEquals(
				"Gift Giving",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[12]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Paper Arts --> Gift Giving link is displayed");

		assertEquals(
				"Origami",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[12]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Paper Arts --> Origami link is displayed");

		assertEquals(
				"Painting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[12]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Paper Arts --> Painting link is displayed");

		assertEquals(
				"Scrapbooking",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[12]/div/ul/li[5]/a"))
						.getText());
		// System.out.println("The Paper Arts --> Scrapbooking link is displayed");

		assertEquals(
				"Stationery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[12]/div/ul/li[6]/a"))
						.getText());
		// System.out.println("The Paper Arts --> Stationery link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 150)");

		driver.findElement(By.linkText("Pets")).click();
		// System.out.println("Clicked on Pets category");

		Thread.sleep(4000);

		assertEquals(
				"Accessories",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[13]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Pets --> Accessories link is displayed");

		assertEquals(
				"Beds",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[13]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Pets --> Beds link is displayed");

		assertEquals(
				"Clothing",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[13]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Pets --> Clothing link is displayed");

		assertEquals(
				"Food/Treats",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[13]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Pets --> Food/Treats link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 150)");

		driver.findElement(By.linkText("Seasonal Crafting")).click();
		// System.out.println("Clicked on Seasonal Crafting category");

		Thread.sleep(4000);

		assertEquals(
				"Christmas",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[1]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Christmas link is displayed");

		assertEquals(
				"Easter",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Easter link is displayed");

		assertEquals(
				"Father's Day",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Father's Day link is displayed");

		assertEquals(
				"Halloween",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Halloween link is displayed");

		assertEquals(
				"Mother's Day",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[5]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Mother's Day link is displayed");

		assertEquals(
				"New Years",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[6]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> New Years link is displayed");

		assertEquals(
				"Patriotic Days",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[7]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Patriotic Day link is displayed");

		assertEquals(
				"President's/MLK Days",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[8]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> President's/MLK Days link is displayed");

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 150)");

		assertEquals(
				"St. Patrick's Day",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[9]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> St. Patrick's Day link is displayed");

		assertEquals(
				"Thanksgiving",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[10]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Thanksgiving link is displayed");

		assertEquals(
				"Valentine's Day",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[11]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Valentine's Day link is displayed");

		assertEquals(
				"Spring",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[12]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Spring link is displayed");

		assertEquals(
				"Summer",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[13]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Summer link is displayed");

		assertEquals(
				"Fall",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[14]/a"))
						.getText());
		// System.out.println("The Seasonal Crafting --> Fall link is displayed");

		assertEquals(
				"Winter",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[14]/div/ul/li[15]/a"))
						.getText());
		// System.out
		// .println("The Seasonal Crafting --> Winter link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)");

		driver.findElement(By.linkText("Style & Fashion")).click();
		// System.out.println("Clicked on Style & Fashion category");

		Thread.sleep(4000);

		assertEquals(
				"Hair Accessories",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[15]/div/ul/li[1]/a"))
						.getText());
		// System.out
		// .println("The Style & Fashion --> Hair Accessories link is displayed");

		assertEquals(
				"Jewelry",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[15]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Style & Fashion --> Jewelry link is displayed");

		assertEquals(
				"Men's Clothing",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[15]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Style & Fashion --> Men's Clothing link is displayed");

		assertEquals(
				"Shoes",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[15]/div/ul/li[4]/a"))
						.getText());
		// System.out.println("The Style & Fashion --> Shoes link is displayed");

		assertEquals(
				"Women's Clothing",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[15]/div/ul/li[5]/a"))
						.getText());
		// System.out
		// .println("The Style & Fashion --> Women's Clothing link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)");

		driver.findElement(By.linkText("Technology")).click();
		// System.out.println("Clicked on Technology category");

		Thread.sleep(4000);

		assertEquals(
				"Blog Design",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[16]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Technology --> Blog Design link is displayed");

		assertEquals(
				"Digital Photography",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[16]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Technology --> Digital Photography link is displayed");

		assertEquals(
				"Equipment",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[16]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Technology --> Equipment link is displayed");

		assertEquals(
				"Graphic Design",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[16]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Technology --> Graphic Design link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)");

		driver.findElement(By.linkText("Wedding & Reception")).click();
		// System.out.println("Clicked on Wedding & Reception category");

		Thread.sleep(4000);

		assertEquals(
				"Decor",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[17]/div/ul/li[1]/a"))
						.getText());
		// System.out
		// .println("The Wedding & Reception --> Decor link is displayed");

		assertEquals(
				"Favors & Gifts",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[17]/div/ul/li[2]/a"))
						.getText());
		// System.out
		// .println("The Wedding & Reception --> Favors & Gifts link is displayed");

		assertEquals(
				"Floral",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[17]/div/ul/li[3]/a"))
						.getText());
		// System.out
		// .println("The Wedding & Reception --> Floral link is displayed");

		assertEquals(
				"Food Crafting",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[17]/div/ul/li[4]/a"))
						.getText());
		// System.out
		// .println("The Wedding & Reception --> Food Crafting link is displayed");

		assertEquals(
				"Stationery",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[17]/div/ul/li[5]/a"))
						.getText());
		// System.out
		// .println("The Wedding & Reception --> Stationery link is displayed");

		assertEquals(
				"Style & Fashion",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[17]/div/ul/li[6]/a"))
						.getText());
		// System.out
		// .println("The Wedding & Reception --> Style & Fashion link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 250)");

		driver.findElement(By.linkText("Woodworking")).click();
		// System.out.println("Clicked on Woodworking category");

		Thread.sleep(4000);

		assertEquals(
				"Carpentry",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[18]/div/ul/li[1]/a"))
						.getText());
		// System.out.println("The Woodworking --> Carpentry link is displayed");

		assertEquals(
				"Furniture",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[18]/div/ul/li[2]/a"))
						.getText());
		// System.out.println("The Woodworking --> Furniture link is displayed");

		assertEquals(
				"Refinishing",
				driver.findElement(
						By.xpath("//div[@id='categories-container']/ul/li[18]/div/ul/li[3]/a"))
						.getText());
		// System.out.println("The Woodworking --> Refinishing link is displayed");

		driver.findElement(By.id("clear-categories")).click();

		Thread.sleep(3000);

		System.out.println("Finished testSearchKitsSubCategories");
	}

}

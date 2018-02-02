package com.example.tests;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverAttempt {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://mkqa.azurewebsites.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }

  @Test
  public void testWebDriverAttempt() {
	  List<WebElement> elements = driver.findElements(By.xpath("//*"));
	  
	  System.out.println("Finished collecting elements on the page");
	  System.out.println("The total number of elements found on the page is"
			+ elements);
	  
	  for (WebElement el : elements) {
		  //String text = el.getText();
		  //String href = el.getAttribute("href");
		  String id = el.getAttribute(".//*");
		  System.out.print("Collected element #" + el + "\n");
		  System.out
				.println("The id value is: " + el.getAttribute("id"));
		  System.out.println("The xpath of that element is "
				+ el.getAttribute("xpath"));
		  System.out.println("The tag name is: " + el.getTagName());
		}
  }


}

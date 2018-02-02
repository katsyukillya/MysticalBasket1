package com.example.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YahooLoginToMystiKit {
	
	public void LoginYahoo(WebDriver driver) throws Exception {
		
		driver.get("https://mystikit.com");	// After the login is successful, opening mkqa page
//		System.out
//				.println("The browser window with website opened and maximized");
		
//		String i = driver.getCurrentUrl();
//		String ti = driver.getTitle();
//		System.out.println("The current URL is " + i);
//		System.out.println("The current page title is " + ti);

		Thread.sleep(5000);
		
//		Logging in to the account
		driver.findElement(By.id("loginLink")).click();
		driver.findElement(By.xpath("(//button[@name='provider'])[2]")).click();
//		System.out.println("Performing log in operation");

		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys(
				"illyak_1375405009230.test@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("t3$tAcc0unt@");

//		System.out.println("The checkbox selection is "
//				+ driver.findElement(By.id("pLabelC")).getAttribute("class"));

		String chkBox = driver.findElement(By.id("pLabelC")).getAttribute(
				"class");
		
//		System.out.println("Attribute is '" + chkBox + "'");
		
		String chkBoxExp = "checkbox lg-sprite checked ";

		if (chkBox != chkBoxExp) {

			driver.findElement(By.id("pLabelC")).click();
//			System.out.println("Checked the checkbox");
			
		} else {
			System.out.println("The checkbox was checked already");
		}

//		System.out.println("Now the checkbox selection is '"
//				+ driver.findElement(By.id("pLabelC")).getAttribute("class") + "'");

		Thread.sleep(5000);

		driver.findElement(By.id(".save")).click();

		Thread.sleep(5000);
		
	}

}

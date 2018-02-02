package com.example.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleLoginToMystiKit {
	
	public void LoginGoogle(WebDriver driver) throws Exception {
		
		driver.get("https://mystikit.com");	
		System.out
				.println("The browser window with website opened and maximized");
		
		String i = driver.getCurrentUrl();
		String ti = driver.getTitle();
		System.out.println("The current URL is " + i);
		System.out.println("The current page title is " + ti);

		Thread.sleep(5000);
		
//		Logging in to the account
		driver.findElement(By.id("loginLink")).click();
		driver.findElement(By.xpath("(//button[@name='provider'])[1]")).click();
		System.out.println("Performing log in operation");

		Thread.sleep(5000);
	
		System.out.println("Performing log in operation");
		driver.findElement(By.id("Email")).sendKeys("ikatsyuk@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("katsiscat");

//		driver.findElement(By.id("PersistentCookie")).click();		// In Gmail this checkbox is checked by default
//		System.out.println("Checked the checkbox");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(10000);
		



	}

}

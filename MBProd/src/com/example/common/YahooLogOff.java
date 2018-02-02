package com.example.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class YahooLogOff {

	public void LogoffYahoo(WebDriver driver) throws Exception {

		Actions actions = new Actions(driver);
		
		String unexpLink = "LOGIN";

		try {
			if ((driver.findElement(
					By.xpath("//ul[@id='persistent-area']/li[4]/a"))
					.isDisplayed() == true)
					&& (driver.findElement(
							By.xpath("//ul[@id='persistent-area']/li[4]/a"))
							.getText() != unexpLink)) {
				WebElement accountLink = driver.findElement(By
						.xpath("//ul[@id='persistent-area']/li[4]/a"));

				Thread.sleep(1500);

				actions.moveToElement(accountLink).build().perform();

				Thread.sleep(1500);

				actions.moveToElement(
						driver.findElement(By
								.xpath("//ul[@id='persistent-area']/li[4]/ul/li[5]/a")))
						.click().build().perform();

				Thread.sleep(5000);

				driver.get("https://login.yahoo.com/");

				Thread.sleep(10000);

				WebElement yahooImg = driver.findElement(By
						.className("yucs-avatar"));
				actions.moveToElement(yahooImg).build().perform();

				Thread.sleep(1500);

				actions.moveToElement(
						driver.findElement(By.className("yucs-signout")))
						.click().build().perform();

				Thread.sleep(4000);
			} else {
				driver.findElement(
						By.xpath("//ul[@id='persistent-area']/li[4]/a"))
						.click();
			}
		} catch (Exception e1) {
			System.out.println("Caught Exception");
		}

	}
}

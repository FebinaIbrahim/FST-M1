package com.activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		// Open the web page
		driver.get("https://training-support.net");

		// Print the page title
		System.out.println("Page title is: " + driver.getTitle());

		// Find the About Us link and click it
		driver.findElement(By.linkText("About Us")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Print the page title of the About Us page
		System.out.println("New page main title is: " + driver.findElement(By.tagName("h1")).getText());

		// Print the page sub title of the About Us page
		System.out.println("New page sub title is: " + driver.findElement(By.tagName("h2")).getText());

		// Quit the browser
		driver.quit();
	}
}

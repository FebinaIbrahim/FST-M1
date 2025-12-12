package com.activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();

		// Open the web page
		driver.get("https://training-support.net/webelements/login-form");

		// Print the title of the page
		System.out.println("Title of page is: " + driver.findElement(By.tagName("h1")).getText());

		// Find the username field and enter the username
		System.out.println("Entering username..");
		driver.findElement(By.id("username")).sendKeys("admin");
		// Find the password field and enter the password
		System.out.println("Entering password..");
		driver.findElement(By.id("password")).sendKeys("password");
		// Find the login button and click it
		System.out.println("Clicking Submit..");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		Thread.sleep(3000);
		// Print the confirmation message
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.findElement(By.tagName("h2")).getText());

		// Close the browser
		driver.quit();
	}
}
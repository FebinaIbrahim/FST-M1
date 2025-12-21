package com.activities.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4Login {
	WebDriver driver;
	
	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize Firefox driver
		driver = new FirefoxDriver();
		// Open the page
		driver.get("https://alchemy.hguy.co/crm");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginform")));
	}

	// Test function
	@Test
	public void login() {
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toolbar']")));
		System.out.println("=======================Test Case 4=======================");
		System.out.println("\nLogin Successful!!");
	}

	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

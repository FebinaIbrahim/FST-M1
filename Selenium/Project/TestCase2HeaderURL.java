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

public class TestCase2HeaderURL {

	WebDriver driver;

	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize Firefox driver
		driver = new FirefoxDriver();
		// Open the page
		driver.get("https://alchemy.hguy.co/crm");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginform")));
		
	}

	// Test function
	@Test
	public void headerUrl() {
		String imageUrl = driver.findElement(By.cssSelector("div.companylogo img")).getAttribute("src");
		System.out.println("=======================Test Case 2=======================");
		System.out.println("\nURL of the header image:" + imageUrl);
	}

	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

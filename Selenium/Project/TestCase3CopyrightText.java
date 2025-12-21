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

public class TestCase3CopyrightText {
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
	public void copyrightText() {
		String copyright = driver.findElement(By.xpath("//div[@class='p_login_bottom']/a[@id='admin_options']")).getText();
		System.out.println("=======================Test Case 3=======================");
		System.out.println("\nFirst copyright text in the footer:" + copyright);
	}

	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

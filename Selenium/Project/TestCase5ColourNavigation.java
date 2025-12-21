package com.activities.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase5ColourNavigation {
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
	    driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.name("Login")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toolbar']")));
		
	}

	// Test function
	@Test
	public void navigationMenu() {
		String navigationColour=driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("color");
		Color color=Color.fromString(navigationColour);
		System.out.println("=======================Test Case 5=======================");
		System.out.println("Color of Navigation Menu as RGB: " + color.asRgb());
        System.out.println("Color of Navigation Menu as hexcode: " + color.asHex());
	}

	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}


}


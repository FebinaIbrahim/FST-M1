package com.activities.project;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase1VerifyTitle {

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
    public void titleTest() {
    	System.out.println("=======================Test Case 1=======================");
    	System.out.println("\nPage Title is:"+driver.getTitle());
        // Assert page title
        Assert.assertEquals(driver.getTitle(), "SuiteCRM");
        System.out.println("\nAssert success!!Page Title matches the expected condition!\n");
     }
    
 // Teardown function
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}

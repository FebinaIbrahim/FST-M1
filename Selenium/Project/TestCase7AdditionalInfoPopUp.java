package com.activities.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase7AdditionalInfoPopUp {
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
		System.out.println("\nLogin Successful!!");
	}

	// Test function
	@Test
	public void popUpRead() throws InterruptedException {
		WebElement sales=driver.findElement(By.xpath("//a[contains(text(),'Sales') and @id='grouptab_0']"));
		sales.click();
		
		WebElement leads=driver.findElement(By.xpath("(//a[@id='moduleTab_9_Leads'])[1]"));
		leads.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Leads')]")));
		
		WebElement info=driver.findElement(By.xpath("(//tr[@class='oddListRowS1']//span[@title='Additional Details'])[1]"));
		Assert.assertTrue(info.isDisplayed());
		Assert.assertTrue(info.isEnabled());
		info.click();
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='phone']")));
		WebElement details=driver.findElement(By.xpath("//span[@class='phone']"));
		System.out.println("=======================Test Case 7=======================");
        System.out.println("Additional Details-Mobile : " + details.getText());
       
	}

	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
	 driver.quit();
	}

}

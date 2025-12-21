package com.activities.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase9TablePrintColumns {
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
		System.out.println("\nLogin Successful!!\n");
	}

	// Test function
	@Test
	public void popUpRead() throws InterruptedException {
		WebElement sales = driver.findElement(By.xpath("//a[contains(text(),'Sales') and @id='grouptab_0']"));
		sales.click();

		WebElement leads = driver.findElement(By.xpath("(//a[@id='moduleTab_9_Leads'])[1]"));
		leads.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Leads')]")));

		// Print the Full names and Usernames
		System.out.println("=======================Test Case 9=======================");
		List<WebElement> name = driver
				.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr/td[@field='name']"));
		System.out.println("Full names:\n");

		int count = 0;
		for (WebElement cell : name) {
			System.out.println(cell.getText().trim());
			count++;
			if (count == 10)
				break;
		}

		List<WebElement> uname = driver
				.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr/td[@field='assigned_user_name']"));
		System.out.println("\nUser names:\n");
		int count1 = 0;
		for (WebElement cell : uname) {
			System.out.println(cell.getText());
			count1++;
			if (count1 == 10)
				break;
		}

	}

	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}

package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verify_loginPage {
	
	public static void main(String[] args) {
		// Set up WebDriver
		WebDriver driver = new ChromeDriver();

		// Open the login page
		driver.get("https://example.com/login");

		// Locate username, password fields, and login button
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		// Enter credentials
		username.sendKeys("testuser");
		password.sendKeys("password123");

		// Click login button
		loginButton.click();

		// Assertion to verify successful login
		Assert.assertEquals(driver.getCurrentUrl(), "https://example.com/home", "Login Failed!");

		// Close browser
		driver.quit();
	}
}

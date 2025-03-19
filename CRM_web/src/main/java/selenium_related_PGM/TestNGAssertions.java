package selenium_related_PGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertions {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Test
	public void verifyGoogleTitle() {
		driver.get("https://www.google.com");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

package selenium_related_PGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		System.out.println("Google opened successfully!");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

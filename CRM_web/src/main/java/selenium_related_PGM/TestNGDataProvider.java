package selenium_related_PGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}

	@DataProvider(name = "urls")
	public Object[][] getUrls() {
		return new Object[][] { 
			{ "https://www.google.com" }, 
			{ "https://www.facebook.com" },
			{ "https://www.github.com" } };
	}

	@Test(dataProvider = "urls")
	public void openMultipleWebsites(String url) {
		driver.get(url);
		System.out.println("Opened: " + url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

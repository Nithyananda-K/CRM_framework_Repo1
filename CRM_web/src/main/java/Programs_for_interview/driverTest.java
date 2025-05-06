package Programs_for_interview;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverTest {
	WebDriver driver;

	// Constructor to initialize the WebDriver
	public driverTest(WebDriver driver) {
		this.driver = driver;
	}

	// Method to start the browser
	public void startBrowser() {
		driver.get("https://www.google.com"); // Replace with the required URL
	}

	public static void main(String[] args) {
		// Creating an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Creating an instance of DriverTest and passing the driver
		driverTest test = new driverTest(driver);

		// Calling the startBrowser method
	        test.startBrowser();
	    }
	}
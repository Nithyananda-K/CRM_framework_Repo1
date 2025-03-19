package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

public class Chrome_options_arguments {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");          // Start Chrome in maximized mode
		options.addArguments("--headless");               // Run Chrome in Headless Mode 
		options.addArguments("--disable-notifications");  // disable pop-ups 
		options.addArguments("--incognito");              // open in incagnito mode

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);

		driver.get("https://www.amazon.in/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}






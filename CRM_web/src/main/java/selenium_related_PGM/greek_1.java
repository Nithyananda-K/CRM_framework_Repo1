package selenium_related_PGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.

public class greek_1 {

	static WebDriver driver = null;

	public static void startbrowser(String browser) {

		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			driver = new ChromeDriver();
			break;
		}
	}

	public static String launchApp(){
		startbrowser("chrome");
		driver.get("https://www.youtube.com/");
		
		String url = driver.getCurrentUrl();
		return url;
	}
	
	
	public static void main(String[] args) {
		String URL= launchApp();
		System.out.println(URL);
	}
}

package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FrameHandling {
	public static void main(String[] args) {
		// Set up WebDriver
		WebDriver driver = new ChromeDriver();

		// Open webpage with frames
//		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.get("https://web-locators-static-site-qa.vercel.app/Frames");
		

		// Switch to frame by index (if multiple frames exist)
//		driver.switchTo().frame(1);

		
//		 Switch to frame by name or ID
//		 driver.switchTo().frame("frameName");

		// Switch to frame using WebElement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='iframe'][1]"));
		driver.switchTo().frame(frameElement);

		// Perform actions inside the frame
		WebElement acceptbtn = driver.findElement(By.xpath("//button[@class='button_frames']"));
		acceptbtn.click();
	
		// Switch back to the main content
		driver.switchTo().defaultContent();

		// Close browser
//		driver.quit();
	}
}

package selenium_related_PGM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

		// Creating JavaScript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down by 1000 pixels
		js.executeScript("window.scrollBy(0,1000)"); // scroll down
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,-1000)"); // scroll up
		Thread.sleep(5000);

		
		// Scroll horizontal
		js.executeScript("window.scrollBy(100,0)"); // scroll right
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(-100, 0)"); // scroll left
		Thread.sleep(5000);

		// Locate the element to scroll to (Example: "Footer" element)
        WebElement about_selenium = driver.findElement(By.xpath("(//a[contains(text(), 'About Selenium')])[2]"));

        // Scroll until the element is in view
        js.executeScript("arguments[0].scrollIntoView();", about_selenium);
        System.out.println("Scrolled to the footer element!");
//        driver.quit();
	}
}



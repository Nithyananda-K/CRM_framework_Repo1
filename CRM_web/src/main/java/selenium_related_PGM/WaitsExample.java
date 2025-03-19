package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class WaitsExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		
		// 1️⃣ IMPLICIT WAIT (applies to all elements globally)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open Demo Web Shop
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Opened Demo Web Shop!");

		// 2️⃣ Search for a product (Laptop)
		WebElement searchBox = driver.findElement(By.id("small-searchterms"));
		searchBox.sendKeys("laptop");

		WebElement searchButton = driver.findElement(By.cssSelector("input.button-1.search-box-button"));
		searchButton.click();
		System.out.println("Search initiated!");

		
		// 3️⃣ EXPLICIT WAIT (Wait for first product to be clickable)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement firstProduct = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'14.1-inch Laptop')])[1]")));
		firstProduct.click();
		System.out.println("Clicked on the first product!");

		// 4️⃣ FLUENT WAIT (Wait for Add to Cart button)
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)) // Max wait time
				.pollingEvery(Duration.ofSeconds(2)) // Check every 2 seconds
				.ignoring(NoSuchElementException.class); // Ignore NoSuchElementException

		WebElement addToCartButton = fluentWait.until(driver1 -> driver1.findElement(By.id("add-to-cart-button-31")));
		addToCartButton.click();
		System.out.println("Clicked Add to Cart!");

		// Scroll Down (Optional - Just to show JavaScript Executor use)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		System.out.println("Test Completed Successfully!");

		// Close browser
		driver.quit();
	}
}

package selenium_related_PGM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		System.out.println("Text Found: " + element.getText());
		driver.quit();
	}
}

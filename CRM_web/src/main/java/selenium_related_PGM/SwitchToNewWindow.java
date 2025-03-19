package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class SwitchToNewWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");

		// Click the button to open a new window
		WebElement newWindowButton = driver.findElement(By.xpath("//button[text()='    click   ']"));
		newWindowButton.click();

		// Get main window handle
		String mainWindow = driver.getWindowHandle();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window); // Switch to new window
				System.out.println("Switched to new window: " + driver.getTitle());
				driver.close(); // Close the new window
			}
		}

		driver.switchTo().window(mainWindow); // Switch back to main window
		System.out.println("Switched back to main window: " + driver.getTitle());
		driver.quit();
	}
}

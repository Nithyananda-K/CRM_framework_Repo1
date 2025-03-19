package selenium_related_PGM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class SwitchToNewTabExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// 1️⃣ Open Google in the first tab
		driver.get("https://www.google.com");

		// 2️⃣ Open new tabs
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('https://www.youtube.com', '_blank');");
		js.executeScript("window.open('https://www.amazon.in/', '_blank');");

		// 3️⃣ Wait for tabs to load (optional, but helps in some cases)
		Thread.sleep(2000);

		// 4️⃣ Store all window handles
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window(tabs.get(1)); // Last tab
		System.out.println("Switched to Youtube: " + driver.getTitle());

		// 5️⃣ Switch to Amazon tab (should be the last opened one)
		
		driver.switchTo().window(tabs.get(2)); // Last tab
		System.out.println("Switched to amazon: " + driver.getTitle());

		// 6️⃣ Switch back to Google
		driver.switchTo().window(tabs.get(0));
		System.out.println("Switched back to: " + driver.getTitle());

		String mainWindow = driver.getWindowHandle();
		

		// store all windows & To switch the window with condition
//		Set<String> allTabs = driver.getWindowHandles();
		
//		for (String tab : allTabs) {
//			if (!tab.equals(mainWindow)) {
//				driver.switchTo().window(tab); // Switch to the new tab
//				System.out.println("Switched to new tab: " + driver.getTitle());
//				Thread.sleep(3000); // Wait for YouTube to load
//				driver.close(); // Close the YouTube tab
//			}
//		}

//		// 4️⃣ Switch back to the original Google tab
		driver.switchTo().window(mainWindow);
		System.out.println("Switched back to Google: " + driver.getTitle());
	}
}




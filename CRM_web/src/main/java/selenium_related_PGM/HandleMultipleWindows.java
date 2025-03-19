package selenium_related_PGM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//button[text()= '    click   ']")).click();   // will open new tab
		Thread.sleep(5000);
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				System.out.println("New Window Title: " + driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
//		driver.quit();
		
	}
	
}

package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(accountList).perform();
		System.out.println("Mouse hovered successfully.");
		driver.quit();
	}
}

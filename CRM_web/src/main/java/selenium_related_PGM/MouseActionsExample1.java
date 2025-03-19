package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsExample1 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions actions = new Actions(driver);

		// Click on a button
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.click(button).perform();

		// Double Click
		actions.doubleClick(button).perform();

		// Right Click (Context Click)
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(rightClickButton).perform();

		// Hover over an element
		WebElement hoverElement = driver.findElement(By.xpath("//a[text()='Selenium']"));
		actions.moveToElement(hoverElement).perform();

		driver.quit();
	}
}

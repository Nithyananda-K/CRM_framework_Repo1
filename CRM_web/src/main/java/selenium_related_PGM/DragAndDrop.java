package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		// Switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		Actions actions = new Actions(driver);

		// Drag and Drop
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).perform();

		// Drag and Drop by Offset
		actions.dragAndDropBy(source, 100, 50).perform();

		// Click and Hold
		actions.clickAndHold(source).moveToElement(target).release().perform();

		driver.quit();
	}
}

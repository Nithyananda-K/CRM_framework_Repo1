package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CheckboxAutomation {
	public static void main(String[] args) {
		// Set up ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open webpage with checkboxes
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		// Get all checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		// Print checkbox count
		System.out.println("Total checkboxes: " + checkboxes.size());

		// Select the first checkbox
		if (!checkboxes.get(0).isSelected()) {
			checkboxes.get(0).click();
		}
		
		boolean firtOption = checkboxes.get(0).getText().equals("checkbox-1");
		Assert.assertTrue(firtOption, "incorrect Option");

		// Print if the first checkbox is selected
		System.out.println("First checkbox selected: " + checkboxes.get(0).isSelected());

		// Close browser
		driver.quit();
	}
}

package selenium_related_PGM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
		Select select = new Select(dropdown);
		
		List<WebElement> alloption = select.getOptions();

		for (WebElement option : alloption) {
			System.out.println(option.getText());
		}
		
		
		select.selectByIndex(1);
		select.selectByVisibleText("one");
		select.selectByValue("1");
		select.getFirstSelectedOption(); // Returns the currently selected option
		select.getOptions(); // Returns all available options in the dropdown
		select.isMultiple(); // Checks if the dropdown supports multiple selections
		select.getOptions().size(); // Returns the number of options in the dropdown
		System.out.println(select.getWrappedElement()); // ---> xpath: //select[@name='my-select']]

		select.deselectByIndex(2); // de-selecting the options
//		select.deselectByValue("value-3");
//		select.deselectByVisibleText("Option-2");

		

		// drop-down supports multi-select option select.getAllSelectedOptions(); //
		// Returns a list of all selected options in a multi-select drop-down.

		select.deselectAll(); // de-select all the selected options

		System.out.println("Selected option: " + select.getFirstSelectedOption().getText());
//		driver.quit();
	}
}

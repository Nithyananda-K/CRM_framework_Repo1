package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_data_fetch {
	
	
	 public static void main(String[] args) {
	        // Set up WebDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Navigate to the webpage
	        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

	        // Locate the web table
	        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

	        // Locate the specific cell (4th row, 2nd column)
	        WebElement cell = table.findElement(By.xpath(".//tr[4]/td[2]"));

	        // Print the text of the cell
	        System.out.println("Cell Value: " + cell.getText());

	        // Close the browser
//	        driver.quit();
	    }
}

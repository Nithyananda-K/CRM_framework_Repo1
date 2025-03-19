package selenium_related_PGM;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicTable {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));

		System.out.println("Total Rows: " + rows.size());
		System.out.println("Total Columns: " + cols.size());

		for (int i = 2; i <= rows.size(); i++) {
			for (int j = 1; j <= cols.size(); j++) {
				WebElement cell = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(cell.getText() + "  ");
			}
			System.out.println();
		}
//		driver.quit();
	}
}


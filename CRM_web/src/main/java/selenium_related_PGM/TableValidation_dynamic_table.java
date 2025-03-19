package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableValidation_dynamic_table {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));

        System.out.println("Total Rows: " + (rows.size() - 1)); // Excluding header row
        System.out.println("Total Columns: " + cols.size());

        // **Expected Data** (Each row is stored as a list inside a list)
        List<List<String>> expectedData = Arrays.asList(
            Arrays.asList("Alfreds Futterkiste", "Maria Anders", "Germany"),
            Arrays.asList("Centro comercial Moctezuma", "Francisco Chang", "Mexico"),
            Arrays.asList("Ernst Handel", "Roland Mendel", "Austria"),
            Arrays.asList("Island Trading", "Helen Bennett", "UK"),
            Arrays.asList("Laughing Bacchus Winecellars", "Yoshi Tannamuri", "Canada"),
            Arrays.asList("Magazzini Alimentari Riuniti", "Giovanni Rovelli", "Italy")
        );

        // **Extract Actual Data**
        List<List<String>> actualData = new ArrayList<>();
        
        for (int i = 2; i <= rows.size(); i++) {  // Start from row 2 to skip header
        	
            List<String> rowData = new ArrayList<>();
            
            for (int j = 1; j <= cols.size(); j++) {
                WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
                rowData.add(cell.getText().trim());
            }
            actualData.add(rowData);
        } 
        
        System.out.println(actualData);

        // **Validation: Compare Actual vs Expected**
        boolean dataMatches = actualData.equals(expectedData);

        if (dataMatches) {
            System.out.println("✅ Table data matches the expected data!");
        } else {
            System.out.println("❌ Table data does NOT match the expected data!");
            System.out.println("Expected: " + expectedData);
            System.out.println("Actual: " + actualData);
        }

//        driver.quit();
    }
}

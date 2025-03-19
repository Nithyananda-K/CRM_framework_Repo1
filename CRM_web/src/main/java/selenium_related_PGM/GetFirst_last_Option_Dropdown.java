package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GetFirst_last_Option_Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a working test site with a drop-down
        driver.get("https://the-internet.herokuapp.com/dropdown");

        // Explicit wait for drop-down to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdown")));

        // Select class for handling drop down
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        
        // get all options in the drop-down
        for(WebElement opt: options) {
        	System.out.println(opt.getText());
        }

        // get first & last drop-down options
        if (!options.isEmpty()) {
            System.out.println("First Option: " + options.get(0).getText());
            System.out.println("Last Option: " + options.get(options.size() - 1).getText());
        } else {
            System.out.println("Dropdown is empty!");
        }

//        driver.quit();
    }
}
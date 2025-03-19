package selenium_related_PGM;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.interactions.Actions;

public class Keyborad_actions {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");       // Start Chrome in maximized mode

		WebDriver driver = new ChromeDriver(options);
		Actions actions = new Actions(driver);

		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		WebElement searchfield = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));

		
		actions.sendKeys(searchfield, "bus").perform();
		actions.sendKeys(Keys.ENTER).perform();
		
		WebElement textfiled1 = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		WebElement textfiled2 = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		
		
		// Copy the text from textfield1 & paste it in textfield2 
		textfiled1.click();
		
		 // Step 1: Type text into the first input box
		textfiled1.sendKeys("Selenium Automation");

        // Step 2: Select all text (Ctrl + A)
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        // Step 3: Copy the text (Ctrl + C)
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // Step 4: Move to the second input box and paste (Ctrl + V)
        textfiled2.click();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        // Optional: Verify the pasted text
        String copiedText = searchfield.getAttribute("value");
        System.out.println("Pasted Text: " + copiedText);

        driver.quit();
	}
}
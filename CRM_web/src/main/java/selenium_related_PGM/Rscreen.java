package selenium_related_PGM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rscreen {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
	WebElement dropdown = driver.findElement(By.tagName("select"));
	Select sel= new Select(dropdown);

	sel.selectByIndex(2);
	sel.selectByValue("AUS");
	sel.selectByVisibleText("India");
	System.out.print(sel.getFirstSelectedOption());
	
//	
	
	 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 File dest= new File("screen.png");
	 FileUtils.copyFile(src, dest);
	
	}

}


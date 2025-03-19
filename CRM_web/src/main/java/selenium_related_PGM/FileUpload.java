package selenium_related_PGM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.file.io/");

//		WebElement uploadBtn1 = driver.findElement(By.xpath("//input[@type='file']"));
//		uploadBtn1.sendKeys("C:\\Users\\Nithya\\OneDrive\\Desktop\\Upload_file");
//		
//
//
//		System.out.println("File uploaded successfully.");
//		driver.quit();
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		WebElement uploadBtn2 = driver.findElement(By.xpath("//input[@class='ps-[30%]']"));
		wait.until(ExpectedConditions.visibilityOf(uploadBtn2));
		uploadBtn2.sendKeys("C:\\Users\\Nithya\\OneDrive\\Desktop\\Upload_file");
	}
}

package selenium_related_PGM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class HandleCAPTCHA {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");

		Thread.sleep(3000);
		WebElement captcha = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		captcha.click();

		Robot robot = new Robot();
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);

		System.out.println("CAPTCHA automated.");
//		driver.quit();
	}
}

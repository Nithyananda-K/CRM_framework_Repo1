package selenium_related_PGM;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement alertButton = driver.findElement(By.xpath("//button[contains(text(),'click the button to display an alert')]"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
        alert.accept();
        alert.dismiss();
        
        driver.quit();
    }
}

package selenium_related_PGM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CountLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + links.size());

        driver.quit();
    }
}

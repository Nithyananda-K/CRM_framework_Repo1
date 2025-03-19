package selenium_related_PGM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest1 {
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}

class ParallelTest2 {
	@Test
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}

// the below code is xml for parallel test execution
/*  
<suite name="Parallel Test Suite" parallel="tests" thread-count="2">
<test name="Test1">
    <classes>
        <class name="ParallelTest1"/>
    </classes>
</test>
<test name="Test2">
    <classes>
        <class name="ParallelTest2"/>
    </classes>
</test>
</suite>

*/

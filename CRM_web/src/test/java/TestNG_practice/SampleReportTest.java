package TestNG_practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crmweb.base_test.BaseClass;

public class SampleReportTest {

	ExtentReports report;
	
	@BeforeSuite
	public void config() {
		// Spark report config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM test suit result");
		spark.config().setReportName("CRM Reprt");
		spark.config().setTheme(Theme.DARK);

		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("BROWSER", "CHROME-113");	
	}
	
	@AfterSuite
	public void configAs() {
		report.flush();
	}
	
	@Test
	public void createContactTest() {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String filepath = ts.getScreenshotAs(OutputType.BASE64);
	
		ExtentTest test = report.createTest("createcontactTest");    // insert one test case in extend report
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate to contact page");
		test.log(Status.INFO, "create contact");
		if("HDFC".equals("HFCDC")) {
			test.log(Status.PASS, "contact is created");
		}else {
			test.log(Status.FAIL, "contact is not created");
			test.addScreenCaptureFromBase64String(filepath, "ErrorFile");
			//**************
		}
	}
}

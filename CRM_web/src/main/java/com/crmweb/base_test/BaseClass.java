package com.crmweb.base_test;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crmweb.genericdatabase_utilty.DataBaseUtility;
import com.crmweb.genericfile_utilty.ExcelUtility;
import com.crmweb.genericfile_utilty.FileUtility;
import com.crmweb.genericwebdriver_utilty.JavaUtility;
import com.crmweb.genericwebdriver_utilty.UtilityclassObject;
import com.crmweb.genericwebdriver_utilty.WebDriverUtility;
import com.crmweb.objectrepository_utility.HomePage;
import com.crmweb.objectrepository_utility.LoginPage;

import lombok.experimental.UtilityClass;

public class BaseClass extends WebDriverUtility {
	
	public FileUtility flib = new FileUtility(); // creating the object to call the FileUtility methods
	public JavaUtility jlib = new JavaUtility();
	public ExcelUtility elib = new ExcelUtility();
	public DataBaseUtility DBLib = new DataBaseUtility();
	public WebDriver driver = null;
	
	public static WebDriver sdriver = null;
	
	//(groups = "smokeTest", RegressionTest)
	@BeforeSuite
	public void configBS() throws SQLException {
		System.out.println("======Connect to DB before configue========");
		DBLib.getDbconnection();
		
	}

//	@Parameters("BROWSER")                                          //   String browser
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("===Launch Browser====");
		
		
		// We used in below Selenium version-4
//		String key="WebDriver.chrome,driver";
//		String value= "./resources/chromedriver.exe";
//		System.setProperty(key, value);
		
		
		String Browser = flib.getDataFromPopertyFile("browser");   // from property file 
//		String Browser = browser;                                   // from xml parameter 


		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equals("firfox")) {
			driver = new FirefoxDriver();
		} else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
//			driver = new ChromeDriver();
			System.out.println("***");
		}
		sdriver= driver;
		UtilityclassObject.setDriver(driver);
	}

	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("Login");
		String Url = flib.getDataFromPopertyFile("url");
		String UserName = flib.getDataFromPopertyFile("un");
		String Password = flib.getDataFromPopertyFile("pwd");

		impwaitForPageToLoad(driver); // from webdriver utility
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(Url, UserName, Password);
	}

	@AfterMethod
	public void configAM() {
		System.out.println("logout");
		HomePage hp = new HomePage(driver);
		hp.logout();
	}

	@AfterClass
	public void configAC() {
		System.out.println("===close Browser====");
		driver.quit();
	} 

	@AfterSuite
	public void configAS() throws SQLException {
		System.out.println("======Close DB, Report backup ========");
		DBLib.closeDbconnection();
	}

}

package com.crmweb.org_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;
import com.crmweb.genericfile_utilty.ExcelUtility;
import com.crmweb.genericfile_utilty.FileUtility;
import com.crmweb.genericwebdriver_utilty.JavaUtility;
import com.crmweb.genericwebdriver_utilty.WebDriverUtility;
import com.crmweb.objectrepository_utility.CreatingNewOrganisationPage;
import com.crmweb.objectrepository_utility.HomePage;
import com.crmweb.objectrepository_utility.LoginPage;
import com.crmweb.objectrepository_utility.OrgainizationsPage;
import com.crmweb.objectrepository_utility.OrganizationInfoPage;

public class V_Tigor_Delete_Org_handleDy_XpathCase_3_test  {

	@Test
	public void demo() throws Throwable {

		WebDriver driver = null;

		FileUtility flib = new FileUtility(); // creating the object to call the FileUtility methods
		JavaUtility jlib = new JavaUtility();
		ExcelUtility elib = new ExcelUtility();
		WebDriverUtility wlib= new WebDriverUtility();   

		String Browser = flib.getDataFromPopertyFile("browser");
		String Url = flib.getDataFromPopertyFile("url");
		String UserName = flib.getDataFromPopertyFile("un");
		String Password = flib.getDataFromPopertyFile("pwd");
		
		String orgName = elib.getDataFromExcelFile("org", 10, 2) + jlib.getRandomNumber();

		System.out.println(Browser);
		System.out.println(Url);
		System.out.println(UserName);
		System.out.println(Password);

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
		
		
		wlib.impwaitForPageToLoad(driver);
		driver.get(Url);
		driver.manage().window().maximize();

		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(UserName, Password);

		
		// Step-2: navigate to Organization module 
		HomePage hp= new HomePage(driver);
		hp.getOrgLink().click();
		
	
		//Step-3: click on create "organization" Button
		OrgainizationsPage cnp= new OrgainizationsPage(driver);
		cnp.getCreateNewOrgBtn().click();
	
//		Thread.sleep(10);
//		
		// Enter all the details & create new Organization
		CreatingNewOrganisationPage cnop = new CreatingNewOrganisationPage(driver);
		cnop.createorg(orgName);
		
		// verify header msg Expected Result
		OrganizationInfoPage oip= new OrganizationInfoPage(driver);
		String actOrgName= oip.getHeaderMsg().getText();
		if(actOrgName.contains(orgName)) {
			System.out.println(orgName + "is created = Pass");
		} else {
			System.out.println(orgName + "is not created = Fail");
		}
		
		//go back to Organizations page
		hp.getOrgLink().click();
		
		// search for organizations page 
		cnp.getSearchEdt().sendKeys(orgName);
		Thread.sleep(4000);
		wlib.select(cnp.getSearchDD(), "Organization Name");                // not woking 
//		wlib.select(cnp.getSearchDD(),1);

		cnp.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()= '"+orgName+"']/../../td[8]/a[text()='del']")).click();
		wlib.switchToAllertAccept(driver);

		System.out.println("pgm Ends");
//		hp.logout();
	}
}

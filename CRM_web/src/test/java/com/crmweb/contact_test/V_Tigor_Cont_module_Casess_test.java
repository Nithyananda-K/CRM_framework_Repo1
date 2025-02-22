package com.crmweb.contact_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crmweb.base_test.BaseClass;

@Listeners(com.crmweb.listener_utility.ListImpClass.class)

public class V_Tigor_Cont_module_Casess_test extends BaseClass {

	@Test(groups = "smokeTest")
	public void createContact_withName_test() throws Throwable {

		String lastName = elib.getDataFromExcelFile("contact", 1, 2) + jlib.getRandomNumber();
		// contact module
		WebElement ContOption = driver.findElement(By.xpath("//a[text()='Contacts']"));
		ContOption.click();

		// click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();

		// Enter all the details & create new Organization
		WebElement lastnamefield = driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys(lastName);
		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		saveButton.click();

		SoftAssert as= new SoftAssert();
		// verify header msg Expected Result
		String header_info = driver.findElement(By.xpath("//span[@class= 'dvHeaderText']")).getText();
		boolean status = header_info.contains("replace");
//		Assert.assertEquals(status, true);                  // hard assert
		as.assertEquals(status, true);                     // soft assert
		
		// verify lastName is saved as Expected
		String ActualLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		if (ActualLastName.contains(lastName)) {
			System.out.println(lastName + "is created = Pass");
		} else {
			System.out.println(lastName + "is not created = Fail");
		}
		as.assertAll();
	}

	@Test(groups = "RegressionTest")
	public void createContact_withDate_test() throws Throwable {

		String lastName = elib.getDataFromExcelFile("contact", 4, 2) + jlib.getRandomNumber();

		System.out.println(lastName);
		// contact module
		WebElement ContOption = driver.findElement(By.xpath("//a[text()='Contacts']"));
		ContOption.click();

		// click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();

//		Thread.sleep(10);		
		// Enter all the details & create new Organization
		WebElement lastnamefield = driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys(lastName);

		String Start_Date = jlib.getSystemDateYYYYDDMM();
		String End_Date = jlib.getRequiredDateYYYDDMM(30);

		WebElement su_start_date = driver.findElement(By.name("support_start_date"));
		su_start_date.clear();
		su_start_date.sendKeys(Start_Date);

		WebElement Support_End_Date = driver.findElement(By.name("support_end_date"));
		Support_End_Date.clear();
		Support_End_Date.sendKeys(End_Date);

		// Click on save button
		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		saveButton.click();

		// verify start date

		String actualStartDate_saved = driver.findElement(By.id("dtlview_Support Start Date")).getText();
		if (actualStartDate_saved.equals(Start_Date)) {
			System.out.println(Start_Date + "is verified = Pass");
		} else {
			System.out.println(Start_Date + "is not verified = Fail");
		}

		// verify start End date
		String actualEndDate_saved = driver.findElement(By.id("dtlview_Support End Date")).getText();
		if (actualEndDate_saved.equals(End_Date)) {
			System.out.println(End_Date + " is verified = Pass");
		} else {
			System.out.println(End_Date + " is not verified = Fail");
		}
	}

	@Test(groups = "RegressionTest")
	public void verifyContactIntegrationTest() throws Throwable {

		String orgName = elib.getDataFromExcelFile("contact", 7, 2) + jlib.getRandomNumber();
		String ContactLastName = elib.getDataFromExcelFile("contact", 7, 3) + jlib.getRandomNumber();

		// step-2 Navigate to organisation Module
		WebElement OrgOption = driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		OrgOption.click();

		// step-3 click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();

		// step-4 enter all the details to create new orgainisation

		WebElement OrgNamefield = driver.findElement(By.name("accountname"));
		OrgNamefield.sendKeys(orgName);

		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		saveButton.click();

		// verify header msg Expected Result
		String header_info = driver.findElement(By.xpath("//span[@class= 'dvHeaderText']")).getText();
		if (header_info.contains(orgName)) {
			System.out.println(orgName + "is created = Pass");
		} else {
			System.out.println(orgName + "is not created = Fail");
		}

		// Step 5: navigate to contact module
		WebElement ContOption = driver.findElement(By.xpath("//a[text()='Contacts']"));
		ContOption.click();

		// Step 6: click on create "organization" Button
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		Thread.sleep(10);
//		
		// Step 7: Enter all the details & create new Organization
		WebElement lastnamefield = driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys(ContactLastName);

		WebElement exist_orgSelect = driver
				.findElement(By.xpath("//input[@name='account_name']/following-sibling::img"));
		exist_orgSelect.click();

		switchToTabOnURL(driver, "module=Accounts"); // switch to child window

		WebElement exist_org_SearchFiled = driver.findElement(By.name("search_text"));
		exist_org_SearchFiled.sendKeys(orgName);

		WebElement searchButton = driver.findElement(By.name("search"));
		searchButton.click();

		WebElement existedOrg = driver.findElement(By.xpath("//a[text()='" + orgName + "']"));
		existedOrg.click();

		switchToTabOnURL(driver, "Contacts&action"); // switch to parent window

		// save for creating org
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		header_info = driver.findElement(By.xpath("//span[@class= 'dvHeaderText']")).getText();
		if (header_info.contains(ContactLastName)) {
			System.out.println(ContactLastName + "is created = Pass");
		} else {
			System.out.println(ContactLastName + "is not created = Fail");
		}

		// verify organization name info Expected Result
		String actorgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();

		if (actorgName.contains(orgName)) {
			System.out.println(orgName + "is verifed = Pass");
		} else {
			System.out.println(orgName + "is verifed = Fail");
		}
		System.out.println("pgm Ends");
	}
}
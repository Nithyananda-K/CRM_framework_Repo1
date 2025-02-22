package com.crmweb.contact_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;

public class V_Tigor_Cont_Case_3_test extends BaseClass {

	@Test
	public void verifyContactIntegrationTest() throws Throwable {

		String orgName = elib.getDataFromExcelFile("contact", 7, 2)+ jlib.getRandomNumber();
		String ContactLastName = elib.getDataFromExcelFile("contact", 7, 3)+ jlib.getRandomNumber();
		
				
		// step-2 Navigate to organisation Module 
		WebElement OrgOption = driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		OrgOption.click();

		// step-3 click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();
		
		//step-4 enter all the details to create new orgainisation 
		
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

		//Step 5:  navigate to contact module
		WebElement ContOption = driver.findElement(By.xpath("//a[text()='Contacts']"));
		ContOption.click();

		//Step 6: click on create "organization" Button
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//		Thread.sleep(10);
//		
		//Step 7:  Enter all the details & create new Organization
		WebElement lastnamefield = driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys(ContactLastName);

		WebElement exist_orgSelect = driver
				.findElement(By.xpath("//input[@name='account_name']/following-sibling::img"));
		exist_orgSelect.click();
	
		switchToTabOnURL(driver, "module=Accounts");   //switch to child window 

		WebElement exist_org_SearchFiled = driver.findElement(By.name("search_text"));
		exist_org_SearchFiled.sendKeys(orgName);

		WebElement searchButton = driver.findElement(By.name("search"));
		searchButton.click();

		WebElement existedOrg = driver.findElement(By.xpath("//a[text()='" + orgName + "']"));
		existedOrg.click();
	
		switchToTabOnURL(driver, "Contacts&action");  //switch to parent window 

		// save for creating org
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		header_info = driver.findElement(By.xpath("//span[@class= 'dvHeaderText']")).getText();
		if (header_info.contains(ContactLastName)) {
			System.out.println(ContactLastName + "is created = Pass");
		} else {
			System.out.println(ContactLastName + "is not created = Fail");
		}
		
		// verify organization name  info Expected Result
		String actorgName = driver.findElement(By.id("mouseArea_Organization Name")).getText();
		
		if (actorgName.contains(orgName)) {
			System.out.println(orgName + "is verifed = Pass");
		} else {
			System.out.println(orgName + "is verifed = Fail");
		}

		System.out.println("pgm Ends");
	}
}

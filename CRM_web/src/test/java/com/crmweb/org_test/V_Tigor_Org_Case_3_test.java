package com.crmweb.org_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;

public class V_Tigor_Org_Case_3_test extends BaseClass{

	@Test
	public void createOrg_with_phoneNumber_test() throws Throwable {
		String orgName= elib.getDataFromExcelFile("org", 7, 2)+ jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcelFile("org", 7, 3)+ jlib.getRandomNumber();
		WebElement OrgOption = driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		OrgOption.click();

		// click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();
		
		// Enter all the details & create new Organization
		WebElement OrgNamefield = driver.findElement(By.name("accountname"));
		OrgNamefield.sendKeys(orgName);

		WebElement phoneNumberfield = driver.findElement(By.id("phone"));
		phoneNumberfield.sendKeys(phoneNumber);

		// save the org
		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		saveButton.click();

		// verify the phone number
		String actual_phoneNumber = driver.findElement(By.id("dtlview_Phone")).getText();
		
		if (actual_phoneNumber.equals(phoneNumber)) {
			System.out.println(phoneNumber + "information is verifed = Pass");
		} else {
			System.out.println(phoneNumber + "information is not verifed = Fail");
		}

//		logout will not work without verifying the created org text
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		System.out.println("pgm Ends");
	}
}

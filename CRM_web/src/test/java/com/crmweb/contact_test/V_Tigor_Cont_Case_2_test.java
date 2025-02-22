package com.crmweb.contact_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;

public class V_Tigor_Cont_Case_2_test extends BaseClass {

	@Test
	public void decreateContact_withDate_test() throws Throwable {

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
}
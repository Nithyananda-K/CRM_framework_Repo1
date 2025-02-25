package com.crmweb.contact_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.crmweb.base_test.BaseClass;
import com.crmweb.genericwebdriver_utilty.UtilityclassObject;


@Listeners(com.crmweb.listener_utility.ListImpClass.class)
/**
 *  @author Nithya
 */
public class V_Tigor_Cont_Case_1_test extends BaseClass {

	@Test
	public void createContact_withName_test() throws Throwable {
		
		UtilityclassObject.getTest().log(Status.INFO, "read data from Excel");
		String lastName = elib.getDataFromExcelFile("contact", 1, 2) + jlib.getRandomNumber();
		UtilityclassObject.getTest().log(Status.INFO, "Home page");
		// contact module
		WebElement ContOption = driver.findElement(By.xpath("//a[text()='Contacts']"));
		ContOption.click();
		UtilityclassObject.getTest().log(Status.INFO, "Navigated to contact page");

		// click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();
		UtilityclassObject.getTest().log(Status.INFO, "Navigated to organisation page");

//		Thread.sleep(10);
//		
		UtilityclassObject.getTest().log(Status.INFO, "Entering lastname to create new organisation");
		// Enter all the details & create new Organization
		WebElement lastnamefield = driver.findElement(By.name("lastname"));
		lastnamefield.sendKeys(lastName);
		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		saveButton.click();
		UtilityclassObject.getTest().log(Status.INFO, "Orgainsation created successfully");

		
		// verify header msg Expected Result
		String header_info = driver.findElement(By.xpath("//span[@class= 'dvHeaderText']")).getText();
		boolean status = header_info.contains(lastName);
		Assert.assertEquals(status, true);                        // check the status is true or not 
		
		UtilityclassObject.getTest().log(Status.INFO, "Verifying header info");

		// replaced with hard assert
		/*
		 * if (header_info.contains(lastName)) { System.out.println(lastName +
		 * "is created = header_info Pass"); } else { System.out.println(lastName +
		 * "is not created = header_info Fail"); }
		 */

		
		// verify lastName is saved as Expected
		String ActualLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		SoftAssert softas= new SoftAssert();
		softas.assertEquals(ActualLastName, lastName);
		UtilityclassObject.getTest().log(Status.INFO, "Verifying last Name");
		softas.assertAll();
		
		// replaced with soft assert
		/*
		 * if (ActualLastName.equals(lastName)) { System.out.println(lastName +
		 * "is created = Pass"); } else { System.out.println(lastName +
		 * "is not created = Fail"); }
		 */ 
	}
}
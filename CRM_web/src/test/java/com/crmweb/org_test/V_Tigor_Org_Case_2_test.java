package com.crmweb.org_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;

public class V_Tigor_Org_Case_2_test extends BaseClass {

	@Test
	public void createOrg_withindustry_test() throws Throwable {
		String orgName= elib.getDataFromExcelFile("org", 4, 2)+ jlib.getRandomNumber();
		String industry= elib.getDataFromExcelFile("org", 4, 3);
		String type= elib.getDataFromExcelFile("org", 4, 4);

		WebElement OrgOption = driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		OrgOption.click();

		// click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();
	
		// Enter all the details & create new Organization
		WebElement OrgNamefield = driver.findElement(By.name("accountname"));
		OrgNamefield.sendKeys(orgName);
		
		WebElement induDropDown = driver.findElement(By.name("industry"));
		Select sel_1= new Select(induDropDown);
		sel_1.selectByVisibleText(industry);
		
		WebElement typeDropDown = driver.findElement(By.name("accounttype"));
		Select sel_2= new Select(typeDropDown);
		sel_2.selectByVisibleText(type);
			
		// save the org
		WebElement saveButton = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));
		saveButton.click();

		// verify the industry & type info 
		String actual_industryname = driver.findElement(By.id("dtlview_Industry")).getText();
		if (actual_industryname.equals(industry)) {
			System.out.println(industry + "information is verifed = Pass");
		} else {
			System.out.println(industry + "information is not verifed = Fail");
		}

		String actualType_name = driver.findElement(By.id("dtlview_Type")).getText();
		if (actualType_name.equals(type)) {
			System.out.println(type + "information is verifed = Pass");
		} else {
			System.out.println(type + "information is not verifed = Fail");
		}
		
		System.out.println("pgm Ends");

		// logout will not work without verifying the created org text
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();	
	}
}

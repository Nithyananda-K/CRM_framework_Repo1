package com.crmweb.org_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;
import com.crmweb.objectrepository_utility.CreatingNewOrganisationPage;
import com.crmweb.objectrepository_utility.HomePage;
import com.crmweb.objectrepository_utility.OrgainizationsPage;
import com.crmweb.objectrepository_utility.OrganizationInfoPage;

public class V_Tigor_Org_module_Casess_test extends BaseClass {

	@Test(groups = "smokeTest")      
	public void createOrg_test() throws Throwable {

		// read test script data from Excel file
		String orgName = elib.getDataFromExcelFile("org", 1, 2) + jlib.getRandomNumber();

		// Step-2: navigate to Organization module
		HomePage hp = new HomePage(driver);
		hp.getOrgLink().click();

		// Step-3: click on create "organization" Button
		OrgainizationsPage cnp = new OrgainizationsPage(driver);
		cnp.getCreateNewOrgBtn().click();

		// Enter all the details & create new Organization
		CreatingNewOrganisationPage cnop = new CreatingNewOrganisationPage(driver);
		cnop.createorg(orgName);

		// verify header msg Expected Result
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String actOrgName = oip.getHeaderMsg().getText();
		if (actOrgName.contains(orgName)) {
			System.out.println(orgName + "is created = Pass");
		} else {
			System.out.println(orgName + "is not created = Fail");
		}

		// verify header orgname info Expected Result
		String actorgnamefiled = driver.findElement(By.id("dtlview_Organization Name")).getText();
		if (actorgnamefiled.equals(orgName)) {
			System.out.println(orgName + "actorgnamefiled is verified = Pass");
		} else {
			System.out.println(orgName + "actorgnamefiled is not verified  = Fail");
		}
	}

	@Test(groups = "RegressionTest")
	public void createOrg_withindustry_test() throws Throwable {
		String orgName = elib.getDataFromExcelFile("org", 4, 2) + jlib.getRandomNumber();
		String industry = elib.getDataFromExcelFile("org", 4, 3);
		String type = elib.getDataFromExcelFile("org", 4, 4);

		WebElement OrgOption = driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		OrgOption.click();

		// click on create "organization" Button
		WebElement createOrgOption = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		createOrgOption.click();

		// Enter all the details & create new Organization
		WebElement OrgNamefield = driver.findElement(By.name("accountname"));
		OrgNamefield.sendKeys(orgName);

		WebElement induDropDown = driver.findElement(By.name("industry"));
		Select sel_1 = new Select(induDropDown);
		sel_1.selectByVisibleText(industry);

		WebElement typeDropDown = driver.findElement(By.name("accounttype"));
		Select sel_2 = new Select(typeDropDown);
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

	@Test(groups = "RegressionTest")
	public void createOrg_with_phoneNumber_test() throws Throwable {
		String orgName = elib.getDataFromExcelFile("org", 7, 2) + jlib.getRandomNumber();
		String phoneNumber = elib.getDataFromExcelFile("org", 7, 3) + jlib.getRandomNumber();
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

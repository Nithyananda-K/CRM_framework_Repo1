package com.crmweb.org_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crmweb.base_test.BaseClass;
import com.crmweb.objectrepository_utility.CreatingNewOrganisationPage;
import com.crmweb.objectrepository_utility.HomePage;
import com.crmweb.objectrepository_utility.OrgainizationsPage;
import com.crmweb.objectrepository_utility.OrganizationInfoPage;

public class V_Tigor_Create_Org_Case_1_test extends BaseClass {

	@Test
	public void createOrg_test() throws Throwable {
		// read test script data from Excel file 
		String orgName = elib.getDataFromExcelFile("org", 1, 2) + jlib.getRandomNumber();
	
		// Step-2: navigate to Organization module 
		HomePage hp= new HomePage(driver);
		hp.getOrgLink().click();
		
		//Step-3: click on create "organization" Button
		OrgainizationsPage cnp= new OrgainizationsPage(driver);
		cnp.getCreateNewOrgBtn().click();
		
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
		
		// verify header orgname info Expected Result
		String actorgnamefiled = driver.findElement(By.id("dtlview_Organization Name")).getText();
		if (actorgnamefiled.equals(orgName)) {
			System.out.println(orgName + "actorgname_field is verified = Pass");
		} else {
			System.out.println(orgName + "actorgname_field is not verified  = Fail");
		}
	}
}

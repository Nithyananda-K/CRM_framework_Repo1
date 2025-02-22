package com.crmweb.objectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganisationPage {
	
	
	WebDriver driver;
	public CreatingNewOrganisationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgNameEdt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	@FindBy(name="industry")
	private WebElement industryDB;

	public WebElement getOrgNameedt() {
		return orgNameEdt;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void createorg(String orgName) {
		orgNameEdt.sendKeys(orgName);
		savebtn.click();
	}
	
	public void createorg(String orgName, String industry) {
	
		orgNameEdt.sendKeys(orgName);
		Select sel= new Select(industryDB);
		sel.selectByVisibleText(industry);
		savebtn.click();
	}
	
}


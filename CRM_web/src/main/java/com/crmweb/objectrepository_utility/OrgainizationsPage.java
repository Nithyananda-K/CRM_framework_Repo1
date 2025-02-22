package com.crmweb.objectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgainizationsPage {

	WebDriver driver;
	public OrgainizationsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	@FindBy(name="search_text")
	private WebElement searchEdt;
	
	@FindBy(xpath ="//select[@id='bas_searchfield']")
	private WebElement searchDD;
	
	@FindBy(name="submit")
	private WebElement searchBtn;
	
	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getSearchDD() {
		return searchDD;
	}
	
	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;	
	}
	
	public WebElement getSearchBtn() {
		return searchBtn;	
	}
}

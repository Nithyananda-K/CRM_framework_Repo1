package com.crmweb.objectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactlink;

	@FindBy(linkText = "Campaigns")
	private WebElement Compaignlink;

	@FindBy(linkText = "More")
	private WebElement MoreLink;
	
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getMoreLink() {                            // getters method ( provide single element action )
		return MoreLink;
	}

	public void navigateToCompaginPage() {                       // business method ( provide multiple element action )
		Actions act = new Actions(driver);
		act.moveToElement(MoreLink).perform();
		Compaignlink.click();
	}
	
	public void logout() {
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		signOutLink.click();
	}
}







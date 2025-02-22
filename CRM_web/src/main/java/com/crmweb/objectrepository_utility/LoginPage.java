package com.crmweb.objectrepository_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * login to application based username, password, url argguments 
 * @param url
 * @parm username
 * @param password
 * 
 */

public class LoginPage { // Rule-1 create a separate java class

	WebDriver driver;
	public LoginPage(WebDriver driver) { // Rule-3 Object Initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='user_name']") // Rule-2 Object Creation
	private WebElement usernameEdit;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement passwordEdit;

	// Auto healing is backup for locating the elements, it will retry to identify
	// the same element using another locator dynamically
	@FindAll({ @FindBy(id = "submButton"), @FindBy(xpath = "//input[@type='submit']") })
	private WebElement loginBtn;

	
	/**
	 * 
	 * @return  UserName text_field
	 */
	public WebElement getUsernameEdit() { // Rule-4 : Object Encapsulation
		return usernameEdit; // Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void loginToApp(String username, String password) {          
		driver.manage().window().maximize();
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginBtn.click();

	}
	public void loginToApp(String url, String username, String password) {
		driver.manage().window().maximize();
		driver.get(url);
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginBtn.click();

	}

}

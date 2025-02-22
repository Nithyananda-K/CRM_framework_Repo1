package com.crmweb.genericwebdriver_utilty;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void impwaitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// implicit wait
	}

	public void expwaitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToTabOnURL(WebDriver driver, String partialURL) {
		// switch to child Window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String actURL = driver.getCurrentUrl();
			if (actURL.contains(partialURL)) {
				break;
			}
		}
	}
	
	public void switchToTabOnTitle(WebDriver driver, String partialTitle) {
		// switch to child Window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			String actTitle = driver.getTitle();
			if (actTitle.contains(partialTitle)) {
				break;
			}
		}
	}
	
	// Overload methods for switch to frames 
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}
	
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	
	// Overload methods for handling alerts
	public void switchToAllertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAllertCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	// Overload methods for handling drop down
	
	public void select(WebElement element, String text) {
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void select(WebElement element, int index) {
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	
	public void mousemoveOnElement(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void doubleclick(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.doubleClick(element).perform();
	}
}

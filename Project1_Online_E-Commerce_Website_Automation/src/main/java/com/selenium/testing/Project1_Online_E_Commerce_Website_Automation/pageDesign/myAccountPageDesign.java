package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPageDesign {
	
	public WebDriver driver;
	
	public myAccountPageDesign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="My account")
	WebElement myAccountBtn;
	
	@FindBy(css="div[class='side-2'] ul[class='list'] li")
	List<WebElement> accountList;
	
	public void clickMyAccount() {
		myAccountBtn.click();
	}
	
//	public List<WebElement> getAccountList() {
//		List<WebElement> accList;
//		for(WebElement x : accountList ) {
//			accList
//		}
//		return accList;
//	}
	
	
	
	
	
	
}

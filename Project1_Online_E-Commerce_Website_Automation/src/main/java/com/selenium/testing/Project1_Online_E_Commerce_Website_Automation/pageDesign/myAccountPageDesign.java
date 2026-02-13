package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign;

import java.util.List;
import java.util.stream.Collectors;

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
	
	public List<String> getMyAccountList() {
		List<String> accList = accountList.stream().map(x->x.getText()).collect(Collectors.toList());
		return accList;
	}
	
	public void clickMyAccountItem(String item) {
		for(WebElement x : accountList) {
			if (x.getText().equalsIgnoreCase(item)) {
				x.click();
			}
		}
	}
	
	public void clickCustomerInfo() {
		accountList.get(0).click();
	}
	public void clickAddresses() {
		accountList.get(1).click();
	}
	public void clickOrders() {
		accountList.get(2).click();
	}
	public void clickDownloadblePrducts() {
		accountList.get(3).click();
	}
	public void clickBackInStockSubscription() {
		accountList.get(4).click();
	}
	public void clickRewardPoints() {
		accountList.get(5).click();
	}
	public void clickChangePassword() {
		accountList.get(6).click();
	}
	
}

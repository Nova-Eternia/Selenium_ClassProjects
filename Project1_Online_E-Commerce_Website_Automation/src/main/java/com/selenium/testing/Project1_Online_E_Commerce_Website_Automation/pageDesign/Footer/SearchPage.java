package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.Footer;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}	
	

	//Search box
	
	@FindBy(xpath = "//input[@id='Q']")
	WebElement searchBox ;
	
	//Check Advanced Search
	@FindBy(id = "As")
	WebElement checkAdvSearch;
	
	//Check Auto search sub categories
	@FindBy(id = "Isc")
	WebElement checkSubCategories;
	
	//Check search in product descriptions 
	@FindBy(id = "Sid")
	WebElement checkProdDescriptions;
	
	//Search button
	@FindBy(xpath = "//input[@class='button-1 search-button']") 
	WebElement searchBtn;
	
	
	public void SearchProduct() {
		searchBox.sendKeys("Book");
		checkAdvSearch.click();
		checkSubCategories.click();
		checkProdDescriptions.click();
		searchBtn.click();	
	}
}

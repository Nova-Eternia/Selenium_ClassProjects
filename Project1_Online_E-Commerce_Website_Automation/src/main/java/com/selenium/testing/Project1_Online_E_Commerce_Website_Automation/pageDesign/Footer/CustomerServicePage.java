package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.Footer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class CustomerServicePage {
	WebDriver driver ;
	
	public CustomerServicePage(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText  = "Search")
	WebElement Search;
	
//	@FindBy(xpath = "//a[normalize-space()='News']")
	@FindBy(linkText  = "News")
	WebElement News;
	
//	@FindBy(xpath = "//a[normalize-space()='Blog']")
	@FindBy(linkText  = "Blog")
	WebElement Blog;
	
//	@FindBy(xpath = "//a[normalize-space()='Recents']")
	@FindBy(linkText  = "Recently viewed products")
	WebElement RecentlyViewedProducts;
	
//	@FindBy(xpath = "//a[normalize-space()='News']")
	@FindBy(linkText  = "Compare products list")
	WebElement CompareProducts;
	
//	@FindBy(xpath = "//a[normalize-space()='NewProducts']")
	@FindBy(linkText  = "New products")
	WebElement NewProducts;
	
	
	public void clickSearchLink() {
		Search.click();
	}
	
	public void clickNewsLink() {
		News.click();
	}
	
	public void clickBlogLink() {
		Blog.click();
	}
	public void clickRecentlyViewedProductsLink() {
		RecentlyViewedProducts.click();
	}
	public void clickCompareProductsLink() {
		CompareProducts.click();
	}
	
	public void clickNewProductsLink() {
		NewProducts.click();
	}
}	
	

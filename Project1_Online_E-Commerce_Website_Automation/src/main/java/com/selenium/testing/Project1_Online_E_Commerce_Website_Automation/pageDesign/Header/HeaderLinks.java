package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.Header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderLinks {

	WebDriver driver;

	public HeaderLinks(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='header-links'] a[class='ico-logout']")
	WebElement logOutBtn;

	@FindBy(css = "div[class='header-links'] a[class='account']")
	WebElement emailBtn;

	@FindBy(css = "div[class='header-links'] a[class='ico-cart']")
	WebElement shoppingCartBtn;

	@FindBy(css = "div[class='header-links'] a[class='ico-wishlist']")
	WebElement wishList;

	@FindBy(css = "#small-searchterms")
	WebElement searchBox;

	@FindBy(css = "input[value='Search']")
	WebElement searchBtn;

	public void ElementsToClick() {

	}

	public void clickLogOut() {
		logOutBtn.click();
	}

	public void clickEmail() {
		emailBtn.click();
	}

	public void clickShopingCart() {
		shoppingCartBtn.click();
	}

	public void clickWishList() {
		wishList.click();
	}

	public void search(String item) {
		searchBox.sendKeys(item);
		searchBtn.click();
	}
	
	// Verification of Links.
	public void verifyLogOut() {
		logOutBtn.click();
	}

	public void verifyEmail() {
		emailBtn.click();
	}

	public void verifyShopingCart() {
		shoppingCartBtn.click();
	}

	public void verifyWishList() {
		wishList.click();

	}
}

package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageDesign {

	public WebDriver driver;

	public LoginPageDesign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	WebElement username;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(css = "input[value='Log in']")
	WebElement submit;

	@FindBy(linkText = "Log in")
	WebElement loginBtn;

	@FindBy(linkText = "Log out")
	WebElement logOutBtn;

	public void login(String name, String pass) {
		username.sendKeys(name);
		password.sendKeys(pass);
		submit.click();
	}

	public void ClickLoginBtn() {
		loginBtn.click();
	}

	public void ClickLogOutBtn() {
		logOutBtn.click();
	}
}

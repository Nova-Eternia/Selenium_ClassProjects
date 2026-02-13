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
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(css = "input[value='Log in']")
	WebElement submit;

	@FindBy(linkText = "Log in")
	WebElement loginBtn;

	@FindBy(linkText = "Log out")
	WebElement logOutBtn;

	@FindBy(linkText = "Forgot password?")
	WebElement forgetPass;

	@FindBy(css = "div.page-title h1")
	WebElement verificationText;
	
	@FindBy(css="div[class=\"validation-summary-errors\"]")
	WebElement invalidText;

	public String getLoginPageHeading() {
		return verificationText.getText();
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickSubmit() {
		submit.click();
	}

	public boolean isLoginHeadingDisplayed() {
		return verificationText.isDisplayed();
	}
	
	public boolean isLogoutButtonDisplayed() {
		return logOutBtn.isDisplayed();
	}

	public void clickForgotPassword() {
		forgetPass.click();
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

	public void clickLogOut() {
		logOutBtn.click();
	}
	
	public String isInvalidTextPresent() {
		return invalidText.getText();
	}
	
	

}

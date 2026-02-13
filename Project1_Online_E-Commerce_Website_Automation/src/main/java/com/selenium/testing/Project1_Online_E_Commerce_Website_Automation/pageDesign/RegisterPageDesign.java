package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.openqa.selenium.*;
//import org.testng.Assert;


public class RegisterPageDesign {
	public WebDriver driver ;
	
	public RegisterPageDesign(WebDriver driver ){
		this.driver = driver ;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = "//label[normalize-space()='Male']")
	WebElement male;
	
	@FindBy(xpath = "//label[normalize-space()='Female']" )
	WebElement female;
	
	@FindBy(id = "FirstName")
	WebElement firstName ;
	
	@FindBy(id = "LastName")
	WebElement lastName;
	
	@FindBy(id = "Email" )
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement pwd;
	
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPwd ;
	
	@FindBy(id = "register-button")
	WebElement submitBtn;
	
	@FindBy(linkText = "Register")
	WebElement RegisterLink;
	
	@FindBy(xpath = "//div[@class='result']")
	WebElement verifyText;
	
	
	@FindBy(css = "input[value='Continue']")
	WebElement continueBtn;
	//Methods
	
	public void chooseGenderMale() {
		male.click();
	}
	
	public void chooseGenderFemale() {
		female.click();
	}
	
	public void FirstName(String FirstName) {
		firstName.sendKeys(FirstName);
	}
	
	public void LastName(String LastName) {
		lastName.sendKeys(LastName);
	}
	
	public void fillEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void fillPwd(String Pwd) {
		 pwd.sendKeys(Pwd);
	}
	
	public void fillConfirmPwd(String ConfirmPwd) {
		confirmPwd.sendKeys(ConfirmPwd);
	}
	
	public void register() {
		submitBtn.click();
	}
	
	public void clickRegister() {
		RegisterLink.click();
	}
	
	public void verifyRegistration() {
		String expectedStr = "Your registration completed";
		String resultStr = verifyText.getText() ;
		Assert.assertEquals(resultStr, expectedStr);
	}
	
	public void clickContinue() {
		continueBtn.click();
	}
	
}

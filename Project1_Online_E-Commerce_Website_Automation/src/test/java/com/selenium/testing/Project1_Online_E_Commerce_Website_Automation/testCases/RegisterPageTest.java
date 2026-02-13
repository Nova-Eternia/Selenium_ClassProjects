package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.RegisterPageDesign;

public class RegisterPageTest extends TestBase {
	
//	WebDriver driver = new ChromeDriver();
	public RegisterPageDesign register;
	
	@Test
	public void validRegistration() {
		register = new RegisterPageDesign(driver);
		register.clickRegister();
		register.chooseGenderFemale();
		register.FirstName("Riya");
		register.LastName("Singh");
		register.fillEmail("riyaSingh@example.com");
		register.fillPwd("riyaSingh@123");
		register.fillConfirmPwd("riyaSingh@123");
		register.register();
		register.verifyRegistration();
		register.clickContinue();	
	}
	
	@Test
	public void invalidPassowrdRegistration() {
		register = new RegisterPageDesign(driver);
		register.clickRegister();
		register.chooseGenderFemale();
		register.FirstName("Riya");
		register.LastName("Singh");
		register.fillEmail("riyaSingh@example.com");
		register.fillPwd("riyaSingh@123");
		register.fillConfirmPwd("riyaSingh@123");
		register.register();
		register.verifyRegistration();
		register.clickContinue();	
	}
	
	@Test
	public void sameEmailRegistration() {
		register = new RegisterPageDesign(driver);
		register.clickRegister();
		register.chooseGenderFemale();
		register.FirstName("Riya");
		register.LastName("Singh");
		register.fillEmail("riyaSingh@example.com");
		register.fillPwd("riyaSingh@123");
		register.fillConfirmPwd("riyaSingh@123");
		register.register();
		register.verifyRegistration();
		register.clickContinue();	
	}
	
	@Test
	public void invalidRegistration() {
		register = new RegisterPageDesign(driver);
		register.clickRegister();
		register.chooseGenderFemale();
		register.FirstName("Riya");
		register.LastName("Singh");
		register.fillEmail("riyaSingh@example.com");
		register.fillPwd("riyaSingh@123");
		register.fillConfirmPwd("riyaSingh@123");
		register.register();
		register.verifyRegistration();
		register.clickContinue();	
	}
}


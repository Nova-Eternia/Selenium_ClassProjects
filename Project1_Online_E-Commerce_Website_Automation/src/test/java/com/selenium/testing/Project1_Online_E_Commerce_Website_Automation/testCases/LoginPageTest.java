package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases;

import org.testng.annotations.Test;

import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.LoginPageDesign;

public class LoginPageTest extends TestBase{
	
	LoginPageDesign loginPage ;
	
	
	@Test
	public void loginPageTest() {
		loginPage = new LoginPageDesign(driver);
		
		loginPage.ClickLoginBtn();
		loginPage.login("bhura6262@gmail.com", "Bhura@123");
	}
}

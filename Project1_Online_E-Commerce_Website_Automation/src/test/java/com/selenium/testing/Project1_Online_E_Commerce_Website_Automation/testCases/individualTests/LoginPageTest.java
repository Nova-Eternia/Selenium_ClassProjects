package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases.individualTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.LoginPageDesign;

public class LoginPageTest extends TestBase {

    LoginPageDesign loginPage;

    @BeforeMethod
    public void setUpPage() {
        loginPage = new LoginPageDesign(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.clickLoginBtn();
        loginPage.enterEmail("bhura6262@gmail.com");
        loginPage.enterPassword("Bhura@123");
        loginPage.clickSubmit();

        Assert.assertTrue(loginPage.isLogoutButtonDisplayed());
    }

    @Test
    public void testInvalidLogin() {
        loginPage.clickLoginBtn();
        loginPage.enterEmail("bhura6262@gmail.com");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickSubmit();
        
        String expectedText = loginPage.isInvalidTextPresent();
        Assert.assertTrue(expectedText.contains("Login was unsuccessful."));
    }
}


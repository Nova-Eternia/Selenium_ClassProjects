package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;


import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.RegisterPageDesign;

public class RegisterPageTest extends TestBase {

    RegisterPageDesign register;
    
    @BeforeMethod
    public void setupTest() {
        driver.get("https://demowebshop.tricentis.com/");

        // If already logged in → logout
        if (driver.findElements(By.linkText("Log out")).size() > 0) {
            driver.findElement(By.linkText("Log out")).click();
        }
    }

    // TC_REG_01 – Successful Registration
    @Test
    public void TC_REG_01_validRegistration() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("Hana");
        register.enterLastName("Louis");
        register.enterEmail("hana.louis" + System.currentTimeMillis() + "@testmail.com");
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
        register.clickRegisterButton();

        Assert.assertEquals(
                register.getRegistrationSuccessMessage(),
                "Your registration completed",
                "Registration success message mismatch");

        Assert.assertTrue(
                register.isUserLoggedIn(),
                "User is not logged in after registration");

        register.clickContinueButton();
    }

    // TC_REG_02 – First Name Blank
    @Test
    public void TC_REG_02_firstNameBlank() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("");
        register.enterLastName("Louis");
        register.enterEmail("hana.blankfn" + System.currentTimeMillis() + "@testmail.com");
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
        register.clickRegisterButton();

        Assert.assertEquals(
                register.getFirstNameError(),
                "First name is required.",
                "First name validation failed");
    }

    // TC_REG_03 – Last Name Blank
    @Test
    public void TC_REG_03_lastNameBlank() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("Hana");
        register.enterLastName("");
        register.enterEmail("hana.blankln" + System.currentTimeMillis() + "@testmail.com");
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
        register.clickRegisterButton();

        Assert.assertEquals(
                register.getLastNameError(),
                "Last name is required.",
                "Last name validation failed");
    }

    // TC_REG_04 – Invalid Email
    @Test
    public void TC_REG_04_invalidEmail() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("Hana");
        register.enterLastName("Louis");
        register.enterEmail("hana.louis.com");
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
        register.clickRegisterButton();

        Assert.assertTrue(
                register.getEmailError().contains("Wrong email"),
                "Email validation failed");
    }

    // TC_REG_05 – Duplicate Email
    @Test
    public void TC_REG_05_duplicateEmail() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("Hana");
        register.enterLastName("Louis");
        register.enterEmail("hana.duplicate@testmail.com"); // already registered
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@123");
        register.clickRegisterButton();

        Assert.assertTrue(
                register.getDuplicateEmailError().contains("already exists"),
                "Duplicate email validation failed");
    }

    // TC_REG_06 – Password Mismatch
    @Test()
    public void TC_REG_06_passwordMismatch() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("Hana");
        register.enterLastName("Louis");
        register.enterEmail("hana.mismatch" + System.currentTimeMillis() + "@testmail.com");
        register.enterPassword("Test@123");
        register.enterConfirmPassword("Test@124");
        register.clickRegisterButton();

        Assert.assertTrue(
                register.getPasswordMismatchError().contains("do not match"),
                "Password mismatch validation failed");
    }

    // TC_REG_07 – Short Password
    @Test
    public void TC_REG_07_shortPassword() {

        register = new RegisterPageDesign(driver);

        register.clickRegisterLink();
        register.selectFemaleGender();
        register.enterFirstName("Hana");
        register.enterLastName("Louis");
        register.enterEmail("hana.shortpwd" + System.currentTimeMillis() + "@testmail.com");
        register.enterPassword("123");
        register.enterConfirmPassword("123");
        register.clickRegisterButton();

        Assert.assertTrue(
                register.getPasswordLengthError().contains("should have at least"),
                "Password length validation failed");
    }
}

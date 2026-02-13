package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPageDesign {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPageDesign(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // ================= LOCATORS =================

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(id = "gender-female")
    WebElement femaleGenderRadio;

    @FindBy(id = "FirstName")
    WebElement firstNameInput;

    @FindBy(id = "LastName")
    WebElement lastNameInput;

    @FindBy(id = "Email")
    WebElement emailInput;

    @FindBy(id = "Password")
    WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(css = ".result")
    WebElement registrationSuccessMsg;

    @FindBy(linkText = "Log out")
    WebElement logoutLink;

    @FindBy(css = "input[value='Continue']")
    WebElement continueButton;

    // Validation messages (correct DemoWebShop locators)

    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement firstNameError;

    @FindBy(xpath = "//span[@data-valmsg-for='LastName']")
    WebElement lastNameError;

    @FindBy(xpath = "//span[@data-valmsg-for='Email']")
    WebElement emailError;

    @FindBy(xpath = "//span[@data-valmsg-for='Password']")
    WebElement passwordError;

    @FindBy(xpath = "//span[@data-valmsg-for='ConfirmPassword']")
    WebElement confirmPasswordError;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    WebElement duplicateEmailError;

    // ================= ACTION METHODS =================

    public void clickRegisterLink() {
        wait.until(ExpectedConditions.elementToBeClickable(registerLink)).click();
    }

    public void selectFemaleGender() {
        wait.until(ExpectedConditions.elementToBeClickable(femaleGenderRadio)).click();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    // ================= GETTERS =================

    public String getRegistrationSuccessMessage() {
        return wait.until(ExpectedConditions.visibilityOf(registrationSuccessMsg)).getText();
    }

    public boolean isUserLoggedIn() {
        return wait.until(ExpectedConditions.visibilityOf(logoutLink)).isDisplayed();
    }

    public String getFirstNameError() {
        return wait.until(ExpectedConditions.visibilityOf(firstNameError)).getText();
    }

    public String getLastNameError() {
        return wait.until(ExpectedConditions.visibilityOf(lastNameError)).getText();
    }

    public String getEmailError() {
        return wait.until(ExpectedConditions.visibilityOf(emailError)).getText();
    }

    public String getDuplicateEmailError() {
        return wait.until(ExpectedConditions.visibilityOf(duplicateEmailError)).getText();
    }

    public String getPasswordMismatchError() {
        return wait.until(ExpectedConditions.visibilityOf(confirmPasswordError)).getText();
    }

    public String getPasswordLengthError() {
        return wait.until(ExpectedConditions.visibilityOf(passwordError)).getText();
    }
}

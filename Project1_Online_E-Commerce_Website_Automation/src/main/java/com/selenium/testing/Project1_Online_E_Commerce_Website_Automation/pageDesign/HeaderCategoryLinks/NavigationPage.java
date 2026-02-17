package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.HeaderCategoryLinks;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class NavigationPage {
    private WebDriver driver;
    private Actions actions;

    // Locates all top-level List Items (the <li> containers)
    // This is better because the <li> contains both the parent link AND the sub-menu
    @FindBy(xpath = "//ul[@class='top-menu']/li")
    private List<WebElement> topMenuListItemContainers;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * Returns the <li> containers for the 7 primary categories
     */
    public List<WebElement> getMenuContainers() {
        return topMenuListItemContainers;
    }

    /**
     * Gets the clickable <a> tag from a specific <li> container
     */
    public WebElement getPrimaryLink(WebElement container) {
        return container.findElement(By.xpath("./a"));
    }

    /**
     * Hovers and finds sub-links for a specific category
     */
    public List<WebElement> getSubLinks(WebElement container) {
        actions.moveToElement(container).perform();
        // Finds <a> tags inside the sublist <ul> if it exists
        return container.findElements(By.xpath(".//ul[contains(@class,'sublist')]//a"));
    }
}
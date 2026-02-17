package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases.navigationTest;



import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.HeaderCategoryLinks.NavigationPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class NavigationTest extends TestBase {

    @Test
    public void verifyPrimaryNavigation() {
    
        NavigationPage navPage = new NavigationPage(driver);
        
        List<WebElement> menuContainers = navPage.getMenuContainers();
        int totalCategories = menuContainers.size();
        
    

        for (int i = 0; i < totalCategories; i++) {
            // Re-fetch containers to avoid StaleElementReferenceException after navigation
            WebElement container = navPage.getMenuContainers().get(i);
            WebElement link = navPage.getPrimaryLink(container);
            String categoryName = link.getText().trim();

            
          
            link.click();

            // Verification: Title or URL should contain the category name
            String currentUrl = driver.getCurrentUrl().toLowerCase();
           
            
            // Basic assertion: URL should contain keywords from category name (e.g., 'books')
            Assert.assertTrue(currentUrl.contains(categoryName.toLowerCase().split(" ")[0]), 
                "Redirection failed for " + categoryName);
            
          

            // Navigate back to the Home page to continue the loop
            driver.navigate().back();
        }
    }

    @Test
    public void verifySubCategoryNavigation() {
       
        NavigationPage navPage = new NavigationPage(driver);

        // Locating the 'ELECTRONICS' container as per your test case
        WebElement electronicsContainer = navPage.getMenuContainers().stream()
                .filter(c -> navPage.getPrimaryLink(c).getText().equalsIgnoreCase("Electronics"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Electronics category not found"));

    
        
        // 1. Hover and get sub-links
        List<WebElement> subLinks = navPage.getSubLinks(electronicsContainer);
        
        // 2. Verify sub-menu visibility
        Assert.assertFalse(subLinks.isEmpty(), "Sub-menu was not displayed on hover!");
       
        // 3. Select 'Cell phones' from the list
        WebElement cellPhoneLink = subLinks.stream()
                .filter(l -> l.getText().equalsIgnoreCase("Cell phones"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cell phones sub-link not found"));

      
        
        cellPhoneLink.click();

        // 4. Verify landing page
        Assert.assertTrue(driver.getCurrentUrl().contains("cell-phones"), "URL did not match Cell Phones page");
        Assert.assertTrue(driver.getTitle().contains("Cell phones"), "Page Title did not match");
        
       
    }
}

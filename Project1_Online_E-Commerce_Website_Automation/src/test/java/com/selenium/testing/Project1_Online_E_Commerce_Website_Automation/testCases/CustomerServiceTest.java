package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases;

import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
//import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.RegisterPageDesign;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.Footer.CustomerServicePage;

import org.testng.Assert;
import org.testng.annotations.*;

public class CustomerServiceTest extends TestBase {

	public CustomerServicePage customerServicePageObj ;

	@Test
	public void verifySearchPageNavigation() {
		customerServicePageObj = new CustomerServicePage(driver) ;
		customerServicePageObj.clickSearchLink();
		String currentURL = driver.getCurrentUrl();
		String expURL = "https://demowebshop.tricentis.com/search";
		Assert.assertEquals(currentURL, expURL);
	}
	
	@Test
	public void verifyNewsPageNavigation() {
		customerServicePageObj = new CustomerServicePage(driver) ;
		customerServicePageObj.clickNewsLink();
		String  currentURL = driver.getCurrentUrl();
		String expURL = "https://demowebshop.tricentis.com/news";
		Assert.assertEquals(currentURL, expURL);
	}
	
	@Test
	public void verifyRecentlyViewedProductsNavigation() {
		customerServicePageObj = new CustomerServicePage(driver) ;
		customerServicePageObj.clickRecentlyViewedProductsLink();
		String  currentURL = driver.getCurrentUrl();
		String expURL = "https://demowebshop.tricentis.com/recentlyviewedproducts";
		Assert.assertEquals(currentURL, expURL);
	}
	
	@Test
	public void verifyCompareProducts() {
		customerServicePageObj = new CustomerServicePage(driver) ;
		customerServicePageObj.clickCompareProductsLink();
		String  currentURL = driver.getCurrentUrl();
		String expURL = "https://demowebshop.tricentis.com/compareproducts";
		Assert.assertEquals(currentURL, expURL);
	}
	
	@Test
	public void verifyNewProducts() {
		customerServicePageObj = new CustomerServicePage(driver) ;
		customerServicePageObj.clickNewProductsLink();
		String  currentURL = driver.getCurrentUrl();
		String expURL = "https://demowebshop.tricentis.com/newproducts";
		Assert.assertEquals(currentURL, expURL);
	}	
}


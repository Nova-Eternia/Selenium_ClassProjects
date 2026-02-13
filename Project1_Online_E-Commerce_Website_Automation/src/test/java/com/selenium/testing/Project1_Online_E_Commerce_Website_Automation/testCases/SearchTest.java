package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.testCases;

import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base.TestBase;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.Footer.CustomerServicePage;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.pageDesign.Footer.SearchPage;

import org.testng.Assert;
import org.testng.annotations.*;

public class SearchTest extends TestBase {
	
//	WebDriver driver = new ChromeDriver();
	public SearchPage search;
	
	@Test
	public void SearchTest() {
		search = new SearchPage(driver);
		search.SearchProduct();
		String expURL = "https://demowebshop.tricentis.com/search?Q=book&As=true&As=false&Cid=0&Isc=true&Isc=false&Mid=0&Pf=&Pt=&Sid=true&Sid=false";
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, expURL);
	}
	

	@Test(priority = 1)
	public void verifySearchPageNavigation() {
		CustomerServicePage customerServicePageObj ;
		customerServicePageObj = new CustomerServicePage(driver) ;
		customerServicePageObj.clickSearchLink();
		String currentURL = driver.getCurrentUrl();
		String expURL = "https://demowebshop.tricentis.com/search";
		Assert.assertEquals(currentURL, expURL);
	}
}


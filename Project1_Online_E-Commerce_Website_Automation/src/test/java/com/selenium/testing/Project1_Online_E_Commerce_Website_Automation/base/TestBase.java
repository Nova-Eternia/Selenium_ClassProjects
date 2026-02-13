package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.utilities.ExtentManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties global = new Properties();
	public static FileInputStream file;
	public static WebDriverWait wait;
	
	
	public static ExtentReports extent = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	@BeforeClass
	public void atStart() throws IOException{
		if(driver == null) {
			file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//config.properties");
			config.load(file);			config.load(file);
			
			file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//global.properties");
			global.load(file);
		}
		
		String browser = global.getProperty("browser");
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")) {
			driver =  new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			driver =  new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		String url = global.getProperty("websiteURL");
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	@AfterTest
	public void atEnd() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}

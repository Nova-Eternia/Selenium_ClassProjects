package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestBase {
	WebDriver driver;
	
	@BeforeClass
	public void atStart(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterTest
	public void atEnd() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}

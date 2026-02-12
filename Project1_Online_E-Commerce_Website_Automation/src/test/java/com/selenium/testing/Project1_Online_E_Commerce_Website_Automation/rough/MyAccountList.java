package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.rough;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountList{
	
	public static void main(String[] args) throws InterruptedException {
		
		Logger logger = Logger.getLogger(MyAccountList.class.getName());
		logger.log(Level.INFO,"Hi");
		logger.log(Level.WARNING,"Welcome");
		logger.log(Level.SEVERE,"Bye");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("bhura6262@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Bhura@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		driver.findElement(By.linkText("My account")).click();
//		Thread.sleep(3000);
		List<WebElement> accList = driver.findElements(By.cssSelector("div[class='side-2'] ul[class='list'] li"));
		System.out.println("Account List : " + accList);
		
		List<String> accListText = new ArrayList<String>();
		for(WebElement x : accList ) {
			accListText.add(x.getText());
		}
		System.out.println("Account Text List : "+ accListText);
		
		List<String> accListTextStream = accList.stream().map(x->x.getText()).collect(Collectors.toList());
		System.out.println("Account Text List : "+ accListTextStream);

		Thread.sleep(3000);
		driver.quit();
		
	}

}

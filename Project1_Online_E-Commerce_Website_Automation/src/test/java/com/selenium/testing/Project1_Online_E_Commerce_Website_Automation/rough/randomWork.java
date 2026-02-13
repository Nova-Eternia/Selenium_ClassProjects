package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class randomWork {
	public static void main(String[] args) throws IOException{
		Properties global = new Properties();
		String path = System.getProperty("user.dir")+"//src//test//resources//properties//config.properties";
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//properties//global.properties");
		global.load(file);
		System.out.println(path);
		
		String browser = global.getProperty("browser");
		System.out.println(browser);

	}
}

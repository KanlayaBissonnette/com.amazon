package com.amazonUtility;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
			switch(BaseClass.getProperty("browser")) {
			case "firefox" :
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(BaseClass.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.implicitWaitTime, TimeUnit.SECONDS);
				break;
				
			case "chrome" :
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(BaseClass.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.implicitWaitTime, TimeUnit.SECONDS);
				break;
				
			case "safari" :
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				driver.get(BaseClass.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.implicitWaitTime, TimeUnit.SECONDS);
				break;
				
			case "headless" :
				break;
			}
			
		}
		
		return driver;
	}
	
	
	public static void tearDown() {
		if(driver != null) {
			driver.close();
			driver = null;
		}
	}
	
	
	public static Properties configFile;
	
	static {
		try {
			String path = Constants.config_FilePath;
			
			FileInputStream input = new FileInputStream(path);
		
			configFile = new Properties();
			configFile.load(input);
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static String getProperty(String keyName) {
		
		return configFile.getProperty(keyName);
	}

}

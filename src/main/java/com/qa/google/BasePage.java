package com.qa.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
public WebDriver driver;

public WebDriver setUp(String browserName){
	
	if(browserName.equals("chrome")){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}else {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	return driver;
	
}


}

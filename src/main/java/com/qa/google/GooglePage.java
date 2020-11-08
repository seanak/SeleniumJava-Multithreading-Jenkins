package com.qa.google;

import org.openqa.selenium.By;

public class GooglePage extends BasePage {
	
	public void googleSearchTest(){
		//page actions 
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("Joe Biden");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.xpath("//h3")).stream().forEach(ele->System.out.println(ele.getText()));
		
	}
	
	public void tearDown(){
		
		driver.quit();
	}
}

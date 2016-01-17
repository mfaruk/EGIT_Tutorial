package com.org.LearningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

	@Test
	public void test(){
		
		System.out.println("Opeing the Application");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		
	}
	
	
	
}

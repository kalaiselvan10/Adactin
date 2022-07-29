package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	private void method1() {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	private void method2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/");
		
	}
	
	@Test
	private void method3() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
		
	}

}

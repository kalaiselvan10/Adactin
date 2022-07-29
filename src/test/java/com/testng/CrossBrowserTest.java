package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	@Test
	@Parameters({"browserName"})
	private void getBrowser(String browserName) {
     if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");	
	}
     else if (browserName.equalsIgnoreCase("firefox")) {
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://www.facebook.com/");
		
	}
}
}
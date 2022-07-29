package com.testng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertConcept {

	@Test
	private void demo1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");	
     String expected = "Facebook - log in or sign up";
     Assert.assertEquals(driver.getTitle(), expected);
	}
	
	//Assert.assertTrue(true);
	//Assert.assertFalse(false);
	
	@Test
	private void demo2() {
     System.out.println("Retry");
	}
	
}


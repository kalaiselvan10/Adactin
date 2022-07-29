package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutTest {
	
	@Test(timeOut = 1000)
	private void browserLaunch() throws InterruptedException {
      Thread.sleep(2000);
	}

}

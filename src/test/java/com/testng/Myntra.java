package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Myntra {
		
		static WebDriver driver;
		static int g_price=599;
		static List<WebElement> dprices;
		
		@BeforeClass
		public void browser_launch() {
	    System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\DELL\\eclipse\\AutomationProject\\Driver\\chromedriver.exe");
		}
	    @BeforeMethod
	    public void url_launch() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
	
	}
	@Test
	public void myntra_allprices() {
		List<WebElement> base = driver.findElements(By.xpath("//li[@class='product-base']"));
		dprices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
     
		for (WebElement dprice : dprices) {  
    	   String price = dprice.getText().replace("Rs. ", "");
    	  System.out.println(price);
		}
	}
    
	@Test
	public void myntra_pprices() {
    	  
    	  dprices = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
    	  
    	  for (WebElement dprice : dprices) {  
       	   String price = dprice.getText().replace("Rs. ", "");
    	   
    	   if(Integer.valueOf(price)==g_price) {
    		 
    		   WebElement Product_name_ele = dprice.findElement(By.xpath("//ancestor::div[@class='product-price']//preceding-sibling::h3"));
               System.out.println(Product_name_ele.getText());	   
		
	}
    	    	   	
	}
	  
	}
	
}
	

	
	
	
	
	
	
	
	
	
	


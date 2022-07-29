package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multipledata {
	
	@Test(dataProvider = "data")
	private void credentials(String username,String password) {
     System.out.println("username:"+username);
     System.out.println("password:"+password);
	}
	
	@DataProvider
	private Object data() {
     return new Object [] [] {
    	    	 
    	 {"Arun","Arun@123" },{"Kalai","Kalai@124"},{"selvan","Selvan@111"}
    	 
     };
	
}
}
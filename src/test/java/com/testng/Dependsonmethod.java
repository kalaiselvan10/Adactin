package com.testng;

import org.testng.annotations.Test;

public class Dependsonmethod {
	
	@Test
	private void browserLaunch() {
       System.out.println("browserLaunch");
	}
	
	@Test(dependsOnMethods = "browserLaunch")
	private void url() {
      System.out.println("url");
	}
	@Test(dependsOnMethods = "url")
	private void login() {
      System.out.println("login");
	}
	
	@Test(dependsOnMethods = "login")
	private void logout() {
     System.out.println("logout");
	}
	

}

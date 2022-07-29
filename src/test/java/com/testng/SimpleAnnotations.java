package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@Test
	private void women() {
      System.out.println("women");
	}
	@Test
     private void dresses() {
      System.out.println("dresses");
	}
	@Test
     private void tshirts() {
       System.out.println("tshirts");
	}
	@BeforeMethod
	private void signIn() {
     System.out.println("signIn");
	}
	@AfterMethod
	private void signout() {
      System.out.println("signout");
	}
	@BeforeSuite
	private void setProperty() {
      System.out.println("chrome Browser");
	}
	@BeforeTest
	private void geturl() {
      System.out.println("url");
	}
	@BeforeClass
	private void getTitle() {
     System.out.println("title of the page");
	}
	@AfterClass
	private void closeBrowser() {
      System.out.println("close");
	}
	@AfterTest
	private void deletedcookies() {
      System.out.println("deletedcookies");
	}
	@AfterSuite
	private void terminate() {
      System.out.println("terminate");
	}
}



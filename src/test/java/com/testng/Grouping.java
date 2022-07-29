package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test(groups = "Apps",dependsOnGroups = "ecommerce")
	private void whatsApp() {
     System.out.println("whatsApp");
	}
	
	@Test(groups = "Apps",dependsOnGroups = "ecommerce")
	private void telegram() {
     System.out.println("telegram");
	}
	
	@Test(groups = "ecommerce")
	private void amazon() {
     System.out.println("amazon");
	}
	
	@Test(groups = "ecommerce")
	private void flipkart() {
     System.out.println("flipkart");
	}
	
	@Test(groups = "banking",dependsOnGroups = "Apps")
	private void axisBank() {
     System.out.println("Axis Bank");
	}
	
	@Test(groups = "banking",dependsOnGroups = "Apps")
	private void indianBank() {
     System.out.println("Indian Bank");
	}
	
	

}

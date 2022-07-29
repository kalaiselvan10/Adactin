package com.testng;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test
	private void mobiles() {
      System.out.println("mobiles");
	}
	@Test(priority =1)
     private void laptops() {
      System.out.println("laptops");
	}
     @Test(priority =-1)
     private void tablets() {
      System.out.println("tablets");
	}
}



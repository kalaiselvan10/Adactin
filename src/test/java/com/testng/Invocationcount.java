package com.testng;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(invocationCount = 3)
	private void menswear() {
      System.out.println("mens wear");
	}
	
	@Test
	private void kidswear() {
      System.out.println("kids wear");
	}
	
	
}

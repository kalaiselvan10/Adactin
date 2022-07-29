package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(enabled=false)
	private void wemenswear() {
       System.out.println("women's wear");
	}
	@Test
	private void menswear() {
      System.out.println("men's wear");
	}
	@Test
	@Ignore
	private void kidswear() {
     System.out.println("kid's wear");
	}
	
	
}

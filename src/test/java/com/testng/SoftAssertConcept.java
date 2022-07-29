package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcept {
	
	@Test
	private void demo1() {
		String expected = "yahoo";
		String actual = "google";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected);

	}

}

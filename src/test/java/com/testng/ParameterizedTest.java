package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("Ajay")String username, @Optional("Test@111")String password) {
		System.out.println("Username:"+username);
		System.out.println("password:"+password);
	}		
	

	
}

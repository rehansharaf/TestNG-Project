package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("this is before method");
	}
	
	
	@Test
	public void loginPageTest() {
		
		System.out.println("This is our login page test");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("This is our after method");
	}

}

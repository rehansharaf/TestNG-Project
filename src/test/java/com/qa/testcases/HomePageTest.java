package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	@BeforeMethod
	public void setUp() {
		
		System.out.println("this is before method for homepage");
	}
	
	
	@Test
	public void homePageTest() {
		
		System.out.println("This is our homepage test");
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		System.out.println("This is our after method for homepage");
	}


}

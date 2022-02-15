package org.com;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SampleTest {
	@BeforeClass
	public  static void beforeclass() {
		System.out.println("before class");
	}
	@Before
	public void beforemethod() {
System.out.println("before method");
	}
	@Test
	public void tc01() {
System.out.println("method1");
	}
	@Test
	public void tc02() {
System.out.println("method2");
	}
	@AfterMethod
	public static void aftermethod() {
System.out.println("after method");
	}
	@AfterClass
	public static void afterclass() {
System.out.println("after class");
	}
	
	
	
	
	
	
	

}

package org.com;

import org.testng.annotations.*;

public class TestNg {
	@BeforeClass
	private void beforeclass() {
 System.out.println("beforeclass");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");

	}@AfterMethod
	private void afterMethod() {
		System.out.println("beforemethod");
	@Test
	private void tc01() {
System.out.println("test1");
	}
	@Test
	private void tc02() {
System.out.println("test2");
	}
	@Test
	private void tc03() {
System.out.println("test3");
	}
	
	@AfterClass
	private void afterclass() {
System.out.println("afterclass");
	}
	
}
	
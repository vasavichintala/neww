package org.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Employee1 extends BaseClass {
	@BeforeClass
	private void beforeclass() {
		getDriver();
		loadUrl("http://adactinhotelapp.com");
		maximize();

	}
	@AfterClass
	private static void afterclass() {
    closeAllBrowser();
	}
	@Test
	private void SearchHotels() {
		//login
		Login loginpage = new Login();
		loginpage.
		
		

	}

}

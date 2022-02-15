package org.com;

import org.openqa.selenium.WebElement;

public class Employee {
	public static void main(String[] args) throws InterruptedException {
		BaseClass base = new BaseClass();
		base.getDriver();      		
		base.maximize();
		base.loadurl("http://adactinhotelapp.com");
		base.implicitewait();
		WebElement findElementbyid = base.findElementbyid("username");
		base.
	}
	
}

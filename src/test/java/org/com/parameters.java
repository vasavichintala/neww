package org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@BeforeMethod
	private void beforemethod() {
		

	} 
}
		

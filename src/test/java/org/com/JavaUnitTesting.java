package org.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaUnitTesting {
	static WebDriver driver;
	@BeforeClass
	
	public static void beforeClass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		

	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
		
		
		

	}
	@Before
	public  void beforeMethod() {
		long s = System.currentTimeMillis();
		System.out.println(s);
		
		

	}
	@After
	public void afterMethod() {
		long b = System.currentTimeMillis();
          System.out.println(b);
	}
	@Test
	public void test1() {
		WebElement findElement = driver.findElement(By.id("email"));
		
		findElement.sendKeys("greens");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement.sendKeys("hello @ 123455");
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();		
				
				
				
				
				
				
	}
	
	
	
	
	
	
	
	

}

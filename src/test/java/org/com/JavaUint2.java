package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaUint2 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();                                                                    		

	}
	@Before
	public void beforeMethod() throws IOException {
File src =( (TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE)	;
File des= new File("F:\\1st screenshot.png");
FileHandler.copy(src, des);

			}
	
	@After
	public void afterMethod() throws IOException {
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des2 = new File("E:\\1st screenshot.png");
		FileHandler.copy(src1, des2);
		}
	@Test
	public void Test() {
WebElement txtusername = driver.findElement(By.id("username"));
txtusername.sendKeys("kava");
WebElement txtusername1 = driver.findElement(By.id("password"));
txtusername1.sendKeys("vasavi");
WebElement findElement = driver.findElement(By.name("login"));
findElement.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

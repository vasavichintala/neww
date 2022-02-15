package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchBox {
	WebDriver driver;
	@DataProvider(name="sample")
	public Object[][]getData(){
		return new Object[][]{ 
{"iphone "},{"onepluse"},{"airpods"},{"i watch"},{"lays"},{"kurkure"},{"dairy milk"}
		};
	}
	@Test(dataProvider="sample")
	private void tc01(String s) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
		findElement.sendKeys(s,Keys.ENTER);
		driver.close();
	
		
		

	}
}
		
				  
		
		
		
		
		
	
	



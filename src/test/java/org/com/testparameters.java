package org.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testparameters {
	WebDriver driver;
	@BeforeClass
	private void beforeClass() {
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      }
	@Parameters({"UserName","password"})
	@Test
	private void tc01(String user,String pass) {
		WebElement findElement = driver.findElement(By.id("UserName"));
		findElement.sendKeys(user);
		WebElement userPass=driver.findElement(By.id("password"));
		userPass.sendKeys(pass);
		WebElement findElement2 = driver.findElement(By.id("login"));
		findElement2.click();
		
	}
	@Parameters({"location","Hotels","Roomtype","Number","InDate","OutDate","AdultRoom","ChildRoom","CardType","ExpiryMonth","ExpiryYear","Lastname","Address"})
	@Test
	private void tc02(String location,String hotels,String roomtype,String roomNumber,
			String indate,String outdate,String adultRoom,String childroom) {
		WebElement findElement = driver.findElement(By.id("location"));
		Select select = new Select(findElement);
		select.selectByVisibleText(location);
		
		WebElement findElement2 = driver.findElement(By.id("hotels"));
		Select select1=new Select(findElement2);
		select.selectByVisibleText(hotels);
		
		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select select2 = new Select(findElement3);
		select2.selectByVisibleText(roomtype);
		
		WebElement findElement4 = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(findElement4);
		select3.deselectByVisibleText(roomNumber);
		
		WebElement findElement5 = driver.findElement(By.id("datepick_in"));
		findElement5.clear();
		findElement5.sendKeys(indate);
		
		WebElement findElement6 = driver.findElement(By.id("datepick_in"));
		findElement6.clear();
		findElement6.sendKeys(outdate);
		
		WebElement findElement7 = driver.findElement(By.id("adult room"));
		Select select4 = new Select(findElement7);
		select4.selectByVisibleText(adultRoom);
		
		WebElement findElement8 = driver.findElement(By.id("child_room"));
		Select select5 = new Select(findElement8);
		select5.selectByVisibleText(childroom);
		WebElement findElement9 = driver.findElement(By.id("Submit"));
		findElement9.click();
		
			}
	@Test
	private void tc03() {
		WebElement findElement = driver.findElement(By.id("radiobutton_0"));
		findElement.click();
		
		WebElement findElement2 = driver.findElement(By.id("countinue"));
		findElement2.click();
		
	}
	@Parameters({"FirstName","Lastname","Address","CardNumber","CardType","ExpiryMonth","ExpiryYear","CvvNumber"})
	@Test
	
	private void tc04 (String firstname,String lastname,String add,String card, String cardType,String exMonth,
			String exYear)
	
	
			
	
	
	
	
	}
	
	
}

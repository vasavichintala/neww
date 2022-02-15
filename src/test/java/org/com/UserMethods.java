package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	public void getDriver() {      		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		
}
	public void loadurl(String url) {
		driver.get("http://adactinhotelapp.com");

	}
	public void type(WebElement element,String data) {
		element.sendKeys(data);

	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
		
	

	}
	public void click(WebElement element) {
		element.click();
		

	}
	public String getText(WebElement element) {
		String text=element.getText();
			return text;        			


	}
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public WebElement findlocatorbyid() {
		WebElement element = driver.findElement(By.id("attribute value"));
		return element ;                    		
	

	}
	private void FindElement() {

	}
	public void RightClick(WebElement element) {
Actions action = new Actions(driver);
action.moveToElement(element).perform();

	}
	public void DragAnDrop(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		

	}
	public void MoveToElement(WebElement element) {
		Actions action = new  Actions (driver);
		action.moveToElement(element).perform();                                   


	}
	public void TyeTextJS(WebElement element,String Data) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("argument[0].setAttribute('value',"+Data+"')", element);
		}
	public void closeAllBrowser() {
		driver.quit();               
	}
	public void SelectByOptionByText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);                             
		

	}
	public void maximize() {
          driver.manage().window().maximize();
	}
	
	
	
	
	
	
	
	
	
}

  
	
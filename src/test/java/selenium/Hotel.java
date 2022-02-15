package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Hotel {
	public static void main(String[] args)throws InterruptedException, AWTException   {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("vasavi123456");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("LPK6QW");
		WebElement btnlog = driver.findElement(By.id("login"));
		btnlog.click();
		Thread.sleep(2000);
		WebElement dDnloc = driver.findElement(By.id("location"));
		Select select = new Select(dDnloc);
		select.selectByIndex(2);
		Thread.sleep(4000);
		WebElement dDnhotl = driver.findElement(By.id("hotels"));
		Select select1 =new Select(dDnhotl);
		select1.selectByIndex(3);
		Thread.sleep(2000);
		WebElement dDnroom = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dDnroom);
		select2.selectByIndex(3);
		Thread.sleep(2000);
		WebElement dDnadl = driver.findElement(By.id("adult_room"));
		Select select4=new Select(dDnadl);
		select4.selectByIndex(3);
		Thread.sleep(2000);
		WebElement dDnnor = driver.findElement(By.id("child_room"));
		Select select5=new Select(dDnnor);
		select5.selectByIndex(1);
		Thread.sleep(4000);
		WebElement btnsearch = driver.findElement(By.id("Submit"));
		btnsearch.click();
		
		WebElement btnopt = driver.findElement(By.id("radiobutton_0"));
		btnopt.click();
		Thread.sleep(5000);
		WebElement btncontinue = driver.findElement(By.id("continue"));
		btncontinue.click();
		Thread.sleep(5000);
		WebElement txtfrstnme = driver.findElement(By.id("first_name"));
		txtfrstnme.sendKeys("siddarth");
		Thread.sleep(5000);
		WebElement txtlstnme = driver.findElement(By.id("last_name"));
		txtlstnme.sendKeys("deva");
		Thread.sleep(5000);

		WebElement txtadd = driver.findElement(By.id("address"));
		txtadd.sendKeys("2,deriv tai nagar,chennai-609898");
		WebElement txtcardno = driver.findElement(By.id("cc_num"));
		txtcardno.sendKeys("8521479637964123");
		WebElement dDnctype = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(dDnctype);
		select6.selectByIndex(2);
		WebElement dDnexmon = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(dDnexmon);
		select7.selectByIndex(6);
		Thread.sleep(5000);
		WebElement dDnexyr = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(dDnexyr);
		select8.selectByIndex(12);
		
		WebElement txtcvv = driver.findElement(By.id("cc_cvv"));
		txtcvv.sendKeys("852");
		WebElement btnbook = driver.findElement(By.id("book_now"));
		btnbook.click();
		WebElement txtodr = driver.findElement(By.id("order_no"));
		System.out.println(txtodr);
		
	
	}

	

}

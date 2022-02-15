package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modify2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.get("http://www.greenscart.in");
 driver.manage().window().maximize();
 Thread.sleep(3000);
 WebElement findElement = driver.findElement(By.xpath("//input[@value='Register']"));
 findElement.click();
 WebElement m = driver.findElement(By.id("month")); 
Actions a = new Actions(driver);
a.moveToElement(m).perform();

 Select select = new Select(m);
 List<WebElement> options = select.getOptions();
 File f = new File("C:\\Users\\CHINTALA VASAVI\\eclipse-workspace\\FrameWorkProject\\src\\test\\java\\org\\frame\\Vaaasavi.java") ;
 FileInputStream s = new FileInputStream(f);
 Workbook workbook= new XSSFWorkbook(s);
 Sheet sheet = workbook.getSheet("Data");
 for (int i = 0; i < options.size(); i++) {
	 WebElement element = options.get(i);
	 String text = element.getText();
	 Row row = sheet.createRow(i);
	 Cell cell = row.createCell(0);
	 cell.setCellValue(text);
	 System.out.println(text);
	 
	 }
 FileOutputStream stream= new FileOutputStream(f);
 workbook.write(stream);
 System.out.println("completed");
 
 
	}

}

package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	Select select;
	WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void loadUrl(String Url) {
		driver.get(Url);
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void click(WebElement element) {
		element.click();

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public WebElement findLocatorsById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}

	public WebElement findLocatorsByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public String getAttribute(WebElement element, String attribute) {
		String data = element.getAttribute(attribute);
		return data;
	}

	public void closeAllBrowser() {
		driver.quit();

	}

	public void selectByOptionByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByAttribute(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	public void switchToFrameByElement(String element) {
		driver.switchTo().frame(element);
	}

	public void switchToFrameByNameandId(int id) {
		driver.switchTo().frame(id);
	}

	public void switchToFrameByIndex(int intex) {
		driver.switchTo().frame(intex);
	}

	public void sendKeys(WebElement elememt, String data) {
		elememt.sendKeys(data);

	}

	public void maximizePage() {
		driver.manage().window().maximize();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void excelWrite(String sheetName, String data, int row, int coloumn) throws Exception {
		File file = new File("C:\\SeleniumTest\\Excell\\Hotel.xlsx");
		FileInputStream in=new FileInputStream(file);
		Workbook workBook = new XSSFWorkbook(in);
		Sheet sheet = workBook.getSheet(sheetName);
		Row getRow = sheet.getRow(row);
		Cell cell = getRow.createCell(coloumn);
		cell.setCellValue(data);
		FileOutputStream output = new FileOutputStream(file);
		workBook.write(output);
	}

	public String getData(String sheet, int rowNo, int cellNo) throws IOException {
		String res = null;

		File file = new File("C:\\SeleniumTest\\Excell\\Hotel.xlsx");
		FileInputStream streem = new FileInputStream(file);
		Workbook workBook = new XSSFWorkbook(streem);
		Sheet sheet1 = workBook.getSheet(sheet);
		Row row = sheet1.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();

		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
				res = dateFormat.format(date);

			} else {

				double numeric = cell.getNumericCellValue();
				BigDecimal decimal = BigDecimal.valueOf(numeric);
				res = decimal.toString();

				break;
			}

		default:
			break;

		}
		return res;

	}

}

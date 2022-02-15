import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	public void getDriver(){
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
	}
	
	public void loadUrl(String data){ 
		driver.get(data);
	}
	
	public void maximize(){ 
		driver.manage().window().maximize();
	}
	
	
	
	public WebElement findLocaterById(String Attributename){
		WebElement element = driver.findElement(By.id(Attributename));
	return element;
	}
	
	public WebElement findLocaterByName(String Name){
		WebElement element=driver.findElement(By.name(Name));
		return element;
	}
	
	public WebElement findLocatorByClassName(String ClassName){ 
		WebElement element = driver.findElement(By.className(ClassName));
	return element;
	}
	
	public WebElement findLocatorByXpath(String Xpathname){
		WebElement element = driver.findElement(By.xpath(Xpathname));
	return element;
	}
	
	public void insertValue(WebElement element,String data){ 
		element.sendKeys(data);
	
	}
	public void threadSleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	
	public void click(WebElement element){
		element.click();
	}
	
	public String getTitle(){
		String title=driver.getTitle();
	return title;
	}
	
	public String getEnteredUrl(){
		String crnturl = driver.getCurrentUrl();
	return crnturl;
	}
	
	public String getText(WebElement element){ 
		String text = element.getText();
	return text;
	}
	
	public String getAttributeValue(WebElement element){
		String attribute = element.getAttribute("value");
	return attribute;
	}
	
	public void selectOptionsByText(WebElement element,String Data){
		Select select = new Select(element); 
		select.selectByVisibleText(Data);
	}
	
	public void selectOptionsByIndex(WebElement element,int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectOptionsByAttribute(WebElement element,String AttributeName)
	{
	Select select = new Select(element); 
	select.deselectByValue(AttributeName);
	}
	
	public void typeTextJS(WebElement element,String Data){ 
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].SetAttribute('value','"+Data+"')",element);
	}
	
	public void moveToElement(WebElement element){ 
		Actions actions=new Actions(driver); 
		actions.moveToElement(element);
	}
	
	public void rightClick(WebElement element){ 
		Actions action = new Actions(driver); 
		action.contextClick(element).perform();
	}
	
	public void dragAndDrop(WebElement src,WebElement dest){
		Actions action = new Actions(driver); 
		action.dragAndDrop(src,dest).perform();
	}
	public void dropdownbyIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void quit(){
		driver.quit();
	}
	
	public void close(){
		driver.close();
	}
	
	
	public void acceptInAlert(){
		Alert al =driver.switchTo().alert(); 
		al.accept();
	}
	
	public void cancelInAlert(){
		Alert al = driver.switchTo().alert();  
		al.dismiss();
	}
	
	public void switchToFrameByIndex(int index){ 
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameByText(String data){ 
		driver.switchTo().frame(data);
	}
	
	public void getDefaultWindowinFrames(){ 
		driver.switchTo().defaultContent();
	}
	
	public void navigateTo(String url){
		driver.navigate().to(url);
	}
	
	public void navigateBack(){ 
		driver.navigate().back();
	}
	
	public void navigateForword(){ 
		driver.navigate().forward();
	}
	
	public void navigateRefresh(){ 
		driver.navigate().refresh();
	}
	
	public boolean isDisplayed(WebElement element){ 
		boolean displayed = element.isDisplayed(); 
	return displayed;
	}
	
	public boolean isSelected(WebElement element){ 
		boolean enabled = element.isEnabled(); 
	return enabled;
	}
	
	public boolean isEnabled(WebElement element){
		boolean enabled = element.isEnabled();
	return enabled;
	}
	
	public boolean isMultiple(WebElement element){ 
		Select s = new Select(element);
	boolean multiple = s.isMultiple();
		return multiple;
	}
	
	public void deSelectByIndex(WebElement element,int index){ 
		Select select = new Select(element); 
		select.deselectByIndex(index);
	}
	
	public void deselectByValue(WebElement element,String data){ 
		Select select = new Select(element); 
		select.deselectByValue(data);
	}
	
	public void deSelectByVisibleText(WebElement element,String data){ 
		Select select = new Select(element); 
		select.deselectByVisibleText(data);
	}
	
	public void deSelectAll(WebElement element){ 
		Select select = new Select(element); 
		select.deselectAll();
	}
	
	public int lenth(String s){ 
		int length = s.length(); 
	return length;
	}
	
	public boolean equals(String s1,String s2){
		boolean equals = s1.equals(s2);
	return equals;
	}
	
	public boolean equalIgnoreCase(String s1,String s2){ 
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2); 
	return equalsIgnoreCase;
	}
	
	public boolean contains(String s1,String s2){ 
		boolean contains = s1.contains(s2); 
	return contains;
	}
	
	public boolean startsWith(String s1,String s2){ 
		boolean startsWith = s1.startsWith(s2); 
	return startsWith;
	}
	
	public boolean endsWith(String s1,String s2){ 
		boolean endsWith = s1.endsWith(s2); 
	return endsWith;
	}
	
	public boolean isEmpty(String s){
		boolean empty = s.isEmpty();
	return empty;
	}
	
	public boolean createFolder(File F){
		boolean b = F.mkdir();
	return b;
	}
	
	public boolean createFolders(File F){
		boolean b = F.mkdirs();
	return b;
	}
	public boolean createFile(File F) throws IOException {
		boolean newFile = F.createNewFile();
	return newFile;
	}
	
	public boolean canRead(File F){ 
		boolean read = F.canRead(); 
	return read;
	}
	
	public boolean canWrite(File F){
		boolean write = F.canWrite(); 
	return write;
	}
	
	public boolean canExecute(File F){ 
		boolean execute = F.canExecute(); 
	return execute;
	}
	
	public boolean exist(File F){ 
		boolean exists = F.exists(); 
	return exists;
	}
	
	public void writeData(String sheetName, int rowNo, int cellNo, String orderNo) throws IOException {
		String data= null;
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\A\\Exceldataget\\adac.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(orderNo);
	}
	
	public String getData(String sheetName, int rowNo, int cellNo) throws IOException {
		String data= null;
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\A\\Exceldataget\\adac.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		 CellType cellType = cell.getCellType();
			switch (cellType) {
			case STRING:
				data = cell.getStringCellValue();
				System.out.println(data);
				
				break;
			case NUMERIC:
				if(DateUtil.isCellDateFormatted(cell)) {
					
				Date d = cell.getDateCellValue();
				SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MMM-yy");
				data =dateFormat.format(d);
					
				double numericcellvalue = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(numericcellvalue);
				data = b.toString();
				System.out.println(data);
			}
			break;
			default:
			break;
	}
			FileOutputStream stream2 = new FileOutputStream(file);
			workbook.write(stream2);
			return data;
			
	}

}

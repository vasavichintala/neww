package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters1 {
	WebDriver driver;
	@BeforeClass
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			driver.get("");
.	}

}

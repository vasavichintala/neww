package org.com;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClassDetails {
	public  Login() {
		PageFactory.initElements(driver, this);

	}
		
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;     			
		
	}
	public WebElement getTxtpassword() {
		return txtpassword;
		
	}
	private WebElement getBtnlogin() {
		return btnLogin;

	}
	
	private void login(String UserName,String password) {
		
		type(getTxtUserName(),UserName);
		type(getTxtpassword(),password);
		click(getBtnlogin());
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

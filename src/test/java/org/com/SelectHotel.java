package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends BaseClassDetails{   
	@FindBy(id="radiobutton_0")
	private WebElement click;
	@FindBy(id="countinue")
	private WebElement contin;
	public WebElement getClick() {
		return click;
	}
	public WebElement getContin() {
		return contin;
	}
	private void selectHotel() {
		click(getClick());
		click(getContin());

	}
	

}

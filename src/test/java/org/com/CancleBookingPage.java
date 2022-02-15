package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancleBookingPage extends BaseClassDetails{
	@FindBy(name="ids[]")
	private WebElement cancelId;
	@FindBy(name="cancelall")
	private WebElement cancelSelected;
	public WebElement getCancelId() {
		return cancelId;
	}
	public WebElement getCancelSelected() {
		return cancelSelected;
	}
	private void cancelBooking() {
		click(getCancelId());
		click(getCancelSelected());
			}



}

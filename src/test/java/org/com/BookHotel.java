package org.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel extends BaseClassDetails{
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	@FindBy(id="cc_type")
	private WebElement dDnCardType;
	@FindBy(id="cc_exp_month")
	private WebElement dDnExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement dDnExpYear ;
	@FindBy(id="cc_vv")
	private WebElement cvvNum ;
	@FindBy(id="book_num")
	private WebElement bookNum ;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getdDnCardType() {
		return dDnCardType;
	}
	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}
	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getBookNum() {
		return bookNum;
	}
	private void bookHotel(String firstName,String lastName,String address,String cardNumber,String cvvNumber,String cardType,String expMonth,String expYear) {
		sendKeys(getFirstName(),firstName);
		sendKeys(getLastName(),lastName);
		sendKeys(getAddress(),address);
		sendKeys(getCardNumber(),cardNumber);
		selectByVIsibilityText(getdDnCardType(),cardType);	
		selectByVIsibilityText(getdDnExpMonth(),expMonth);
		

		selectByVIsibilityText(getdDnExpYear(),expYear)	;
sendKeys(getCvvNum(),cvvNumber);
click(getBookNum());

	}
	
	
	
	
	
	


	













}

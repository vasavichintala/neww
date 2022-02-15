package org.com;

import org.openqa.selenium.WebElement;

public class HotelBooking {
	public static void main(String[] args) throws Exception {
		
		
		BaseClassDetails baseClass = new BaseClassDetails();
		baseClass.getDriver();
		baseClass.loadUrl("https://adactinhotelapp.com/");
		baseClass.maximizePage();
		baseClass.implicitWait();
		
		WebElement userText = baseClass.findLocatorsById("username");
		String username = baseClass.getData("Sheet1", 1, 0);
		baseClass.sendKeys(userText,username);
		
		WebElement Userpass = baseClass.findLocatorsById("password");
		String password = baseClass.getData("Sheet1", 1, 1);
		baseClass.sendKeys(Userpass, password);
		
		
		WebElement login = baseClass.findLocatorsById("login");
		baseClass.click(login); 
		
		WebElement location = baseClass.findLocatorsByName("location");
		baseClass.selectByIndex(location, 2);
		
		WebElement hotels = baseClass.findLocatorsByName("hotels");
		baseClass.selectByIndex(hotels, 3);
		
		WebElement room = baseClass.findLocatorsByName("room_type");
		baseClass.selectByIndex(room, 2);
		
		WebElement roomsNum = baseClass.findLocatorsByName("room_nos");
		baseClass.selectByIndex(roomsNum, 7);
		
		WebElement checkIn = baseClass.findLocatorsById("datepick_in");
		checkIn.clear();
		String inDate = baseClass.getData("Sheet1", 1,2);
		baseClass.sendKeys(checkIn, inDate);
		
		WebElement checkOut = baseClass.findLocatorsById("datepick_out");
		checkOut.clear();
		String outDate = baseClass.getData("Sheet1", 1, 3);
		baseClass.sendKeys(checkOut, outDate);
		
		WebElement adultRoom = baseClass.findLocatorsById("adult_room");
		baseClass.selectByIndex(adultRoom, 2);
		
		WebElement childRoom = baseClass.findLocatorsById("child_room");
		baseClass.selectByIndex(childRoom, 3);
		
		WebElement search = baseClass.findLocatorsByName("Submit");
		baseClass.click(search);
		
		WebElement click = baseClass.findLocatorsById("radiobutton_0");
		baseClass.click(click);
		
		WebElement contin = baseClass.findLocatorsById("continue");
		baseClass.click(contin);
		
		WebElement firstName = baseClass.findLocatorsById("first_name");
		String name = baseClass.getData("Sheet1", 1, 4);
		baseClass.sendKeys(firstName, name);
		
		WebElement lastName = baseClass.findLocatorsById("last_name");
		String laName = baseClass.getData("Sheet1", 1, 5);
		baseClass.sendKeys(lastName, laName);
		
		WebElement billingAdd = baseClass.findLocatorsById("address");
		String address = baseClass.getData("Sheet1", 1, 6);
		baseClass.sendKeys(billingAdd, address);
		
		WebElement creditcard = baseClass.findLocatorsById("cc_num");
		String ccNumber = baseClass.getData("Sheet1", 1, 7);
		baseClass.sendKeys(creditcard, ccNumber);
		
		WebElement cardType = baseClass.findLocatorsById("cc_type");
		baseClass.selectByIndex(cardType, 3);
	
		WebElement expMonth = baseClass.findLocatorsById("cc_exp_month");
		baseClass.selectByIndex(expMonth, 10);
		
		WebElement expYear = baseClass.findLocatorsById("cc_exp_year");
		baseClass.selectByIndex(expYear, 8);
		
		WebElement cvv = baseClass.findLocatorsById("cc_cvv");
		String cvvNumber = baseClass.getData("Sheet1", 1, 8);
		baseClass.sendKeys(cvv, cvvNumber);
		
		WebElement bookNow = baseClass.findLocatorsById("book_now");
		baseClass.click(bookNow);
		
		WebElement orderId = baseClass.findLocatorsById("order_no");
		String attribute = baseClass.getAttribute(orderId,"value");
		baseClass.excelWrite("Sheet1", attribute, 1, 9);
		System.out.println(attribute);
	
		
	}
}
		
		
		
		
		
		
		 
		
		
		

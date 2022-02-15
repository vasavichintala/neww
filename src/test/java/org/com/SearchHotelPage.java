package org.com;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelPage extends BaseClassDetails{
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	@FindBy(id="room-type")
	private WebElement dDnRoomType;
	@FindBy(id="room-no")
	private WebElement dDnNoofRooms;
	@FindBy(id="datepick-in")                 	
	private WebElement txtCheckInDate;
	@FindBy(id="datepick-out")
	private WebElement txtcheckOutDate; 
	@FindBy(id="adult-room")
	private WebElement dDnchildrenperroom;
	@FindBy(id="submit")
	private WebElement btnSearch;
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	} 
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnNoofRooms() {
		return dDnNoofRooms;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtcheckOutDate() {
		return txtcheckOutDate;
	}
	public WebElement getdDnchildrenperroom() {
		return dDnchildrenperroom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	private void searchHotels(String location , String hotels, String roomType,String noofRoom,String CheckInDate,String checkOutDate,String adultsPerRoom,String chinlderenPerRoom ) {
		selectByOptionByText(getdDnLocation(), location);
		selectByOptionByText(getdDnHotels(), hotels);
		selectByOptionByText(getdDnRoomType(), roomType);
		selectByOptionByText(getdDnNoofRooms(), noofRoom);
		type(getTxtCheckInDate(),CheckInDate);
		type(getTxtcheckOutDate(),checkOutDate);
		
		

	}
	
	
	
	
	
	
	
	
		

	

	
	
	
		
		

	}
	
	



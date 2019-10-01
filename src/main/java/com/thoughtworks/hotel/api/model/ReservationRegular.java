package com.thoughtworks.hotel.api.model;

import java.util.Calendar;
import java.util.List;

public class ReservationRegular extends Reservation{

	public ReservationRegular(ClientType clientType, List<Calendar> dates) {
		super(clientType, dates);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calculatePrice(Hotel hotel) {
		String day = "";
		double price = 0.0;		
		for(Calendar date : this.getDates()) {
			//Method implemented by default method of IDateHelper
			day = getDayByDate(date);
			
			switch(day) {
				case "Saturday": 
				case "Sunday":
					price += hotel.getWeekendsRegularPrice();
					break;
				
				default: 
					price += hotel.getWeekdaysRegularPrice();
				}
		}
		return price;
	}

}

package com.thoughtworks.hotel.api.model;

import java.util.Calendar;
import java.util.List;

public class ReservationReward extends Reservation{

	public ReservationReward(ClientType clientType, List<Calendar> dates) {
		super(clientType, dates);
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
					price += hotel.getWeekendsRewardPrice();
					break;

				default:
					price += hotel.getWeekdaysRewardPrice();
				}
		}
		return price;
	}
}

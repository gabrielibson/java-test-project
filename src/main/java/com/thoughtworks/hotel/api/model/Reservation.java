package com.thoughtworks.hotel.api.model;

import java.util.Calendar;
import java.util.List;

public abstract class Reservation implements IDateHelper{

	private ClientType clientType;
	private List<Calendar> dates;
	
	public Reservation(ClientType clientType, List<Calendar> dates) {
		super();
		this.clientType = clientType;
		this.dates = dates;
	}
	
	public Hotel findBestHotelByReservation(List<Hotel> hotels) {
		double currentPrice;
		double price;
		Hotel bestHotel;

		price = this.calculatePrice(hotels.get(0));
		bestHotel = hotels.get(0);

		for (int i = 1; i < hotels.size(); i++) {
			currentPrice = this.calculatePrice(hotels.get(i));
			if (price > currentPrice
					|| (price == currentPrice && hotels.get(i).getClassification() > bestHotel.getClassification())) {
				price = currentPrice;
				bestHotel = hotels.get(i);
			}
		}
		return bestHotel;
	}
	
	public abstract Double calculatePrice(Hotel hotel);

	public ClientType getClientType() {
		return clientType;
	}

	public List<Calendar> getDates() {
		return dates;
	}	
}

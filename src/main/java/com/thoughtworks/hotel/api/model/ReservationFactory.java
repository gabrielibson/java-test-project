package com.thoughtworks.hotel.api.model;

import java.util.Calendar;
import java.util.List;

public class ReservationFactory {
	private static ReservationFactory reservationFactory;
	
	private ReservationFactory() {}
	
	public static ReservationFactory getInstance() {
		if(reservationFactory == null) {
			return new ReservationFactory();
		}
		return reservationFactory;
	}
	
	public Reservation createReservation(ClientType clientType, List<Calendar> dates) {
		if(ClientType.REWARD.equals(clientType)) {
			return new ReservationReward(clientType, dates);
		}
		return new ReservationRegular(clientType, dates);
	}
}

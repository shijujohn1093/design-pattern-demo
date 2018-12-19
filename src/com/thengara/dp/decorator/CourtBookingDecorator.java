package com.thengara.dp.decorator;

import com.thengara.dp.decorator.CourtBooking;

public abstract class CourtBookingDecorator implements CourtBooking {

	CourtBooking courtbooking;

	public CourtBookingDecorator(CourtBooking courtbooking) {
		this.courtbooking = courtbooking;
	}

}

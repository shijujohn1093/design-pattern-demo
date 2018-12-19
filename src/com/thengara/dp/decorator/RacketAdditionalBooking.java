package com.thengara.dp.decorator;

public class RacketAdditionalBooking extends CourtBookingDecorator {

	private final String name = "Racket";
	public RacketAdditionalBooking(CourtBooking courtbooking) {
		super(courtbooking);
	}

	@Override
	public String getInfo() {
		return name + " " + courtbooking.getInfo();

	}

	@Override
	public double cost() {
		return 12 + courtbooking.cost();
	}

}

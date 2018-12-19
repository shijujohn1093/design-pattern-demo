package com.thengara.dp.decorator;

public class BallAdditionalBooking extends CourtBookingDecorator {

	private final String name = "Ball";
	public BallAdditionalBooking(CourtBooking courtbooking) {
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

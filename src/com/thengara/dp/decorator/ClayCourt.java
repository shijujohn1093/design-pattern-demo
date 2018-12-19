package com.thengara.dp.decorator;

public class ClayCourt implements CourtBooking {

	private final String name;

	public ClayCourt() {
		super();
		name = "Clay Court";
	}

	@Override
	public String getInfo() {
		return name;

	}

	@Override
	public double cost() {
		return 12;
	}

}

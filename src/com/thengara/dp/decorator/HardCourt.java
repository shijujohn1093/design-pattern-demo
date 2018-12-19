package com.thengara.dp.decorator;

import com.thengara.dp.decorator.CourtBooking;

public class HardCourt implements CourtBooking {

	private final String name;

	public HardCourt() {
		super();
		name = "Hard Court";
	}

	@Override
	public String getInfo() {
		return name;

	}

	@Override
	public double cost() {
		return 11;
	}

}

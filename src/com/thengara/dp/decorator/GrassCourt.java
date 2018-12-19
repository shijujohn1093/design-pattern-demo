package com.thengara.dp.decorator;

import com.thengara.dp.decorator.CourtBooking;

public class GrassCourt implements CourtBooking {

	private final String name;

	public GrassCourt() {
		super();
		name = "Grass Court";
	}

	@Override
	public String getInfo() {
		return name;

	}

	@Override
	public double cost() {
		return 13;
	}

}

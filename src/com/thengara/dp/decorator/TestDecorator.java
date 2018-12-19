package com.thengara.dp.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		CourtBooking court1 = new ClayCourt();
		court1 = new RacketAdditionalBooking(court1);
		court1 = new BallAdditionalBooking(court1);
		System.out.println("Info :" + court1.getInfo());
		System.out.println("Cost :" + court1.cost());

	}
}

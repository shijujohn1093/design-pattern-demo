package com.thengara.dp.observer;

public class TestObeserver {

	public static void main(String[] args) {
		StockGrabber subject = new StockGrabber();

		new StockPriceObserver(subject);
		subject.setApplPrice(100);
		// subject.setGoogPrice(101);
		// subject.setIbmPrice(102);
		System.out.println("------------------");

		new StockPriceObserver(subject);
		subject.setApplPrice(100);
		// subject.setGoogPrice(101);
		// subject.setIbmPrice(102);
	}
}

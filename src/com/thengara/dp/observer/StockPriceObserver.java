package com.thengara.dp.observer;

public class StockPriceObserver implements Observer {

	private static int observerIdTracker = 0;

	private int observerId;
	private double ibmPrice;
	private double applPrice;
	private double googPrice;

	public StockPriceObserver(Subject subject) {
		observerId = ++observerIdTracker;
		subject.registerObserver(this);
		System.out.println("New Observer id : " + observerId);
	}

	@Override
	public void update(double ibmPrice, double applPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		this.googPrice = googPrice;
		printPrice();
	}

	public void printPrice() {
		System.out.println("Printing " + observerId);
		System.out.println("IBM : " + ibmPrice);
		System.out.println("APPLE : " + applPrice);
		System.out.println("GOOGLE : " + googPrice);

	}

}

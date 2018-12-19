package com.thengara.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private double ibmPrice;
	private double applPrice;
	private double googPrice;

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, applPrice, googPrice);
		}

	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();

	}

	public double getApplPrice() {
		return applPrice;
	}

	public void setApplPrice(double applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();

	}

}

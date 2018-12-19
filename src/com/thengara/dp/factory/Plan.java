package com.thengara.dp.factory;

public abstract class Plan {
	protected double rate;

	abstract void loadRate();

	public double calculateBill(int units) {
		return units * rate;
	}
}

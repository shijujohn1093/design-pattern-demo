package com.thengara.dp.factory;

public class InstitutionalPlan extends Plan {

	public InstitutionalPlan() {
		loadRate();
	}
	@Override
	void loadRate() {
		rate = 5.50;
	}

}

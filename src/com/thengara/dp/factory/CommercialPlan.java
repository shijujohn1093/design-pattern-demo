package com.thengara.dp.factory;

public class CommercialPlan extends Plan {
	public CommercialPlan() {
		loadRate();
	}
	@Override
	void loadRate() {
		rate = 7.50;
	}

}

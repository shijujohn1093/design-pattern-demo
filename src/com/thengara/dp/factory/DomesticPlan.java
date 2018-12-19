package com.thengara.dp.factory;

public class DomesticPlan extends Plan {

	public DomesticPlan() {
		loadRate();
	}

	@Override
	public void loadRate() {
		rate = 3.50;
	}

}

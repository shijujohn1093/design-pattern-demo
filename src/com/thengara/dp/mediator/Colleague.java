package com.thengara.dp.mediator;

public abstract class Colleague {

	private int colleagueCode;
	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
		this.mediator.addColleauge(this);
	}

	public void saleOffer(String stock, int shares) {
		mediator.saleOffer(stock, shares, colleagueCode);
	}

	public void buyOffer(String stock, int shares) {
		mediator.buyOffer(stock, shares, colleagueCode);
	}

	public void setColleagueCode(int colleagueCode) {
		this.colleagueCode = colleagueCode;
	}

	public int getColleagueCode() {
		return colleagueCode;
	}

}

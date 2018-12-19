package com.thengara.dp.mediator;

public class StockOffer {

	private final int stockShare;
	private final String stockSymbol;
	private final int colleagueCode;

	public StockOffer(String stockSymbol, int stockShare, int colleagueCode) {
		super();
		this.stockShare = stockShare;
		this.stockSymbol = stockSymbol;
		this.colleagueCode = colleagueCode;
	}
	public int getStockShare() {
		return stockShare;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public int getColleagueCode() {
		return colleagueCode;
	}

}

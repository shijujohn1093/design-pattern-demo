package com.thengara.dp.mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {

	private List<Colleague> colleagues;
	private List<StockOffer> stockBuyOffers;
	private List<StockOffer> stockSellOffers;

	private int colleagueCounter = 0;

	public StockMediator() {
		colleagues = new ArrayList<>();
		stockBuyOffers = new ArrayList<>();
		stockSellOffers = new ArrayList<>();
	}

	@Override
	public void addColleauge(Colleague colleague) {
		colleagues.add(colleague);
		colleague.setColleagueCode(colleagueCounter++);
	}

	@Override
	public void saleOffer(String stockSymbol, int stockShare, int colleagueCode) {
		boolean stockSold = false;
		for (StockOffer stockOffer : stockBuyOffers) {

			if (stockOffer.getStockSymbol().equals(stockSymbol) && stockOffer.getStockShare() == stockShare
			        && stockOffer.getColleagueCode() != colleagueCode) {
				stockBuyOffers.remove(stockOffer);
				System.out.println(
				        stockShare + " shares of " + stockSymbol + " sold by " + colleagueCode + " bought by " + stockOffer.getColleagueCode());
				stockSold = true;
				break;

			}
		}
		if (!stockSold) {
			stockSellOffers.add(new StockOffer(stockSymbol, stockShare, colleagueCode));
			System.out.println(stockShare + " shares of " + stockSymbol + " added to inventory by " + colleagueCode + " for sale");

		}

	}

	@Override
	public void buyOffer(String stockSymbol, int stockShare, int colleagueCode) {
		boolean stockBought = false;
		for (StockOffer stockOffer : stockSellOffers) {

			if (stockOffer.getStockSymbol().equals(stockSymbol) && stockOffer.getStockShare() == stockShare
			        && stockOffer.getColleagueCode() != colleagueCode) {
				stockSellOffers.remove(stockOffer);
				System.out.println(
				        stockShare + " shares of " + stockSymbol + " sold by " + stockOffer.getColleagueCode() + " bought by " + colleagueCode);
				stockBought = true;
				break;

			}
		}
		if (!stockBought) {
			stockBuyOffers.add(new StockOffer(stockSymbol, stockShare, colleagueCode));
			System.out.println(stockShare + " shares of " + stockSymbol + " added to inventory by " + colleagueCode + " to buy");

		}
	}

	public void getOfferings() {
		System.out.println("\nStocks for Sale");

		for (StockOffer stockOffer : stockSellOffers) {

			System.out.println(stockOffer.getStockShare() + " of " + stockOffer.getStockSymbol());

		}
		System.out.println("\nStock Buy Offers");

		for (StockOffer stockOffer : stockBuyOffers) {
			System.out.println(stockOffer.getStockShare() + " of " + stockOffer.getStockSymbol());

		}
	}

}

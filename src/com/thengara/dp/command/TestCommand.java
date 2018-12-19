package com.thengara.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		Stock stock = new Stock("YES_BANK", 10);

		Broker broker = new Broker();
		broker.takOrder(new BuyStock(stock));
		broker.takOrder(new BuyStock(stock));

		broker.takOrder(new BuyStock(stock));

		broker.takOrder(new BuyStock(stock));

		broker.takOrder(new BuyStock(stock));

		broker.takOrder(new BuyStock(stock));

		broker.takOrder(new SellStock(stock));

		broker.placeOrder();

	}
}

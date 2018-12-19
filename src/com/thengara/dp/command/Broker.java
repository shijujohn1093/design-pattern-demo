package com.thengara.dp.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	List<Order> stockOrders = new ArrayList<>();

	public void takOrder(Order order) {
		stockOrders.add(order);
	}

	public void placeOrder() {
		stockOrders.forEach(order -> order.execute());
	}

}

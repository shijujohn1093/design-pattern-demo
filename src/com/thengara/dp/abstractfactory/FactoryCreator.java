package com.thengara.dp.abstractfactory;

import com.thengara.dp.abstractfactory.AbstractFactory;
import com.thengara.dp.abstractfactory.BankFactory;
import com.thengara.dp.abstractfactory.LoanFactory;

public class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}

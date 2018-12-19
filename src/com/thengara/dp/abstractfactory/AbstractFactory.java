package com.thengara.dp.abstractfactory;

import com.thengara.dp.abstractfactory.bank.Bank;
import com.thengara.dp.abstractfactory.loan.Loan;

public abstract class AbstractFactory {

	public abstract Loan getLoan(String loan);
	public abstract Bank getBank(String bank);
}

package com.thengara.dp.abstractfactory;

import com.thengara.dp.abstractfactory.bank.Bank;
import com.thengara.dp.abstractfactory.bank.HDFCBank;
import com.thengara.dp.abstractfactory.bank.ICICIBank;
import com.thengara.dp.abstractfactory.bank.SBIBank;
import com.thengara.dp.abstractfactory.loan.Loan;

public class BankFactory extends AbstractFactory {

	@Override
	public Loan getLoan(String loanName) {
		return null;
	}
	@Override
	public Bank getBank(String bankName) {
		Bank bank = null;
		if (bankName == null) {
		} else if (bankName.equalsIgnoreCase("HDFC")) {
			bank = new HDFCBank();
		} else if (bankName.equalsIgnoreCase("ICICI")) {
			bank = new ICICIBank();
		} else if (bankName.equalsIgnoreCase("SBI")) {
			bank = new SBIBank();
		}
		return bank;
	}
}

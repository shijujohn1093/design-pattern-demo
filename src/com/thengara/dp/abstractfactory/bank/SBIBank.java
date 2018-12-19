package com.thengara.dp.abstractfactory.bank;

import com.thengara.dp.abstractfactory.bank.Bank;

public class SBIBank implements Bank {
	private final String bankName = "SBI";

	@Override
	public String getBankName() {
		return bankName;
	}

}

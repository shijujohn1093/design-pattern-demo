package com.thengara.dp.abstractfactory.bank;

import com.thengara.dp.abstractfactory.bank.Bank;

public class ICICIBank implements Bank {
	private final String bankName = "ICICI";

	@Override
	public String getBankName() {
		return bankName;
	}

}

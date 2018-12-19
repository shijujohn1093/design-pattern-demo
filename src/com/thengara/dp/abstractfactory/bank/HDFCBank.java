package com.thengara.dp.abstractfactory.bank;

import com.thengara.dp.abstractfactory.bank.Bank;

public class HDFCBank implements Bank {
	private final String bankName = "HDFC";

	@Override
	public String getBankName() {
		return bankName;
	}

}

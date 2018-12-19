package com.thengara.dp.facade;

public class AccountCodeCheck {

	private final String accountCode = "12345678";

	public String getAccountCode() {
		return accountCode;
	}

	public boolean validateAccountCode(String accountCode) {
		return this.accountCode.equals(accountCode);
	}
}

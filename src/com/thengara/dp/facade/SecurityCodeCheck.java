package com.thengara.dp.facade;

public class SecurityCodeCheck {

	private final String securityCode = "123";

	public String getAccountCode() {
		return securityCode;
	}

	public boolean validateSecurityCode(String accountCode) {
		return securityCode.equals(securityCode);
	}
}

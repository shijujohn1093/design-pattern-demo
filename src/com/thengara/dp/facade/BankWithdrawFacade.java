package com.thengara.dp.facade;

public class BankWithdrawFacade {

	private final String accountCode;
	private final String securityCode;
	private final AccountCodeCheck accountCodeCheck;
	private final SecurityCodeCheck securityCodeCheck;
	private final FundCheck fundcheck;

	public BankWithdrawFacade(String accountCode, String securityCode) {
		super();
		this.accountCode = accountCode;
		this.securityCode = securityCode;
		accountCodeCheck = new AccountCodeCheck();
		securityCodeCheck = new SecurityCodeCheck();
		fundcheck = new FundCheck();
	}

	public void withdrawFund(double amountToBeWithdrawd) {
		if (accountCodeCheck.validateAccountCode(accountCode) && securityCodeCheck.validateSecurityCode(securityCode)
		        && fundcheck.haveSufficientFund(amountToBeWithdrawd)) {
			double balance = fundcheck.withdrawFund(amountToBeWithdrawd);
			System.out.println("Transaction Successful ! " + balance);
		} else {
			System.out.println("Transaction Failed !");
		}
	}

	public void makeDeposit(double amountToDeposit) {
		if (accountCodeCheck.validateAccountCode(accountCode) && securityCodeCheck.validateSecurityCode(securityCode)) {
			double balance = fundcheck.depositFund(amountToDeposit);
			System.out.println("Transaction Successful ! " + balance);
		} else {
			System.out.println("Transaction Failed !");
		}
	}

}

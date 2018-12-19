package com.thengara.dp.facade;

public class TestFacade {

	public static void main(String[] args) {

		BankWithdrawFacade facade = new BankWithdrawFacade("12345678", "123");
		facade.withdrawFund(1100);

	}
}

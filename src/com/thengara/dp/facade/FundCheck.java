package com.thengara.dp.facade;

public class FundCheck {
	private double availableFund = 1000;

	public double getAvailableFund() {
		return availableFund;
	}

	public boolean haveSufficientFund(double fundToWithdraw) {
		return getAvailableFund() >= fundToWithdraw;
	}

	public double withdrawFund(double fundToWithdraw) {
		if (haveSufficientFund(fundToWithdraw)) {
			availableFund = getAvailableFund() - fundToWithdraw;
		}
		return getAvailableFund();
	}

	public double depositFund(double fundToDeposit) {
		availableFund = availableFund + fundToDeposit;
		return getAvailableFund();

	}
}

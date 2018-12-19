package com.thengara.dp.abstractfactory.loan;

public class BusinessLoan extends Loan {

	@Override
	public void initRate(double rate) {
		this.rate = rate;
	}

}

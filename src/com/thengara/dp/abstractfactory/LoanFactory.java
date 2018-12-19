package com.thengara.dp.abstractfactory;

import com.thengara.dp.abstractfactory.bank.Bank;
import com.thengara.dp.abstractfactory.loan.BusinessLoan;
import com.thengara.dp.abstractfactory.loan.EducationLoan;
import com.thengara.dp.abstractfactory.loan.HomeLoan;
import com.thengara.dp.abstractfactory.loan.Loan;

public class LoanFactory extends AbstractFactory {

	@Override
	public Loan getLoan(String loanType) {
		Loan loan = null;
		if (loanType == null) {
		} else if (loanType.equalsIgnoreCase("Home")) {
			loan = new HomeLoan();
		} else if (loanType.equalsIgnoreCase("Business")) {
			loan = new BusinessLoan();
		} else if (loanType.equalsIgnoreCase("Education")) {
			loan = new EducationLoan();
		}
		return loan;
	}
	@Override
	public Bank getBank(String bank) {
		return null;
	}
}

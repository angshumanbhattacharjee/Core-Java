package com.capgemini.bank;

public class CurrentAccount extends BankAccount implements Insurance{

	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Lic Beema";
	}

	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 80000;
	}

	public String getInsuranceType() {
		// TODO Auto-generated method stub
		return "lifetime";
	}

}

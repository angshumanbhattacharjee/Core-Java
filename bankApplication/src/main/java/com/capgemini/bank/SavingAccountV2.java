package com.capgemini.bank;

public class SavingAccountV2 extends SavingAccount implements Insurance {

	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "jeevan Beema";
	}

	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 50000;
	}

	public String getInsuranceType() {
		// TODO Auto-generated method stub
		return "lifetime";
	}
	
	public static void main(String[] args) {
		SavingAccountV2 acc= new SavingAccountV2();
		
		BankAccount acc1= new SavingAccount();
		
		acc.deposit(4500);
		
		System.out.println(acc);
		
	}

	@Override
	public String toString() {
		return "SavingAccountV2 [accountNo=" + accountNo + ", accoutnHolderName=" + accoutnHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	


}

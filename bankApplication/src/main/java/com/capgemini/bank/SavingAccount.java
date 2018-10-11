package com.capgemini.bank;

public class SavingAccount extends BankAccount implements Comparable<SavingAccount>{
	String accountType;
	
	public SavingAccount() {
		System.out.println("inside saving account");
		accountType="salaried";
	}

	public SavingAccount(String accountHolderName, double balance, String accountType) {
		super(accountHolderName, balance);
		this.accountType = accountType;
	}
	
	
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(accountBalance<amount) {
			accountBalance-=amount;
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accountType=" + accountType + ", accountNo=" + accountNo + ", accoutnHolderName="
				+ accoutnHolderName + ", accountBalance=" + accountBalance + "]";
	}

	@Override
	public int compareTo(SavingAccount acc1) {
		// TODO Auto-generated method stub
		return acc1.getAccountNo()-getAccountNo();
	}

//	public static void main(String[] args) {
//		SavingAccount acc= new SavingAccount();
//		
//		BankAccount acc1= new SavingAccount();
//		
//		acc.deposit(4500);
//		
//		System.out.println(acc);
//		
//	}

	
}

package com.capgemini.bank;

public class SavingAccount extends BankAccount{
	String accountType;
	
	public SavingAccount() {
		System.out.println("inside saving account");
		accountType="salaried";
	}

	public SavingAccount(String accountType) {
		super("Angshuman", 8411);
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

	public static void main(String[] args) {
		SavingAccount acc= new SavingAccount();
		
		BankAccount acc1= new SavingAccount();
		
		acc.deposit(4500);
		
		System.out.println(acc);
		
	}

	
}

package com.capgemini.bank;

/** comment for documentation
 * 
 *  @author angbhatt
 *  
 *  **/

public abstract class BankAccount {
	
	int accountNo;
	String accoutnHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	public BankAccount() {
		super();
		accountNo=++autoAccountNoGen;
		accoutnHolderName="unknown";
		accountBalance=0;
	}

	public BankAccount(String accoutnHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
		this.accoutnHolderName = accoutnHolderName;
		this.accountBalance = accountBalance;
	}
	
	
	
	
	public void withdraw(double amount) {
		accountBalance-=amount;
	}
	
	public void deposit(double amount) {
		accountBalance+=amount;
	}
	
	public String getAccoutnHolderName() {
		return accoutnHolderName;
	}

	public void setAccoutnHolderName(String accoutnHolderName) {
		this.accoutnHolderName = accoutnHolderName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	

	

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accoutnHolderName=" + accoutnHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
}

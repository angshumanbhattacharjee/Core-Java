package com.capgemini.bank.customer;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.SavingAccount;
import com.capgemini.bank.SavingAccountV2;

public class Customer {

	public static void main(String[] args) {
	
	BankAccount acc1= new SavingAccount();
	
	acc1.withdraw(700);
	
	acc1.deposit(7500);
	
	SavingAccountV2 acc2= new SavingAccountV2();
	
	//acc2.getAccountType();
	
	//BankAccount acc2= new BankAccount();
	
	//BankAccount acc3= acc1;
	
	System.out.println("account 1:  "+acc1);
	
	//System.out.println("account 2:  "+acc2);
	
	System.out.println("account 3:  "+acc2);
	
	//acc2.setAccoutnHolderName("Abhishek");
	
	System.out.println(acc2.getInsuranceName());
	
	System.out.println(acc2.getInsuranceAmount());
	
	System.out.println(acc2.getInsuranceType());
	
	//System.out.println(acc2.getAccoutnHolderName());
	
	//System.out.println("account 2:  "+acc2);
}
	
}

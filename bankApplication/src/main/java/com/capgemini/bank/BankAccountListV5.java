package com.capgemini.bank;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class BankAccountListV5 {

	
TreeSet<SavingAccount> bankAccountList = new TreeSet<SavingAccount>();
	
	public void addBankAccount(SavingAccount savings) {
		bankAccountList.add(savings);
	}
	
	public TreeSet<SavingAccount> updateBankAccount(int accountNo, String accountHolderName) {
		for(SavingAccount acc: bankAccountList) {
			if(acc.getAccountNo()==accountNo) {
				acc.setAccoutnHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Cannot update Account details");
	}
	
	public TreeSet<SavingAccount> removeBankAccount(int accountNo) {
		for(SavingAccount acc: bankAccountList) {
			if(acc.getAccountNo()==accountNo) {
				bankAccountList.remove(acc);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Cannot remove Account");
	}
	
	public TreeSet<SavingAccount> getAllBankAccounts() {
		return bankAccountList;
	}
	
	public SavingAccount GetBankAccountById(int AccountId) {
		for(SavingAccount acc: bankAccountList) {
			if(acc.getAccountNo()==AccountId) {
				return acc;
			}
		}

		throw new RuntimeException("Account does not exist");
	}
	
	/*public TreeSet<SavingAccount> sortBankAccountByName(){
		Collections.sort(bankAccountList, new Comparator<SavingAccount>() {

			public int compare(SavingAccount acc1, SavingAccount acc2) {
				return acc1.getAccoutnHolderName().compareTo(acc2.getAccoutnHolderName());
			}
			
		});
		return bankAccountList;
	}*/
	
	public static void main(String[] args) {
		
		SavingAccount acc1= new SavingAccount("abhilasha",9000, "salaried");
		SavingAccount acc2= new SavingAccount();
		SavingAccount acc5= new SavingAccount();
		SavingAccount acc3= new SavingAccount();
		SavingAccount acc4= new SavingAccount();
		
		
		BankAccountListV2 list= new BankAccountListV2();
		
		
		list.addBankAccount(acc1);
		list.addBankAccount(acc2);
		list.addBankAccount(acc3);
		list.addBankAccount(acc4);
		list.addBankAccount(acc5);
		
		Integer a;
		
		
		
		for( BankAccount list1: list.getAllBankAccounts()) {
			System.out.println(list1);
		}
	}
}

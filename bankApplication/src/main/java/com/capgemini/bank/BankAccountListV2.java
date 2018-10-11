package com.capgemini.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankAccountListV2 {

	ArrayList<SavingAccount> bankAccountList = new ArrayList<SavingAccount>();
	
	public void addBankAccount(SavingAccount savings) {
		bankAccountList.add(savings);
	}
	
	public ArrayList<SavingAccount> updateBankAccount(int accountNo, String accountHolderName) {
		for(int internalIndex=0; internalIndex<bankAccountList.size();internalIndex++) {
			if(bankAccountList.get(internalIndex).getAccountNo()==accountNo) {
				bankAccountList.get(internalIndex).setAccoutnHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Cannot update Account details");
	}
	
	public ArrayList<SavingAccount> removeBankAccount(int accountNo) {
		for(int internalIndex=0;internalIndex<bankAccountList.size();internalIndex++) {
			if(bankAccountList.get(internalIndex).getAccountNo()==accountNo) {
				bankAccountList.remove(internalIndex);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Cannot remove Account");
	}
	
	public ArrayList<SavingAccount> getAllBankAccounts() {
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
	
	public ArrayList<SavingAccount> sortBankAccountByName(){
		Collections.sort(bankAccountList, new Comparator<SavingAccount>() {

			public int compare(SavingAccount acc1, SavingAccount acc2) {
				return acc1.getAccoutnHolderName().compareTo(acc2.getAccoutnHolderName());
			}
			
		});
		return bankAccountList;
	}
	
//	public ArrayList<SavingAccount> sortBankAccountByNameV2(){
//		Collections.sort(bankAccountList, (Comparator<? super SavingAccount>) (acc1,acc2) -> acc1.getAccoutnHolderName().compareTo(acc2.getAccoutnHolderName()));
//		return bankAccountList;
//	}
	
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

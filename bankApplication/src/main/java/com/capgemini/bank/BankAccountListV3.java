package com.capgemini.bank;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class BankAccountListV3 {
	
LinkedList<SavingAccount> bankAccountList = new LinkedList<SavingAccount>();
	
	public void addBankAccount(SavingAccount savings) {
		bankAccountList.add(savings);
	}
	
	public LinkedList<SavingAccount> updateBankAccount(int accountNo, String accountHolderName) {
		for(int internalIndex=0; internalIndex<bankAccountList.size();internalIndex++) {
			if(bankAccountList.get(internalIndex).getAccountNo()==accountNo) {
				bankAccountList.get(internalIndex).setAccoutnHolderName(accountHolderName);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Cannot update Account details");
	}
	
	public LinkedList<SavingAccount> removeBankAccount(int accountNo) {
		for(int internalIndex=0;internalIndex<bankAccountList.size();internalIndex++) {
			if(bankAccountList.get(internalIndex).getAccountNo()==accountNo) {
				bankAccountList.remove(internalIndex);
				return bankAccountList;
			}
		}
		throw new RuntimeException("Cannot remove Account");
	}
	
	public LinkedList<SavingAccount> getAllBankAccounts() {
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
	
	public LinkedList<SavingAccount> sortBankAccountByName(){
		Collections.sort(bankAccountList, new Comparator<SavingAccount>() {

			public int compare(SavingAccount acc1, SavingAccount acc2) {
				return acc1.getAccoutnHolderName().compareTo(acc2.getAccoutnHolderName());
			}
			
		});
		return bankAccountList;
	}
}

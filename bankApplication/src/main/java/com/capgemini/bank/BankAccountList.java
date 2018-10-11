package com.capgemini.bank;

public class BankAccountList {
	
	int index=0;
	SavingAccount[] saving= new SavingAccount[5]; 
	
	public void addBankAccount(SavingAccount savings) {
		saving[index]=savings;
		index++;
	}
	
	public SavingAccount[] updateBankAccount(int accountNo, String accountHolderName) {
		for(int internalIndex=0; internalIndex<saving.length;internalIndex++) {
			if(saving[internalIndex].getAccountNo()==accountNo) {
				saving[internalIndex].setAccoutnHolderName(accountHolderName);
				return saving;
			}
		}
		throw new RuntimeException("Cannot update Account details");
	}
	
	public SavingAccount[] removeBankAccount(int accountNo) {
		for(int i=0;i<index;i++) {
			if(accountNo==i) {
				int j=i;
				while(j<4) {
					saving[j]=saving[j+1];
				}
				index--;
				return saving;
				}
		}
		throw new RuntimeException("Cannot remove Account");
	}
	
	
	
	public SavingAccount[] getAllBankAccounts() {
		return saving;
	}
	
	
	
	public SavingAccount GetBankAccountById(int AccountId) {
		for(SavingAccount acc: saving) {
			if(acc.getAccountNo()==AccountId) {
				return acc;
			}
		}

		throw new RuntimeException("Account does not exist");
	}
	
	public static void main(String[] args) {
		
		SavingAccount acc1= new SavingAccount();
		SavingAccount acc2= new SavingAccount();
		SavingAccount acc5= new SavingAccount();
		SavingAccount acc3= new SavingAccount();
		SavingAccount acc4= new SavingAccount();
		
		
		BankAccountList list= new BankAccountList();
		
		
		list.addBankAccount(acc1);
		list.addBankAccount(acc2);
		list.addBankAccount(acc3);
		list.addBankAccount(acc4);
		list.addBankAccount(acc5);
		
		list.removeBankAccount(4);
		
		
		for( BankAccount list1: list.getAllBankAccounts()) {
			System.out.println(list1);
		}
	}
}

package com.capgemini.bank;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BankAccountMap {

	Map<Integer, BankAccount> bankAccountMap;
	
	public BankAccountMap() {
		bankAccountMap= new TreeMap<>();
	}
	
	public void addBankAccountForEmployee(int empId, BankAccount acc) {
		bankAccountMap.put(empId, acc);
	}
	
	public Set<Integer> getallEmployeeId() {
		return bankAccountMap.keySet();
	}
	
	public Collection<BankAccount> getAllBankAccounts() {
		
			return bankAccountMap.values(); 
	}
	
	public Set<Map.Entry<Integer, BankAccount>> getEmployeeBankDetails() {
		return bankAccountMap.entrySet();
	}
	
}

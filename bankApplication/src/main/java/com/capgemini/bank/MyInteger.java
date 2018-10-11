package com.capgemini.bank;

public class MyInteger implements Comparable<MyInteger> {

	int num;
	
	public MyInteger(int num) {
		this.num=num;
	}

	public Integer getN() {
		return num;
	}

	@Override
	public int compareTo(MyInteger number) {
		// TODO Auto-generated method stub
		return this.num-number.num;
	}

	@Override
	public String toString() {
		return "MyInteger [num=" + num + "]";
	}
	
	
}

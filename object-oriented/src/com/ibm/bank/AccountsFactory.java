package com.ibm.bank;

public class AccountsFactory {
	public static Savings openSavings(String holder) {
		return new Savings(holder);
	}
	
	public Current openCurrent(String holder) {
		return new Current(holder);
	}

	

}
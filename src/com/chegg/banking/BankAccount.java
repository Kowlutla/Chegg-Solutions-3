package com.chegg.banking;

public class BankAccount {
	
	protected int accountNumber;
	protected double balance;
	
	
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		this.balance-=amount;
	}
	
	public String toString()
	{
		String result="";
		result=result+"Account Number = "+getAccountNumber()+"\n";
		result=result+"Balance = "+getBalance()+"\n";
		return result;
	}
}

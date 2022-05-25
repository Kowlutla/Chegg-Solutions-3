package com.chegg.banking;

public class Customer {

	private String firstName;
	private String lastName;
	private Account account;

	public Customer(String firstName, String lastName, Account account) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}

	public Customer(String firstName, String lastName, Account account, double balance, double interest) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
//
//		account.setBalance(balance);
//		if (account instanceof SavingsAccount) {
//			((SavingsAccount) account).setInterestRate(interest);
//		}
	}

	public Customer(String firstName, String lastName, Account account, double balance, double overdraft, double fee) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;

		account.setBalance(balance);
		if (account instanceof CheckingAccount) {
			((CheckingAccount) account).setOverdraftAmount(overdraft);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}

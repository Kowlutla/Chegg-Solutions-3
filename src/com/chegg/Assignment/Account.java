package com.chegg.Assignment;

public class Account {

	// Fields
	private String name;
	private double balance;

	/**
	 * @param name
	 * @param balance
	 */
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

}

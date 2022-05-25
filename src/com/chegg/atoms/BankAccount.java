package com.chegg.atoms;

public class BankAccount {

	public String name;
	public int branchNur;
	public int bankAccount;

	// A
	private static int count = 0;

	// B
	public BankAccount() {
		this.name = "No name";
		this.branchNur = 234;
		count++;
	}

	// C
	/**
	 * @return the bankAccount
	 */
	public int getBankAccount() {
		return bankAccount;
	}

	// D
	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	// E
	public String toString() {
		return "Name: " + this.name + ", BranchNur: " + this.branchNur + ", bank account: " + this.bankAccount;
	}

}

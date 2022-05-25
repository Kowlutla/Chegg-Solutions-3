package com.chegg.banking;

public class CheckingAccount extends Account {

	private double overdraftAmount;
	private double transactionFee;

	public CheckingAccount(String accountNumber, double balance, double overdraftAmount, double transactionFee) {
		super(accountNumber, balance);
		this.overdraftAmount = overdraftAmount;
		this.transactionFee = transactionFee;
	}

	public void withdraw(double amount) throws OverdraftException {
		// if balance < amount
		if (this.balance < amount) {
			// overdraftNeeded = amount – balance
			double overdraftNeeded = amount - this.balance;

			// if overdraftAmount < overdraftNeeded
			if (overdraftAmount < overdraftNeeded) {
				// then transaction fails
				throw new OverdraftException("Transaction failed.Overdraft needed: ", overdraftNeeded);
			} else// else
			{
				// balance = 0
				this.balance = 0;
				// decrement overdraftAmount by overdraftNeeded
				this.overdraftAmount = -overdraftNeeded;
			}
		} else// else
		{
			// decrement balance by amount
			this.balance -= amount;
		}

	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public double getTransactionFee() {
		return transactionFee;
	}

	public void setTransactionFee(double transactionFee) {
		this.transactionFee = transactionFee;
	}
}

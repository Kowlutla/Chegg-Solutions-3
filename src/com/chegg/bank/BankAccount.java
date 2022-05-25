package com.chegg.bank;

public class BankAccount implements Measurable
{
	private int accNumber;
	private double balance;
	private static int LastAssignedNumber;
	
	public BankAccount()
	{
		balance=0.0;
		LastAssignedNumber++;
		accNumber=LastAssignedNumber;
	}
	
	public BankAccount(double b)
	{
		balance=b;
		LastAssignedNumber++;
		accNumber=LastAssignedNumber;
	}
	
	public int getAccountNumber()
	{
		return accNumber;
	}
	
	@Override
	public double getMeasure()
	{
		return balance;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}

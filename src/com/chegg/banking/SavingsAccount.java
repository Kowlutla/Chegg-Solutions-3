package com.chegg.banking;

public class SavingsAccount extends BankAccount {

	//instance variable interestrate
	private double interestRate;

	//constructor to first call constructor in super class and then initializes interestRate
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	//Override deposite method
	@Override
	public void deposit(double amount)
	{
		//so that customer receives the credit amount*interestRate
		//then add it to balance
		this.balance+=(amount+amount*interestRate);
	}
	
	//override toString method
	@Override
	public String toString() {
		
		//super class(BankAccount) toString method should be like below
		/**
		 * 	String result="";
			result=result+"Account Number = "+getAccountNumber()+"\n";
			result=result+"Balance = "+getBalance()+"\n";
			return result;
		 */
		return super.toString()+"Interest Rate = "+interestRate;
	}
	
	//method annualCredit that is called at the end of year
	public void annualCredit()
	{
		//if balance less than or equal 1000
		if(balance<=1000)
		{
			//customer receives the credit equal to product of interestRate and balance
			deposit(interestRate*balance);
			//System.out.printf("Annual Credit: %.2f\n",interestRate*balance);
		}
		//if balance less than or equal 5000
		else if(balance<=5000)
		{
			//customer receives the credit equal to twice the product of interestRate and balance
			deposit(interestRate*balance*2);
			//System.out.printf("Annual Credit: %.2f\n",interestRate*balance*2);
		}
		//else balance >5000
		else
		{
			//customer receives the credit equal to three time the product of interestRate and balance
			deposit(interestRate*balance*3);
			//System.out.printf("Annual Credit: %.2f\n",interestRate*balance*3);
		}
	}	
}

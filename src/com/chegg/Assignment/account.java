package com.chegg.Assignment;

import java.lang.*;
import java.util.Scanner;

//account class
public class account {
	public static int count; // count will store the number of records to be used
	//sort method will sort the account names in ascending order using selection sort

	public static void sort(Account[] accounts) {
		int i, j;
		Account temp;
		//loop for sorting
		for (i = 0; i < count; i++) {
			for (j = i + 1; j < count; j++) {
				if (accounts[i].getName().compareTo(accounts[j].getName()) > 0) // compare two account names
				{
					//swap two accounts
					temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
				}
			}
		}

	}
	//print method will print the details

	public static void print(Account[]accounts) {
		int j;
		for (j = 0; j < count; j++) {
			System.out.println(accounts[j].getName() + " " + accounts[j].getBalance());
		}
	}

	//total method will compute the total of all accounts and return it
	public static double total(Account[]accounts) {
		int j;
		double sum = 0;
		for (j = 0; j < count; j++) {
			sum = sum + accounts[j].getBalance(); // compute the total of all accounts
		}
		return sum;// return the total amount
	}

	//driver program
	public static void main(String args[]) {
		//create account name and balance with 100 strength
		Account[]accounts=new Account[100];
		int i = 0, j;

		Scanner sc = new Scanner(System.in);// declare the scanner object
		//ask user how many records to input
		System.out.println("How many records do you want to input");
		count = sc.nextInt();

		//loop to input the account name and balance
		for (i = 0; i < count; i++) {
			System.out.println("Enter the account name");
			sc.nextLine();// this will take the newline
			String name = sc.nextLine();

			System.out.println("Enter the account balance");
			double balance = sc.nextDouble();
			
			accounts[i]=new Account(name, balance);
		}
		//display the data befor sorting
		System.out.println("=================");
		System.out.println("Before Sorting");
		System.out.println("=================");
		//print data using print method
		print(accounts);
		//sort the data using sort method
		sort(accounts);
		//display the data after sorting
		System.out.println("=================");
		System.out.println("After Sorting");
		System.out.println("=================");
		print(accounts);
		//print the total balance
		System.out.println("Total amount of all accounts is : " + total(accounts));
	}
}
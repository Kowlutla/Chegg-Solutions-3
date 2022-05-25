package com.chegg.atoms;


/**
 * First Name:
 * Last Name:
 * Student ID:
 * Date:
 *
 */
public class ICE3_Recursion {
	
	public static void forLoop(int n) {
		for(int i=0;i<n;i+=2) {
			System.out.print(i);
		}
	}
	
	//Recursive method to print even numbers upto n
	public static void recursive(int n) {
		
		//if n is less than 1, return from method
		if(n<1) {
			return;
		}
		//recursively call method for n-1
		recursive(n-1);
		
		//if current number is odd
		if(n%2==1) {
			//print its previous number as even number
			System.out.print(n-1);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.printf("%s\n","for loop: ");
		forLoop(10);
		
		System.out.printf("\n%s\n","recursion: ");
		recursive(10);

	}

}

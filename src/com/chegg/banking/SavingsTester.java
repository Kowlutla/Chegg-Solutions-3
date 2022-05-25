package com.chegg.banking;

import java.util.Scanner;

public class SavingsTester {

	public static void main(String[] args) {

		System.out.println(readInt());
	}

	private static int readInt() {
		Scanner KB = new Scanner(System.in);
		String valueStr = KB.nextLine();
		if (isNumeric(valueStr)) {
			return Integer.parseInt(valueStr);
		}
		return -1;
	}

	
	private static boolean isNumeric(String valueStr) {
		try {
			// convert string to integer
			// if no exception raised then it is integer and return true
			int value = Integer.parseInt(valueStr);
			return true;
		} catch (NumberFormatException e) {
			// if it raises exception then it is not integer and return false
			return false;
		}
	}
}

package com.chegg.file;

// A1B1.java, For A1, OOP, 2021

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class A1B1 { // declare a class, name A1B1

	public static void mONE() { // DO NOT MODIFY the method header

		// 1. METHOD BODY TO BE FINISHED BY STUDENT
		System.out.println("Hello...");

	}

	public static String mTWO() { // GIVEN, DO NOT MODIFY

		Calendar c = Calendar.getInstance(); // current date & time as Calendar

		String curTimeStr = c.get(Calendar.HOUR_OF_DAY) + ":"

				+ c.get(Calendar.MINUTE) + ":"

				+ c.get(Calendar.SECOND);

		return curTimeStr;

	}

	public static int[] mTHREE() { // DO NOT MODIFY the method header

		// 2. METHOD BODY TO BE FINISHED BY STUDENT
		int array[] = new int[6];
		Random rand = new Random();
		for (int i = 0; i < 6; i++) {
			array[i] = rand.nextInt(49) + 1;
		}
		return array;

	}

	public static void dispMenu() { // DO NOT MODIFY the method header

		// 3. METHOD BODY TO BE FINISHED BY STUDENT
		System.out.println("\n>> Options (Integer Only):");
		System.out.println("1: Say Hello.");
		System.out.println("2: Check Time.");
		System.out.println("3: Mark Six Numbers.");
		System.out.println("0: Exit the program.");

	}

	public static void main(String[] args) { // main() method, the entry point where the program starts

		System.out.println("--- START of A1B1 ---");

		// 4. METHOD BODY TO BE FINISHED BY STUDENT
		Scanner sc = new Scanner(System.in);
		int option;
		while (true) {
			dispMenu();
			System.out.print("  .. Select an options: ");
			option = sc.nextInt();
			if (option == 0)
				break;
			switch (option) {
			case 1:
				mONE();
				break;
			case 2:
				System.out.println("Current Time is " + mTWO());
				break;
			case 3:
				int array[] = mTHREE();
				System.out.println("Mark six: " + Arrays.toString(array));
				break;
			default:
				System.out.println("UNKNOWN option <" + option + ">.. try again!");
				break;
			}
		}
		sc.close();

		System.out.println("\n>>> END of main(). Done by , , , <<<");

	}

}
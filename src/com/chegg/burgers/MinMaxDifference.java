package com.chegg.burgers;

import java.util.Random;
import java.util.Scanner;

public class MinMaxDifference {

	public static void main(String[] args) {

		// Create Scanner Object to read input from user
		Scanner sc = new Scanner(System.in);

		// Create Random Object to genereate random numberss
		Random rand = new Random();

		// Ask user to enter size of array
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		// create array with given size
		int array[] = new int[size];

		// store the array with random numbers from 0-100(inclusive)
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(101);
		}

		// print the elements of array
		System.out.print("\nThe array elements are: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
		// assign max to minimum value of integer
		int max = Integer.MIN_VALUE;
		// assign min to maximum value of integer
		int min = Integer.MAX_VALUE;

		// look for all values in array
		for (int i = 0; i < size; i++) {
			// if current value is less than min
			if (array[i] < min) {
				// change min to current number
				min = array[i];
			}

			// if current value is greater than max
			if (array[i] > max) {
				// change max to current value
				max = array[i];
			}
		}
		// print the difference between highest and lowest values in array
		System.out.println("The difference between the highest and lowest value is: " + (max - min));
		sc.close();
	}
}
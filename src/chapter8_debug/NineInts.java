package chapter8_debug;

import java.util.Scanner;

public class NineInts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create an integer array of size 9
		int arr[] = new int[9];

		// instead hard coding values into array, take values as input from keyboard
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		//print first to last
		System.out.println("From first to last: ");

		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");

		//print last to first
		System.out.println("\nForm last to first : ");

		for (int i = arr.length - 1; i >= 0; i--)

			System.out.print(arr[i] + " ");

		sc.close();

	}

}
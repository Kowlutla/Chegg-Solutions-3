package chegg.invoices.com;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Asking user to enter values
		System.out.print("Enter the starting value: ");
		int startingValue = sc.nextInt();
		System.out.print("Enter the max value: ");
		int maxValue = sc.nextInt();
		System.out.print("Enter the step value: ");
		int stepValue = sc.nextInt();

		System.out.println();
		// printing sequence using for loop
		int sum1 = 0;
		int i = 0;
		System.out.print("FOR:\t\t");
		for (i = startingValue; i + stepValue <= maxValue; i = i + stepValue) {
			sum1 += i;
			System.out.print(i + " + ");
		}
		sum1 += i;
		System.out.println(i + " = " + sum1);

		// printing sequence using while loop
		System.out.print("WHILE:\t\t");
		int sum2 = 0;
		i = startingValue;
		while (i + stepValue <= maxValue) {
			sum2 += i;
			System.out.print(i + " + ");
			i = i + stepValue;
		}
		sum2 += i;
		System.out.println(i + " = " + sum2);

		// printing sequence using do/while loop
		System.out.print("DO/WHILE:\t");
		int sum3 = 0;
		i = startingValue;
		do {
			sum3 += i;
			System.out.print(i + " + ");
			i = i + stepValue;
		} while (i + stepValue <= maxValue);
		sum3 += i;
		System.out.println(i + " = " + sum3);

		sc.close();

	}

}

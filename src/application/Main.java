package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// create array of temperatures
		double[] temperatures = new double[7];
		int day = 0;

		// read temperature for 10 days
		while (day < 7) {
			// asking user to enter temperature of day
			System.out.print("Enter the temperature of day " + (day + 1) + ": ");
			double temperature = sc.nextDouble();

			// asking user temperature until valid temperature
			while (temperature < 0 || temperature > 110) {
				System.out.println("You enter invalid temperature, temperature must be between 0 and 110");
				temperature = sc.nextDouble();
			}
			// store the temperature in array
			temperatures[day] = temperature;
			day++;
		}

		// get the average temperature of week
		double averageTemp = average(temperatures);
		// print the average
		System.out.printf("the average of all the temperature in the week = %.2f\n", averageTemp);

		// call and print lower temperatures than avg temperature
		lowTemp(temperatures);
		sc.close();
	}

	// Method to return the average of temperatures
	public static double average(double temperatures[]) {
		double sum = 0;
		for (int i = 0; i < temperatures.length; i++) {
			sum += temperatures[i];
		}

		return sum / temperatures.length;
	}

	// method that print lower temperature than average temperature
	public static void lowTemp(double temperatures[]) {

		System.out.print("temperatures in the week that are lower than the average: ");
		// get the average temperature
		double avg_temp = average(temperatures);

		// look for all temperatures
		for (int i = 0; i < temperatures.length; i++) {

			// print the low temperature than avg temperatures
			if (temperatures[i] < avg_temp) {
				System.out.print(temperatures[i] + " ");
			}
		}
		System.out.println();

	}

}

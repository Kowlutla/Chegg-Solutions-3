import java.util.Random;
import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// asking user to enter size of array1
		System.out.print("Enter Size of Array1: ");
		int size1 = sc.nextInt();

		// asking user to enter size of array2
		System.out.print("Enter Size of Array2: ");
		int size2 = sc.nextInt();

		// creat array1 and array2 with size1 and size2 respectively
		int array1[] = new int[size1];
		int array2[] = new int[size2];

		// ask user to enter low and high values to generate random values
		System.out.print("Enter low value for array1: ");
		int low1 = sc.nextInt();
		System.out.print("Enter high value for array1: ");
		int high1 = sc.nextInt();

		// call fillArray method to fill array1 with random values between low1 and
		// high1
		fillArray(array1, low1, high1);

		// ask user to enter low and high values to generate random values
		System.out.print("Enter low value for array2: ");
		int low2 = sc.nextInt();
		System.out.print("Enter high value for array2: ");
		int high2 = sc.nextInt();

		// call fillArray method to fill array2 with random values between low2 and
		// high2
		fillArray(array2, low2, high2);

		// Calling printArray method for array1
		System.out.println("\nContents of array1: ");
		printArray(array1);

		// Calling printArray method for array2
		System.out.println("\nContents of array2: ");
		printArray(array2);

		// asking user to enter value to check count method for array1
		System.out.print("\n\nEnter Value1: ");
		int value1 = sc.nextInt();

		// call count() and print result for array1
		int count1 = count(array1, value1);
		System.out.print("Count Of elements greater than " + value1 + " in array1 is: " + count1);

		// asking user to enter value to check count method for array2
		System.out.print("\n\nEnter Value2: ");
		int value2 = sc.nextInt();
		// call count() and print result for array2
		int count2 = count(array2, value2);
		System.out.print("Count Of elements greater than " + value2 + " in array1 is: " + count2);

		System.out.println();
		// Checking both array1 and array2 are same or not
		boolean isSame = isSame(array1, array2);
		if (isSame) {
			System.out.println("Array1 and Array2 are same");
		} else {
			System.out.println("Array1 and Array2 are not same");
		}

		System.out.println();
		// get the average for array1
		double average = findAverage(array1);
		// print result
		System.out.println("Average of array1 element is: " + average);

		System.out.println();

		// get the count of elements greater than average for array2
		int count = aboveAverage(array2);
		System.out.println("Count of elements above average in array2 is: " + count);
		sc.close();

	}

	/**
	 * Method that takes
	 * 
	 * @param array
	 * @param low
	 * @param high  and fill the array with random values with in given
	 *              range(inclusive)
	 */
	public static void fillArray(int array[], int low, int high) {

		// Create Random class Object
		Random rand = new Random();
		// fill the array with random numbers with given range
		for (int i = 0; i < array.length; i++)
			array[i] = rand.nextInt((high - low) + 1) + low;
	}

	/**
	 * Method that takes
	 * 
	 * @param array and display the elements of array 5 elements per line
	 */
	public static void printArray(int array[]) {

		int i = 0;
		// for each element in array
		while (i < array.length) {

			// print current element
			System.out.print(array[i] + " ");

			i++;
			// print new line when line has 5 elements
			if (i % 5 == 0)
				System.out.println();
		}
	}

	/**
	 * method that takes
	 * 
	 * @param array
	 * @param value and
	 * @return count number of elements greater than value
	 */
	public static int count(int array[], int value) {
		// initialize count to 0
		int count = 0;
		// for each element in array
		for (int i = 0; i < array.length; i++) {

			// if current element is greater than value
			if (array[i] > value) {
				// increment count
				count++;
			}
		}
		// return count
		return count;
	}

	/**
	 * Method that takes
	 * 
	 * @param array1
	 * @param array2 and
	 * @return true is two arrays have atleast one common element
	 */
	public static boolean isSame(int array1[], int array2[]) {

		// for all elements in array1
		for (int i = 0; i < array1.length; i++) {
			// for all elements in array2
			for (int j = 0; j < array2.length; j++) {

				// if array1 and array2 elements are same
				if (array1[i] == array2[j]) {

					// return true as same
					return true;
				}
			}
		}

		// if no element found common return false as not same
		return false;
	}

	/**
	 * Method that takes
	 * 
	 * @param array and
	 * @return average of array elements
	 */
	public static double findAverage(int array[]) {
		// initialize sum to 0
		double sum = 0;
		// for each element in array
		for (int i = 0; i < array.length; i++) {
			// add to sum
			sum += array[i];
		}

		// calculate average
		double average = sum / array.length;
		// return average
		return average;
	}

	/**
	 * Method that takes
	 * 
	 * @param array and
	 * @return count of element which are greater than average
	 */
	public static int aboveAverage(int array[]) {

		// get the average of array
		double average = findAverage(array);
		// initialize count to 0
		int count = 0;

		// for each element in array
		for (int i = 0; i < array.length; i++) {

			// if current element is greater than average
			if (array[i] > average) {
				// increment count
				count++;
			}
		}

		// return count
		return count;

	}

}

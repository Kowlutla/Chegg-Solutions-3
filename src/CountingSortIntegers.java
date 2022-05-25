import java.util.Arrays;

import java.util.InputMismatchException;

import java.util.Random;

import java.util.Scanner;

/**
 * 
 * A class for implementing and testing counting sort of integers
 *
 * 
 * 
 * @author YOUR NAME
 * 
 * @version 10/6/2020
 * 
 */

public class CountingSortIntegers

{

	/**************************************************************
	 *
	 * 
	 * 
	 * COUNTING SORT
	 *
	 * 
	 * 
	 **************************************************************/

	/**
	 * 
	 * Making only one pass through the array, counts the number of times
	 * 
	 * each integer occurs in the array. These counts are then used
	 * 
	 * to sort the array
	 *
	 * 
	 * 
	 * @param a        array to be sorted
	 * 
	 * @param maxValue the maximum possible value in the array
	 * 
	 */

	public static void countingSort(int[] a, int maxValue)

	{

		int countarray[] = new int[maxValue + 1];// to store occurance of each element of array upto maxValue
		int len = a.length;
		int result[] = new int[len];

		// count the occurences of each element
		for (int i = 0; i < len; i++) {
			countarray[a[i]]++;
		}

		// find the actual position of each element in sorted of each element
		// that is cummulative count of each array
		for (int i = 1; i < countarray.length; i++) {
			countarray[i] = countarray[i] + countarray[i - 1];
		}

		// Find the index of each element of the original array in count array, and
		// place the elements in output array
		for (int i = len - 1; i >= 0; i--) {

			result[--countarray[a[i]]] = a[i];
		}

		// Copy the sorted elements into original array
		for (int i = 0; i < a.length; i++) {
			a[i] = result[i];
		}

	} // end countingSort

	public static void main(String args[])

	{

		int arraySize = 0;

		int trials = 0;

		int maxNumber = 0;

		boolean invalidInput;

		// get input

		do

		{

			try

			{

				invalidInput = false;

				Scanner keyboard = new Scanner(System.in);

				System.out.println("What size array should be used?" +

						"\n It should be an integer value greater than or equal to 1.");

				arraySize = keyboard.nextInt();

				System.out.println("How many arrays should be used (number of trials)?" +

						"\n It should be an integer value greater than or equal to 1.");

				trials = keyboard.nextInt();

				System.out.println("What maximum number should be generated?" +

						"\n It should be an integer value greater than or equal to 1.");

				maxNumber = keyboard.nextInt();

			}

			catch (InputMismatchException ime)

			{

				System.out.println("Could not convert input to an integer");

				invalidInput = true;

			}

			catch (Exception e)

			{

				System.out.println("There was an error with System.in");

				System.out.println(e.getMessage());

				invalidInput = true;

			}

		} while (invalidInput);

		// start testing

		int data[];

		int forTesting[];

		for (int i = 1; i <= trials; i++)

		{

			System.out.println("\nTRIAL #" + i);

			Random generator = new Random();

			// create an array and fill it with random values between 0 and MAX_RANDOM
			// exclusive

			data = new int[arraySize];

			for (int j = 0; j < arraySize; j++)

			{

				data[j] = generator.nextInt(maxNumber + 1);

			}

			System.out.println("The original array is: ");

			System.out.println(Arrays.toString(data));

			// make a copy of the original array we will sort it and use it for comparing
			// result

			forTesting = Arrays.copyOf(data, arraySize);

			Arrays.sort(forTesting);

			countingSort(data, maxNumber);

			System.out.println("The original array sorted with countingSort: ");

			System.out.println(Arrays.toString(data));

			System.out.println(Arrays.equals(data, forTesting) ? "  passes" : "   \u001B[35m\u001B[1mfails\u001B[0m");

		} // end for

	}

}
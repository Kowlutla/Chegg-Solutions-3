import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class MatrixSearch {

	// This method converts a list of integers to an array of integers
	// Do not change this method
	public static int[] convertIntegers(List<Integer> integers) {
		int[] ret = new int[integers.size()];
		Iterator<Integer> iterator = integers.iterator();
		for (int i = 0; i < ret.length; i++) {
			ret[i] = iterator.next().intValue();
		}
		return ret;
	}

	// Search for a key in a matrix and returns all the indices in an array
	// The indices are converted into a linear form.
	public static int[] linearSearchExtended(int[][] numbers, int key) {
		
		//Create list to store indices 
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				//if current value is equal to key
				if(numbers[i][j]==key)
				{
					//add indices as linear form to list
					list.add(i*numbers[i].length+j);
				}
			}
		}
		
		//convert List to array by calling method
		int[]result=convertIntegers(list);
		//return the resulted array
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nRow, nColumn = 0;
		do {
			System.out.println("Both the row and column must be > 0");
			nRow = input.nextInt();
			nColumn = input.nextInt();
		} while (nRow <= 0 || nColumn <= 0);
		int[][] numbers = new int[nRow][nColumn];
		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < nColumn; j++) {
				numbers[i][j] = input.nextInt();
			}
		}

		/*
		 * System.out.println("The matrix contains: "); for (int i = 0; i < nRow; ++i) {
		 * for(int j = 0; j < nColumn; j++) { System.out.printf("%5d", numbers[i][j]); }
		 * System.out.println(); } System.out.println();
		 */
		System.out.printf("Enter a search key:%n ");
		int key = input.nextInt();

		int[] allIndices = linearSearchExtended(numbers, key);

		if (allIndices.length == 0) {
			System.out.printf("%d not found!%n", key);
		} else {
			System.out.printf("Found %d at index: ", key);
			for (int i = 0; i < allIndices.length; i++) {
				System.out.printf("%d ", allIndices[i]);
			}
		}
	}
}
import java.util.*;

public class Solution {

	public int[][] sort(int[] list) {

		int arr[][] = new int[2][list.length];

		// create the another copy of list to reverse sort
		int list1[] = Arrays.copyOfRange(list, 0, list.length);

		// call the quickSort to sort list ascending order
		quickSort(list, 0, list.length - 1);
		// store the sorted list
		arr[0] = list;
		// call the reverseQuickSort to sort list descending order
		reverseQuickSort(list1, 0, list1.length - 1);

		arr[1] = list1;

		return arr;

	}

	private static void quickSort(int array[], int low, int high) {
		if (low < high) {

			// find pivot element such that
			// elements smaller than pivot are on the left
			// elements greater than pivot are on the right
			int pi = partition(array, low, high);

			// recursive call on the left of pivot
			quickSort(array, low, pi - 1);

			// recursive call on the right of pivot
			quickSort(array, pi + 1, high);
		}
	}
	
	// method to find the partition position
	private static int partition(int array[], int low, int high) {

		// choose the rightmost element as pivot
		int pivot = array[high];

		// pointer for greater element
		int i = (low - 1);

		// traverse through all elements
		// compare each element with pivot
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {

				// if element smaller than pivot is found
				// swap it with the greater element pointed by i
				i++;

				// swapping element at i with element at j
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		// swapt the pivot element with the greater element specified by i
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		// return the position from where partition is done
		return (i + 1);
	}

	
	/**
	==========================================================================
	 */
	private static void reverseQuickSort(int array[], int low, int high) {
		if (low < high) {

			// find pivot element such that
			// elements smaller than pivot are on the left
			// elements greater than pivot are on the right
			int pi = revpartition(array, low, high);

			// recursive call on the left of pivot
			reverseQuickSort(array, low, pi - 1);

			// recursive call on the right of pivot
			reverseQuickSort(array, pi + 1, high);
		}
	}
	
	// method to find the partition position
	private static int revpartition(int array[], int low, int high) {

		// choose the rightmost element as pivot
		int pivot = array[high];

		// pointer for greater element
		int i = (low - 1);

		// traverse through all elements
		// compare each element with pivot
		for (int j = low; j < high; j++) {
			if (array[j] >= pivot) {

				// if element smaller than pivot is found
				// swap it with the greater element pointed by i
				i++;

				// swapping element at i with element at j
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		// swapt the pivot element with the greater element specified by i
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		// return the position from where partition is done
		return (i + 1);
	}

}
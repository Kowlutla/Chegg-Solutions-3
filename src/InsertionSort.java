import java.util.Arrays;

//Java program for implementation of Insertion Sort in Descending order
public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort();

		// creating unsorted array
		int unsorted1[] = { 1, 3, 5, 7, 9 };
		// Sort the array in descending order
		int sorted1[] = sort.insertionSortInts(unsorted1);
		// print unsorted and sorted arrays
		System.out.printf("InsertionSortInts(%s) --> %s\n\n", Arrays.toString(unsorted1), Arrays.toString(sorted1));

		// creating unsorted array
		int unsorted2[] = { 1, 5, 4, 2, 3 };
		// Sort the array in descending order
		int sorted2[] = sort.insertionSortInts(unsorted2);
		// print unsorted and sorted arrays
		System.out.printf("InsertionSortInts(%s) --> %s\n\n", Arrays.toString(unsorted2), Arrays.toString(sorted2));

		// creating unsorted array
		int unsorted3[] = { 11, 4, 67, 12, 14 };
		// Sort the array in descending order
		int sorted3[] = sort.insertionSortInts(unsorted3);
		// print unsorted and sorted arrays
		System.out.printf("InsertionSortInts(%s) --> %s\n\n", Arrays.toString(unsorted3), Arrays.toString(sorted3));
	}

	// Method implementation of Insertion Sort in Descending order
	public int[] insertionSortInts(int[] unsorted) {
		//
		for (int i = 1; i < unsorted.length; i++) {
			int key = unsorted[i];
			int j = i - 1;

			/*
			 * Move elements of unsorted[0..i-1], that are less than key, 
			 * to one position ahead of their current position
			 */
			while (j >= 0 && unsorted[j] < key) {
				unsorted[j + 1] = unsorted[j];
				j--;
			}

			unsorted[j + 1] = key;
		}
		// return sorted array
		return unsorted;
	}
}

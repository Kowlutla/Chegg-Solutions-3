public class BubbleSort {

	public static void main(String[] args) {
		
		//Create integer array with given values
		int array[]= {3,9,1,8,11,13,90,8,46,38};
		
		//print the array elements in original order
		System.out.println("Data items in original order / your name");
		for(int i=0;i<array.length;i++) {
			System.out.print("  "+array[i]);
		}

		//call method to sort array in ascending order
		bubbleSort(array);
		
		//print the array elements after sorting
		System.out.println("\nData items in ascending order / your Surname");
		for(int i=0;i<array.length;i++) {
			System.out.print("  "+array[i]);
		}
	}

	// method to sort array by using bubble sort algorithm
	public static void bubbleSort(int[] array) {

		// loop to access each array element
		for (int i = 0; i < array.length - 1; i++) {

			// loop to compare array elements
			for (int j = 0; j < array.length - i - 1; j++) {

				// compare two adjacent elements
				// change > to < to sort in Ascending order
				if (array[j] > array[j + 1]) {

					// swapping occurs if elements
					// are not in the intended order
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}

import java.util.Random;

public class ArrayProgram {
	public static void main(String[] args) {

		// create array of size 10
		int array[] = new int[10];
		// populate array with some random values
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(1000);
		}
		// calling valuesAt method
		System.out.println(valuesAt(array, 5));
	}

	/**
	 * Method that takes
	 * @param array
	 * @param index and
	 * @return value present at index of array
	 */
	public static int valuesAt(int array[], int index) {
		// if index is not in range throw exception
		if (index < 0 || index >= 10) {
			throw new IndexOutOfBoundsException("Index is not in range");
		}
		// Otherwise return value present at index in array
		else {
			return array[index];
		}
	}
}
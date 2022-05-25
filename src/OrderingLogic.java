import java.util.Random;

public class OrderingLogic {

	// the board variable needs to be public so that
	// it can be accessed by the JUnit test. Please
	// do not modify its visibility.
	public int[] data;

	/**
	 * @param size - the number of tiles on the board. if size is not positive, set
	 *             it to 1 before proceeding. if size is more than 15, set it to 15
	 *             before proceeding. instantiate array data to contain (validated)
	 *             size items. populate array data with randomized items between 1
	 *             and 90 (inclusive on both sides).
	 */
	public OrderingLogic(int size) {
		/*
		 * read javadoc method comment carefully. applet will start working. once you
		 * complete this successfully. then you can proceed with the rest of the game.
		 */
		if (size <= 0) {
			this.data = new int[1];
		} else if (size > 15) {
			this.data = new int[15];
		} else {
			this.data = new int[size];
		}

		Random rand = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(90) + 1;
		}
	}

	/**
	 *
	 * Check if index idx is a valid index, that is, if there is an item at that
	 * index. Return false if the index is invalid
	 *
	 * @param idx - the index to check
	 * @return true if index idx is a valid index of the array, false otherwise
	 */
	public boolean isValidIndex(int idx) {
		if (idx < 0 || idx >= data.length || data[idx] == 0) {
			return false;
		}
		return true;
	}

	/**
	 *
	 * Remove the item at index idx moving all subsequent items "to the left". Do
	 * nothing if the index idx is invalid
	 * 
	 * @param idx
	 */
	public void remove(int idx) {
		if (idx < 0 || idx >= data.length) {
			return;
		}
		for (int i = idx; i < data.length - 1; i++) {
			data[i] = data[i + 1];
		}

		data[data.length - 1] = 0;
	}

	/**
	 *
	 * @return true if the array is sorted in ascending OR descending order, false
	 *         otherwise
	 */
	public boolean isSorted() {

		boolean asc = true;
		boolean desc = true;

		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] > data[i + 1]) {
				asc = false;
				break;
			}
		}

		// check for descending order
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i] < data[i + 1]) {
				desc = false;
				break;
			}
		}

		return asc | desc;
	}
}
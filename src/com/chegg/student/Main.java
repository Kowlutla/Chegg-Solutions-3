package com.chegg.student;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();
		ArrayList arr = new ArrayList<>();
		/**
		 * . If arr contains the strings {"be happy", "happy", "I am happy", "happy
		 * happy joy joy", "happy"}
		 */
		arr.add("be happy");
		arr.add("happy");
		arr.add("I am happy");
		arr.add("happy happy joy joy");
		arr.add("happy");

		/**
		 * The method call countOccurances(arr, "happy") would return 2.
		 */
		System.out.println("countOccurances(arr, \"happy\"): " + main.countOccurances(arr, "happy"));

		/**
		 * The method call countOccurances(arr, "joy") would return −1.
		 */
		System.out.println("countOccurances(arr, \"joy\"): " + main.countOccurances(arr, "joy"));

	}

	/**
	 * Method countOccurances that takes
	 * 
	 * @param arr
	 * @param str
	 * @return counts the number of times a given phrase Return the number of words
	 *         in strIf no matches are found, return −1.
	 */
	public int countOccurances(ArrayList arr, String str) {

		// initialize count to 0
		int count = 0;
		// for all words in list
		for (int i = 0; i < arr.size(); i++) {
			// if current word equal to given word
			if (arr.get(i).equals(str)) {
				// increment count
				count++;
			}
		}

		// if phrase not found in arr return -1
		if (count == 0)
			return -1;
		// otherwise return count
		return count;

	}
}

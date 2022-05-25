import java.util.Scanner;

public class PalindromeCost {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// take number of test cases from user
		int T = sc.nextInt();

		// array to store the results of T testcases
		int result[] = new int[T];
		for (int i = 0; i < T; i++) {
			// take length of string
			int length = sc.nextInt();
			// take the string from user
			String s = sc.next();

			// if user enter string of length greater than provided length
			// it will consider only string upto given length
			s = s.substring(0, length);

			// get the cost to make palindrome by calling method
			int cost = getPalindromeCost(s, length);

			// store the cost in result array
			result[i] = cost;
		}

		// print the output of all test cases
		System.out.println("\nOutput : ");
		for (Integer i : result) {
			System.out.println(i);
		}
		sc.close();
	}

	/**
	 * Method that takes
	 * @param String s
	 * @param length of String s
	 * @return no of character need to delete to make remaining string arrangement
	 *         is palindrome
	 */
	public static int getPalindromeCost(String s, int length) {

		// to count no of characters to remove
		int cost = 0;

		// create count array of size 26 to keep count of each
		// character from 'a' to 'z'
		int count[] = new int[26];

		// for all characters in string
		for (int i = 0; i < length; i++) {
			// increment the count of corresponding character count
			count[s.charAt(i) - 'a']++;
		}
		/**
		 * to make string palindrome all characters must appear even number of times
		 * with one odd character(Optional)
		 */
		// look all characters the count
		for (int i = 0; i < 26; i++) {
			// if character occured odd number of times
			if (count[i] % 2 == 1) {
				// increment cost
				cost++;
			}
		}

		// if cost is 0 that mean all character occured even number of times
		if (cost == 0)
			return 0;
		// Otherwise return cost-1 because one character is allowed to make palindrome
		else
			return cost - 1;
	}
}

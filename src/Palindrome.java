import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {

		// Declare Strings to check palindrome
		String s1 = "Able was I, ere I saw Elba";
		String s2 = "Won ton? Not now!";
		String s3 = "Madam, I'm Adam";
		String s4 = "Eve";
		String s5 = "Kowlutla is good boy";

		// Check for string1
		System.out.println("\nIs Palindrome (" + s1 + ") : " + isPalindrome(s1));
		// Check for string2
		System.out.println("\nIs Palindrome (" + s2 + ") : " + isPalindrome(s2));
		// Check for string3
		System.out.println("\nIs Palindrome (" + s3 + ") : " + isPalindrome(s3));
		// Check for string4
		System.out.println("\nIs Palindrome (" + s4 + ") : " + isPalindrome(s4));
		// Check for string5
		System.out.println("\nIs Palindrome (" + s5 + ") : " + isPalindrome(s5));
	}

	/**
	 * Method that takes
	 * @param s String
	 * @return boolean whether string is palindrome or not
	 */
	public static boolean isPalindrome(String s) {
		// convert given string to lowercase for case insentivity
		s = s.toLowerCase();
		// Create stack to hold characters of string in reverse order
		Stack<Character> stack = new Stack<>();
		// Create Queue to hold characters of string in original order
		Queue<Character> queue = new LinkedList<>();
		// add all characters of string to stack and queue
		for (int i = 0; i < s.length(); i++) {
			// if current character is letters or digit add to stack and Queue
			if (Character.isLetterOrDigit(s.charAt(i))) {
				stack.push(s.charAt(i));
				queue.offer(s.charAt(i));
			}
		}
		// for all characters in stack and queue
		while (!queue.isEmpty() && !stack.isEmpty()) {
			// get the top character present in stack
			char stackChar = stack.pop();
			// get the top character present in queue
			char queueChar = queue.poll();

			// if both characters are not same return false as string is not palindrome
			if (stackChar != queueChar)
				return false;
		}
		// return true if all characters of Stack and Queue are Matched
		return true;
	}
}

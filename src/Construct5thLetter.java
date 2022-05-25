import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Construct5thLetter {
	public static void main(String[] args) {

		// Scanner Object to read String from user
		Scanner sc = new Scanner(System.in);
		// List to store 5th character of strings
		List<Character> result = new ArrayList<>();
		String word;
		// infinate loop
		while (true) {
			// Asking user to enter word or type 'Q' to quit
			System.out.print("Enter a word (or type Q to quit): ");
			// take input from user
			word = sc.nextLine();

			// if user type 'Q' or 'q' to Quit exit from the loop
			if (word.equalsIgnoreCase("Q"))
				break;
			// if word does not have 5th character skip this word
			if (word.length() < 5)
				continue;
			/*
			 * other wise add the character present at 4th index(5th character) to the list
			 */
			else
				result.add(word.charAt(4));
		}
		// print the list of characters
		System.out.println("List Of Characters: \n" + result);
		sc.close();
	}
}

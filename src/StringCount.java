import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// asking user to enter string
		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		// Store each word in array
		String words[] = s.split(" ");
		// to hold count of words of first or last character is 'e' or 'E'
		int count = 0;

		// for each word in words array
		for (String word : words) {
			// if first or last character is 'e' or 'E' increment count
			int lastIndex = word.length() - 1;
			if (word.charAt(0) == 'e' || word.charAt(0) == 'E' || word.charAt(lastIndex) == 'e'
					|| word.charAt(lastIndex) == 'E') {
				count++;
			}
		}
		// print count
		System.out.println("Number of words that starts with e or ends with e is: " + count);
		sc.close();
	}

}

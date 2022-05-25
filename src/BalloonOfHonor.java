import java.util.Scanner;

public class BalloonOfHonor {

	/**
	 * method getPositionOfChar that takes
	 * @param inChar
	 * @return position of inChar in alphabets
	 */
	public static int getPositionOfChar(char inChar) {

		// Calculate Position of inChar in alphabets
		int position = inChar - 'A' + 1;
		// return the position
		return position;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// take the input character from keyboard
		char inChar = sc.next().charAt(0);

		// call method and get the position of inChar in alphabets
		int position = getPositionOfChar(inChar);

		// print position of inChar
		System.out.println(position);

		sc.close();
	}
}

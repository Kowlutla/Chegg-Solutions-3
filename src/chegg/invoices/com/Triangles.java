package chegg.invoices.com;

import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number;
		char character;
		do {
			System.out.print("Enter Number Between 1-50: ");
			number = sc.nextInt();
			if (number >= 1 && number <= 50) {
				break;
			} else {
				System.out.println("Invalid range... Please try again....");
			}

		} while (true);

		System.out.print("Enter Character: ");
		character = sc.next().charAt(0);

		printRightTriangle(number, character);
		printFlippedUpsideDownTriangle(number, character);
		sc.close();
	}

	

	/**
	 * Method printRight Triangle that takes
	 * @param number
	 * @param character
	 * and print Right triangle with 'number' rows by printing 'character'
	 */
	public static void printRightTriangle(int number, char character) {

		System.out.println("RightTriangle with "+number+" rows with '"+character+"':");
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(character + " ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Method to print printFlippedUpsideDownTriangle that takes
	 * 
	 * @param number
	 * @param character as arguements print Flipped Upside Down Triangle by printing
	 *                  given character
	 */
	public static void printFlippedUpsideDownTriangle(int number, char character) {

		System.out.println("Flipped Upside Down Triangle with "+number+" rows with '"+character+"':");
		for (int i = number; i > 0; i--) {
			for (int j = 0; j < number - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2) - 1; j++)

			{
				System.out.print(character);
			}
			System.out.println();
		}
	}

}

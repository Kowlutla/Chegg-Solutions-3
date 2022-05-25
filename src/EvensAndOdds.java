import java.util.Random;

public class EvensAndOdds {

	public static void main(String[] args) {

		// array to store 25 random values
		int array[] = new int[25];

		// create Random class Object
		Random rand = new Random();

		// genereate 25 random numbers from 0 to 99 and store in array
		for (int i = 0; i < 25; i++) {
			array[i] = rand.nextInt(100);
		}

		// print odd numbers from above random values
		System.out.println("Odd: ");
		for (int i = 0; i < 25; i++) {
			if (array[i] % 2 == 1)
				System.out.print(array[i] + " ");
		}

		// print even numbers from above random values
		System.out.println("\nEven: ");
		for (int i = 0; i < 25; i++) {
			if (array[i] % 2 == 0)
				System.out.print(array[i] + " ");
		}
	}

}

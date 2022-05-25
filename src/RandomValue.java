import java.util.Random;
public class RandomValue {
	public static void main(String[] args) {
		// create Random class Object to generate Random number
		Random rand = new Random();

		// generate random numeber between 1 to 15
		int value = rand.nextInt(15) + 1;

		// printing randomly generated value
		System.out.println("The randomly generated value is: " + value);

		// printing divisors
		System.out.println("The divisors are: ");

		// to hold the product of divisors
		int product = 1;

		// loop to calculate divisors
		for (int i = 1; i < value; i++) {
			// if current value divids value
			if (value % i == 0) {
				// multiply the current value to product
				product *= i;
				// print the current value
				System.out.print(i + ", ");
			}
		}
		// multiply the value to product
		product *= value;
		// print the value as it is divisor itself
		System.out.println(value);

		// print the product of divisors
		System.out.println("The product of the divisors is: " + product);
	}
}

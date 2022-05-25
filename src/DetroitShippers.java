import java.util.Scanner;

public class DetroitShippers {

	// main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// for three times
		for (int i = 1; i <= 3; i++) {

			// ask user to enter four things weight and length and width and height
			System.out.print("Enter the weight and the dimensions of the product:");
			double weight = sc.nextDouble();
			double length = sc.nextDouble();
			double width = sc.nextDouble();
			double height = sc.nextDouble();

			// call method computeVolume and store result in variable volume
			double volume = computeVolume(length, width, height);

			// calculate and print shipping cost by calling method
			calculateShippingCost(weight, volume);
			System.out.println();
		}
		sc.close();
	}

	/**
	 * method to compute and return volume of cube by taking
	 * 
	 * @param length
	 * @param width
	 * @param height
	 * @return volume of cube
	 */
	public static double computeVolume(double length, double width, double height) {
		return length * width * height;
	}
	/**
	 * Method to compute and print the shipping cost of product
	 * 
	 * @param weight
	 * @param volume
	 */
	public static void calculateShippingCost(double weight, double volume) {
		// if weight is exceeds 8.5kg
		if (weight > 8.5) {
			System.out.println("The product can not be delivered due to excess weight");
		}
		// if volume is exceeds 500 cc
		else if (volume > 500) {
			System.out.println("The product can not be delivered due to excess volume");
		}
		// Otherwise
		else {
			// if 0<=weight<=2 and 50<=volume<=100
			if ((weight >= 0 && weight <= 2) && (volume >= 50 && volume <= 100)) {
				System.out.println("The cost to ship this product is BDT. 700");
			}

			// if 2<weight<=4.5 and 100<volume<=300
			else if ((weight > 2 && weight <= 4.5) && (volume > 100 && volume <= 300)) {
				System.out.println("The cost to ship this product is BDT. 1000");
			}
			// if 4.5<weight<=8.5 and 300<volume<=500
			else if ((weight > 4.5 && weight <= 8.5) && (volume > 300 && volume <= 500)) {
				System.out.println("The cost to ship this product is BDT. 2000");
			}
		}
	}
}
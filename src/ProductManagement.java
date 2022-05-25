
import java.util.Random;
public class ProductManagement {
	public static void main(String[] args) {
		// create Random Object to generate random numbers
		Random rand = new Random();

		// two dimensional array to store the 300 products deatails
		int products[][] = new int[300][3];

		// generate the details for 300 products
		for (int i = 0; i < 300; i++) {
			// randomly get the count of product (atmost 100)
			int count = rand.nextInt(101);

			// randomly generate the price for product between 10 and 1000 inclusive of both
			int productPrice = rand.nextInt(1001 - 10) + 10;

			// calculate the totalAmount for product
			int totalAmount = productPrice * count;

			// store the details of product
			products[i][0] = count;
			products[i][1] = productPrice;
			products[i][2] = totalAmount;
		}
		// print the details of 300 products in tabular form
		System.out.println("| Count Of Products\t| Product Price\t\t| TotalAmount\t    |");
		System.out.println("|-----------------------|-----------------------|-------------------|");
		for (int i = 0; i < 300; i++) {
			System.out.println(
					"| " + products[i][0] + "\t\t\t| " + products[i][1] + "\t\t\t| " + products[i][2] + "\t\t    |");
			System.out.println("|-----------------------|-----------------------|-------------------|");
		}
	}
}

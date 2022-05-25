package game;

import java.util.Scanner;

public class M3_ProgrammingQuiz_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Asking user to enter no of packages
		System.out.print("Enter Number of Packages: ");
		int packages = sc.nextInt();

		// calculating totalCost ($99 for each package)
		double totalCost = packages * 99;
		double discount = 0;

		// calculating for discount

		// if packages are between 0-9 then there is no discount
		if (packages <= 9) {
			discount = 0;
		}
		// if packages are between 10-19 then 20% discount
		else if (packages <= 19) {
			discount = totalCost * 20 / 100;
		}

		// if packages are between 20-49 then 30% discount
		else if (packages <= 49) {
			discount = totalCost * 30 / 100;
		}

		// if packages are between 50-99 then 40% discount
		else if (packages <= 99) {
			discount = totalCost * 40 / 100;
		}
		//// if packages are more than or equal to 100 then 50% discount
		else {
			discount = totalCost * 50 / 100;
		}

		// calculating final cost
		double finalCost = (totalCost - discount);
		// printing finalcost
		System.out.println("Final Cost: $" + finalCost);
		sc.close();
	}

}

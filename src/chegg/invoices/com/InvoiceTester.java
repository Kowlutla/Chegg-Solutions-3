package chegg.invoices.com;

import java.util.ArrayList;
import java.util.Collections;

//Tester class for Invoice Class
public class InvoiceTester {

	public static void main(String[] args) {

		// ArrayList to store invoice objects
		ArrayList<Invoice> invoices = new ArrayList<>();

		// Add some random invoices objects to invoices list
		invoices.add(new Invoice(100, 200, 12, new Job(337)));
		invoices.add(new Invoice(101, 159, 13, new Job(338)));
		invoices.add(new Invoice(102, 382, 10, new Job(339)));
		invoices.add(new Invoice(103, 123, 9, new Job(340)));
		invoices.add(new Invoice(104, 90, 15, new Job(341)));
		invoices.add(new Invoice(105, 145, 16, new Job(342)));

		System.out.println("\n* * * Invoices Before Sorting * * *\n");
		for (Invoice i : invoices) {
			System.out.println(i);
		}

		// Sort the invoices list in ascending order
		Collections.sort(invoices);

		System.out.println("\n* * * Invoices After Sorting * * *\n");
		for (Invoice i : invoices) {
			System.out.println(i);
		}
	}
}

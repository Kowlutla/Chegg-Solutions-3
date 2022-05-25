import java.util.Scanner;

//test program TestInvoice
public class TestInvoice {

	// main Method
	public static void main(String[] args) {

		// create array of type Invoice and size is 5
		Invoice[] invoices = new Invoice[5];

		// Scanner object to read input from user
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			// taking data for invoice details from user
			System.out.println("Enter Invoice " + (i + 1) + " details: ");
			System.out.print("Enter Invoice Id: ");
			int invid = sc.nextInt();
			System.out.print("Enter Customer Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Customer Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Discount: ");
			double discount = sc.nextDouble();
			System.out.print("Enter Amount: ");
			double amount = sc.nextDouble();

			// Create Invoice Object with provided data
			Invoice invoice = new Invoice(invid, id, name, discount, amount);

			// Store the invoice in invoices array
			invoices[i] = invoice;
			System.out.println();
		}

		// printing invoices details to screen

		System.out.println("= = = = = Invoices Details are = = = = =");
		// for all invoices in array
		for (int i = 0; i < 5; i++) {
			// print each invoice details
			System.out.println(invoices[i]);
		}
		sc.close();
	}
}

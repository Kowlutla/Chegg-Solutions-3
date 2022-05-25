package chegg.invoices.com;

public class Invoice implements Payable {

	// attributes of Invoice
	private int invN;
	private double amount;
	private double taxRate;
	private Job x;

	// Constructor to initialize Invoice variables
	public Invoice(int invN, double amount, double taxRate, Job x) {
		this.invN = invN;
		this.amount = amount;
		this.taxRate = taxRate;
		this.x = x;
	}

	/**
	 * Method to return payment Amount
	 */
	@Override
	public double getPaymentAmount() {
		return amount * taxRate;
	}

	@Override
	/**
	 * CompareTo method
	 */
	public int compareTo(Payable o) {
		// if current object and given object payment are equal
		if (this.getPaymentAmount() == o.getPaymentAmount()) {
			return 0;
		}
		// if current object payment amount is greater than given object payment amount
		else if (this.getPaymentAmount() > o.getPaymentAmount()) {
			return 1;
		}
		// if current object payment amount is lesser than given object payment amount
		else {
			return -1;
		}
	}

	// toString method
	public String toString() {
		return "Invoice Number: " + this.invN + "\tAmount: " + this.getPaymentAmount();
	}
}

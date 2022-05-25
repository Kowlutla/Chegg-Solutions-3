
//a class Invoice
public class Invoice {

	// Three private instance variables
	private int invid;
	private Customer customer;
	private double amount;

	/**
	 * Constructor that with five parameters to set its values to instance variables
	 */

	public Invoice(int invid, int id, String name, double discount, double amount) {
		// create Customer Object with given values
		Customer customer = new Customer(id, name, discount);
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}

	// toString method to return invoice details
	@Override
	public String toString() {
		return this.invid + " " + this.customer + " " + this.amount;
	}
}

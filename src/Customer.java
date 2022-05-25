
public class Customer {

	private int id;
	private String name;
	private double discount;

	public Customer(int id, String name, double discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return id + " " + this.name + " " + discount;

	}
}


//Concrete class Truck that has is-a relation with Car 
public class Trcuk extends Car {

	// private instance variable weight
	private int weight;

	/**
	 * public method getPrice() that overrides super class method getPrice() apply
	 * 10% discount on price if truck weight>2000 otherwise apply 20% on price and
	 * return new price
	 */
	@Override
	public double getPrice() {
		// apply 10% discount on price if truck weight>2000
		if (weight > 2000) {
			return getPrice() - (getPrice() * 10 / 100);
		}
		// otherwise apply 20% on price
		else {
			return getPrice() - (getPrice() * 20 / 100);
		}
	}
}

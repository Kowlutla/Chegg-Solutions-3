package lab_7;

public class BothWays {

	/**
	 * static method create. create takes a single String parameter and returns an
	 * anonymous object that implements the IBothWays interface
	 * 
	 * @param s
	 * @return
	 */
	public static IBothWays create(String s) {

		// If the String passed to create is null, throw an IllegalArgumentException.
		if (s == null)
			throw new IllegalArgumentException();

		// Create Anonymous Class Object
		IBothWays obj = new IBothWays() {

			// implementation for forward method
			@Override
			public String forward() {
				return s;
			}

			// implementation for backward method
			@Override
			public String backward() {
				return new StringBuffer(s).reverse().toString();
			}

		};

		// return the Anonymous class Object
		return obj;
	}
}


public class BillingApplicationDriver {

	public static void main(String[] args) {

		// Create BillingApplication Object to call computeBill() method
		BillingApplication application = new BillingApplication();
		// case 1: powerConsumption<=160
		double powerConsumption = 96;
		System.out.println("Example1: " + application.computeBill(powerConsumption));

		// case 2: 160<powerConsumption<=300
		powerConsumption = 260;
		System.out.println("\nExample2: " + application.computeBill(powerConsumption));

		// case 3: 300<powerConsumption<=500
		powerConsumption = 400;
		System.out.println("\nExample3: " + application.computeBill(powerConsumption));

		// case 4: 500<powerConsumption
		powerConsumption = 680;
		System.out.println("\nExample4: " + application.computeBill(powerConsumption));
	}

}

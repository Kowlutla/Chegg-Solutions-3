package game;

public class Main {

	public static void main(String[] args) {

		// Create IncomeTax Obj by passing income as 60000
		IncomeTax obj = new IncomeTax(60000);
		// calculate and print the income tax
		System.out.println(obj.getIncomeTax());
	}
}

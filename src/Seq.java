
//class Seq
public class Seq {

	// feilds of class Seq
	private int start;
	private int terms;
	private int step;
	private static int matchCount = 3;
	String seq;

	// Constructor 1
	public Seq(int startValue, int numOfTerms, int stepValue) {

		// If all arguements are in valid range
		if (startValue >= 1 && numOfTerms >= 3 && stepValue >= 1) {

			// Assign values
			this.start = startValue;
			this.terms = numOfTerms;
			this.step = stepValue;
			this.seq = new String("");

			// Generate sequence using above values
			int tempTerms = terms;
			int tempStart = start;
			while (tempTerms > 1) {
				seq += tempStart + ",";
				tempStart += step;
				tempTerms--;
			}
			seq += tempStart;
		}
		// If arguements are not in valid range throw Exception
		else {
			throw new IllegalArgumentException("Invalid parameter");
		}
	}

	// Constructor#2
	public Seq(int startValue, int stepValue) {

		// If all arguements are in valid range
		if (startValue >= 1 && stepValue >= 1) {
			this.start = startValue;
			this.terms = 5;// assign no of terms to 5 by default
			this.step = stepValue;
			seq = new String("");

			// Generate sequence using above values
			int tempTerms = terms;
			int tempStart = start;
			while (tempTerms > 1) {
				seq += tempStart + ",";
				tempStart += step;
				tempTerms--;
			}
			seq += tempStart;
		}

		// If arguements are not in valid range throw Exception
		else {
			throw new IllegalArgumentException("Invalid parameter");
		}
	}

	// #Copy Constructor
	public Seq(Seq s) {

		// copy the values of given Object to current Creating Object
		this.start = s.start;
		this.step = s.step;
		this.terms = s.terms;
		this.seq = s.seq;
	}

	// Get method for step
	public int getStep() {
		return this.step;
	}

	// Set method for step
	public void setStep(int stepValue) {
		// if step is not in valid parameter range throw exception
		if (stepValue < 1)
			throw new IllegalArgumentException("Invalid parameter");
		else {
			// assign the step value to step
			this.step = stepValue;
			seq = new String("");
			// Generate the new Sequence using new step value
			int tempTerms = terms;
			int tempStart = start;
			while (tempTerms > 1) {
				seq += tempStart + ",";
				tempStart += step;
				tempTerms--;
			}
			seq += tempStart;
		}
	}

	// Main method for testing(OPTIONAL)
	public static void main(String args[]) {

		// Creating Seq Object with start=5,terms=8,step=10(Common difference)
		Seq s1 = new Seq(5, 8, 10);
		// printing seq of s1
		System.out.println("Before Changing step: " + s1.seq);

		// changing step value using setStep method
		s1.setStep(5);
		// printing seq of s1
		System.out.println("\nAfter Changing step: " + s1.seq);

		// Creating copy Seq Object using copy Construcor
		Seq s2 = new Seq(s1);
		// printing seq of s2
		System.out.println("\nCopy Sequence: " + s2.seq);

		// Creating Seq Object using 2nd Construcor with start=10,step=7 and terms=5 by
		// default
		Seq s3 = new Seq(10, 7);
		// printing seq of s3
		System.out.println("\nSequence with default terms: " + s3.seq);
	}
}

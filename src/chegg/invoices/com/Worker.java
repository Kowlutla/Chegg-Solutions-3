package chegg.invoices.com;

public class Worker extends Person {

	// Variable
	private double mSalary;

	/**
	 * @param mName
	 * @param mSalary
	 */
	public Worker(String mName, double mSalary) {
		super(mName);
		this.mSalary = mSalary;
	}

	/**
	 * Getter method to
	 * 
	 * @return the mSalary
	 */
	public double getmSalary() {
		return mSalary;
	}

	/**
	 * Setter method to
	 * 
	 * @param mSalary the mSalary to set
	 */
	public void setmSalary(double mSalary) {
		this.mSalary = mSalary;
	}

}

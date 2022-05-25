
//Speakers class that implemented Cloneable interface
public class Speakers implements Cloneable {

	// 1.three encapsulated variables
	private String brand;
	private String serialNo;
	private int maxPower;

	// 2.no-arg constructor
	public Speakers() {
		this.brand = "Co A";
		this.serialNo = "113-D14";
		this.maxPower = 15;
	}

	// 3.Constructor that takes three parameters and set values to instance
	// variables
	public Speakers(String brand, String serialNo, int maxPower) {
		this.brand = brand;
		this.serialNo = serialNo;
		this.maxPower = maxPower;
	}

	// 4.Setter and Getter methods for instance variables
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	// 5.Override toString method
	public String toString() {
		return "Speakers [brand=" + brand + ", serialNo=" + serialNo + ", maxPower=" + maxPower + "]";
	}

	// 6.Override equals method
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (maxPower != other.maxPower)
			return false;
		if (serialNo == null) {
			if (other.serialNo != null)
				return false;
		} else if (!serialNo.equals(other.serialNo))
			return false;
		return true;
	}

	// 7.Override hashCode method
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + maxPower;
		result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
		return result;
	}

	// Clone method to deep copy
	public Speakers clone() throws CloneNotSupportedException {
		Speakers s = new Speakers();
		s.setBrand(brand);
		s.setMaxPower(maxPower);
		s.setSerialNo(serialNo);
		return s;
	}
}

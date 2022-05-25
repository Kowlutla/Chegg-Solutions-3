package com.chegg.file;

//Define class Bird which is inherited from Animal
public class Bird extends Animal {

	// Data fields:
	private String classifications;
	private boolean canFly;

	// Constructor, set “animalClass” to “Bird”
	public Bird(String classifications, boolean canFly) {
		super("Bird");
		this.classifications = classifications;
		this.canFly = canFly;
	}

	public Bird(double averageWeight, String classifications, boolean canFly) {
		super("Bird", averageWeight);
		this.classifications = classifications;
		this.canFly = canFly;
	}

	/**
	 * @return the classifications
	 */
	public String getClassifications() {
		return classifications;
	}

	/**
	 * @return the canFly
	 */
	public boolean isCanFly() {
		return canFly;
	}

	/**
	 * @param classifications the classifications to set
	 */
	public void setClassifications(String classifications) {
		this.classifications = classifications;
	}

	/**
	 * @param canFly the canFly to set
	 */
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	// getAnimalClass (): String // override method defined in Animal. Return
	// “Bird”
	@Override
	public String getAnimalClass() {
		return "Bird";
	}

	// getSpecies(): String // override method defined in Animal. Return “Cat”
	public String getSpecies() {
		return "Bird";
	}

	// toString(): String // return information of: classification, specification,
	// class
	public String toString() {
		return this.classifications + "\t\t" + this.getSpecies() + "\t\t" + this.getAnimalClass();
	}

	// equals(ob: Object): boolean // return true if classifications are same
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		if (classifications == null) {
			if (other.classifications != null)
				return false;
		} else if (!classifications.equals(other.classifications))
			return false;
		return true;
	}

}

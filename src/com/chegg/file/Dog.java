package com.chegg.file;

//Define class Dog which is inherited from Animal:
public class Dog extends Animal {

	// Data fields:
	private String breeds;
	private int size;

	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}

	public Dog(double averageWeight) {
		super("Dog", averageWeight);
		// TODO Auto-generated constructor stub
	}

	public Dog(String breeds, int size) {
		super("Dog");
		this.breeds = breeds;
		this.size = size;
	}

	public Dog(double averageWeight, String breeds, int size) {
		super("Dog", averageWeight);
		this.breeds = breeds;
		this.size = size;
	}

	/**
	 * @return the breeds
	 */
	public String getBreeds() {
		return breeds;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param breeds the breeds to set
	 */
	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	// getAnimalClass (): String // override method defined in Animal. Return
	// “Mammal”
	@Override
	public String getAnimalClass() {
		return "Mammal";
	}

	// getSpecies(): String // override method defined in Animal. Return “Dog”
	public String getSpecies() {
		return "Dog";
	}

	// toString(): String // return information of the breeds, size, species, class
	public String toString() {
		return this.breeds + "\t\t" + this.size + "\t\t" + this.getSpecies() + "\t\t" + this.getAnimalClass();
	}

	// equals(ob: Object): boolean // return true if types and size are the same
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (size != other.size)
			return false;
		return true;
	}

}

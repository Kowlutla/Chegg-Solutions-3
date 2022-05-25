package com.chegg.file;

//Define class Cat which is inherited from Animal
public class Cat extends Animal {

	// Data fields:
	private String breeds;

	public Cat() {
		super("Cat");
	}

	// Constructor(s), set “animalClass” to “Cat”
	public Cat(double averageWeight, String breeds) {
		super("Cat", averageWeight);
		this.breeds = breeds;
	}

	/**
	 * @return the breeds
	 */
	public String getBreeds() {
		return breeds;
	}

	/**
	 * @param breeds the breeds to set
	 */
	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}

	// getAnimalClass (): String // override method defined in Animal. Return
	// “Mammal”
	@Override
	public String getAnimalClass() {
		return "Mammal";
	}

	// getSpecies(): String // override method defined in Animal. Return “Cat”
	public String getSpecies() {
		return "Cat";
	}

	/**
	 * toString(): String // return information of the breeds, species, class
	 */
	public String toString() {
		return this.breeds + "\t\t" + this.getSpecies() + "\t\t" + this.getAnimalClass();

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (breeds == null) {
			if (other.breeds != null)
				return false;
		} else if (!breeds.equals(other.breeds))
			return false;
		return true;
	}
}

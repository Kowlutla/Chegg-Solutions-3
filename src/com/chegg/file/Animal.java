package com.chegg.file;

public class Animal {

	// Data fields:
	protected String animalClass;
	protected double averageWeight;

	// Constructor(s)

	public Animal() {
		this.animalClass = "animalClass";
		this.averageWeight = 20;
	}

	public Animal(String animalClass) {
		this.animalClass = animalClass;
		this.averageWeight = 20;

	}

	public Animal(String animalClass, double averageWeight) {
		this.animalClass = animalClass;
		this.averageWeight = averageWeight;
	}

	// Getter methods to get the data
	public double getAverageWeight() {
		return averageWeight;
	}

	// Setter methods to set the data
	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}

	// getAnimalClass(): String // return “Animal” (animalClass name)
	public String getAnimalClass() {
		return "Animal";
	}

	// getSpecies(): String // return “Animal Species” as general species name
	public String getSpecies() {
		return "Animal Species";
	}

	@Override
	public String toString() {
		return animalClass + "\t\t" + averageWeight;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (animalClass == null) {
			if (other.animalClass != null)
				return false;
		} else if (!animalClass.equals(other.animalClass))
			return false;
		if (Double.doubleToLongBits(averageWeight) != Double.doubleToLongBits(other.averageWeight))
			return false;
		return true;
	}
}

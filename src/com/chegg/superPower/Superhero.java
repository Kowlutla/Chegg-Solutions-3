package com.chegg.superPower;

public class Superhero extends Person {

	// instance variables
	private String superHeroName;
	private String superPower;
	private String catchPhrase;
	private static int totalNumberVillainsCaught;

	// Getter methods
	public String getSuperHeroName() {
		return superHeroName;
	}

	public String getSuperPower() {
		return superPower;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public int getTotalNumberVillainsCaught() {
		return totalNumberVillainsCaught;
	}

	// Setter methods
	public void setSuperHeroName(String superHeroName) {
		this.superHeroName = superHeroName;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public void setTotalNumberVillainsCaught(int totalNumberVillainsCaught) {
		Superhero.totalNumberVillainsCaught = totalNumberVillainsCaught;
	}

	/**
	 * speak method
	 */
	public void speak() {
		System.out.println(catchPhrase);
	}

	/**
	 * catchVillian
	 */
	public void catchVillian() {
		totalNumberVillainsCaught++;
	}

	/**
	 * villiansCaught
	 */
	public void villiansCaught() {
		System.out.println("No Of Villians Caught: " + totalNumberVillainsCaught);
	}

	/**
	 * Constructor
	 */
	public Superhero(String name, int age, String favoriteTypeOfFood, String superHeroName, String superPower,
			String catchPhrase) {
		super(name, age, favoriteTypeOfFood);
		this.superHeroName = superHeroName;
		this.superPower = superPower;
		this.catchPhrase = catchPhrase;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return super.toString() + "\tsuperHeroName=" + superHeroName + "\tsuperPower=" + superPower + "\tcatchPhrase="
				+ catchPhrase;
	}
}

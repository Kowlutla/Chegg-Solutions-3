package com.chegg.superPower;

public class Person {

	// instance variables
	private String name;
	private int age;
	private String favoriteTypeOfFood;

	// getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getFavoriteTypeOfFood() {
		return favoriteTypeOfFood;
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFavoriteTypeOfFood(String favoriteTypeOfFood) {
		this.favoriteTypeOfFood = favoriteTypeOfFood;
	}

	/**
	 * Constructor that takes arguement for each variable
	 * 
	 * @param name
	 * @param age
	 * @param favoriteTypeOfFood and initilizes the Person Object
	 */

	public Person(String name, int age, String favoriteTypeOfFood) {
		this.name = name;
		this.age = age;
		this.favoriteTypeOfFood = favoriteTypeOfFood;
	}

	// Copy Constructor
	public Person(Person p) {
		this.name = p.getName();
		this.age = p.getAge();
		this.favoriteTypeOfFood = p.getFavoriteTypeOfFood();
	}

	// equals Method
	public boolean equals(Person other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (age != other.age)
			return false;
		if (favoriteTypeOfFood == null) {
			if (other.favoriteTypeOfFood != null)
				return false;
		} else if (!favoriteTypeOfFood.equals(other.favoriteTypeOfFood))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * toString method that return all of instance variables in one String
	 */
	public String toString() {
		return "name=" + name + "\tage=" + age + "\tfavoriteTypeOfFood=" + favoriteTypeOfFood;
	}
}

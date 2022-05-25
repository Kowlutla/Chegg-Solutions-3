package com.chegg.atoms;

public class Fruit {
	
	//three private variables
	private String name;
	private String color;
	private double price;
	
	//private static data to count no of objects has been created
	private static int count=0;
	
	//no-arguement constructor
	public Fruit() {
		this.name="Apple";
		this.color="red";
		this.price=3;
		count++;
	}

	//Constructor with arguements
	public Fruit(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
		count++;
	}

	/**
	 * getter method for no of objects created
	 * @return the count
	 */
	public static int numberOfFruits() {
		return count;
	}


	/**
	 * Getter method to
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Getter method to
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Getter method to
	 * @return the price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}

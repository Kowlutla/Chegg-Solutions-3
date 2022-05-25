package com.chegg.atoms;

public class College {
// Instance variables
	private String name = "";
	private String city = "";
	private int students = 0;
	private int established = 1900;

	/**
	 * Full constructor sets all four instance variables.
	 * 
	 * @param name     the name of the College
	 * @param city     the city in which the main campus resides
	 * @param students the number of students attending this College
	 * @param year     the year in which the College was established
	 */ // Full constructor
	public College(String name, String city, int students, int established) {
		this.name = name;
		this.city = city;
		this.students = students;
		this.established = established;
	}

	/**
	 * Getter for the name of the College
	 * 
	 * @return the name of the College
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name of the College
	 * 
	 * @param the new name for this College
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Getter for the name of the city in which the main campus is in
	 * 
	 * @return city the name of the city of the main campus
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the students
	 */
	public int getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(int students) {
		this.students = students;
	}

	/**
	 * @return the established
	 */
	public int getEstablished() {
		return established;
	}

	/**
	 * @param established the established to set
	 */
	public void setEstablished(int established) {
		this.established = established;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

}
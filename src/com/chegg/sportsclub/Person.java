package com.chegg.sportsclub;

public class Person {

	protected int id;
	protected String name;
	protected String nationality;
	protected String mobileNo;
	protected Gender gender;


	/**
	 * Constructor that initializes
	 * 
	 * @param id
	 * @param name
	 * @param nationality
	 * @param mobileNo    with given values
	 */
	public Person(int id, String name, String nationality, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.mobileNo = mobileNo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", nationality=" + nationality + ", mobileNo=" + mobileNo + ", gender="
				+ gender;
	}

}

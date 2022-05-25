package com.chegg.sportsclub;

public class Coach extends Person {

	private String speciality;

	/**
	 * @param id
	 * @param name
	 * @param nationality
	 * @param mobileNo
	 * @param speciality
	 */
	public Coach(int id, String name, String nationality, String mobileNo, String speciality) {
		super(id, name, nationality, mobileNo);
		this.speciality = speciality;
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return super.toString() + " , speciality=" + speciality;
	}

}

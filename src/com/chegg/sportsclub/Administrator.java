package com.chegg.sportsclub;

import java.time.LocalDate;

public class Administrator extends Person {
	private LocalDate date;

	/**
	 * @param id
	 * @param name
	 * @param nationality
	 * @param mobileNo
	 * @param date
	 */
	public Administrator(int id, String name, String nationality, String mobileNo, LocalDate date) {
		super(id, name, nationality, mobileNo);
		this.date = date;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return super.toString() + " , " + " date=" + date;
	}
}

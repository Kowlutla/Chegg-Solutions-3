package com.chegg.sportsclub;

public class Player extends Person {

	private Sport sport;
	private int rating;

	/**
	 * @param id
	 * @param name
	 * @param nationality
	 * @param mobileNo
	 * @param sport
	 * @param rating
	 */
	public Player(int id, String name, String nationality, String mobileNo, Sport sport, int rating) {
		super(id, name, nationality, mobileNo);
		this.sport = sport;
		this.rating = rating;
	}

	/**
	 * @return the sport
	 */
	public Sport getSport() {
		return sport;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param sport the sport to set
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return super.toString() + " , sport=" + sport + " , rating=" + rating;
	}

}

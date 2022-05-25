package com.chegg.sportsclub;

public class Sport {

	private String name;
	private String website;

	/**
	 * Default Constructor
	 */
	public Sport() {
		super();
		this.name = "Cricket";
		this.website = "www.cricbuzz.com";
	}

	/**
	 * @param name
	 * @param website
	 */
	public Sport(String name, String website) {
		super();
		this.name = name;
		this.website = website;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "name=" + name + ", website=" + website;
	}

}

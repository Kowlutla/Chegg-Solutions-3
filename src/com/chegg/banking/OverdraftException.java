package com.chegg.banking;

public class OverdraftException extends Exception {

	private double deficit;
	private String memberName;

	public OverdraftException(String message, double deficit) {
		super(message+deficit);
		this.deficit = deficit;
	}

	public double getDeficit() {
		return this.deficit;
	}

}

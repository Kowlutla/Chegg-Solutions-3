package com.chegg.cards;

public class PlayingCard {
	private String suit;
	private int value;

	public PlayingCard() {
		suit = "";
		value = 0;

	}

	public PlayingCard(String aSuit, int aValue) {
		suit = aSuit;
		value = aValue;
	}

	public PlayingCard(int aSuit, int aValue) {
		value = aSuit;
		value = aValue;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public void setSuit(String aSuit) {
		suit = aSuit;
	}

	public void setValue(int aValue) {
		value = aValue;
	}

	public String toString() {
		if (value == 1) {
			return "A of " + suit;
		} else if (value == 11) {
			return "J of " + suit;
		} else if (value == 12) {
			return "Q of " + suit;
		} else if (value == 13) {
			return "K of " + suit;
		} else {
			return value + " of " + suit;
		}

	}

	public boolean equals(PlayingCard aCard) {
		return (this.suit.equals(aCard.suit) && this.value == aCard.value) ? true : false;
	}
}
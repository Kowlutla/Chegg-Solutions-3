package com.chegg.cards;

import java.util.*;

public class CardSet {
	private PlayingCard[] deck;
	private int startCount;
	private Random rand;

	public CardSet(int howMany) {
		deck = new PlayingCard[howMany];
		startCount = howMany;
		Random rand = new Random();

		for (int count = 0; count < deck.length; count++) {

			int val = rand.nextInt(13) + 1;
			int st = rand.nextInt(4) + 1;

			// Create PlayCard Object with random values
			PlayingCard card = new PlayingCard(
					(st == 1) ? "CLUBS" : (st == 2) ? "DIAMONDS" : (st == 3) ? "HEARTS" : "SPADES", val);

			// Check for new created card is present in deck or not
			boolean contain = false;
			// for all available cards in deck
			for (int i = 0; i < count; i++) {
				// check is current card equal to new card mark as contain
				if (deck[i].equals(card)) {
					contain = true;
					break;
				}
			}

			// if deck not contain new card add new card to deck
			if (!contain) {
				deck[count] = card;
			}
			// if contain decrement count to retake values
			else {
				count--;
			}
		}
	}

	public void printSet() {
		System.out.println("\nYour card:");
		for (int i = 0; i < startCount; i++) {

			System.out.println(deck[i]);
		}
	}

	public void bubbleSort() {
		PlayingCard temp = new PlayingCard();
		for (int a = 1; a < deck.length; a++)
			for (int b = deck.length - 1; b >= a; b--) {
				if (deck[b - 1].getValue() > (deck[b].getValue())) {
					temp = deck[b - 1];
					deck[b - 1] = deck[b];
					deck[b] = temp;
				}
			}
	}
}
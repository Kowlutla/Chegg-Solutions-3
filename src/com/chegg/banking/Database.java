package com.chegg.banking;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> itemsList;

	public Database() {
		this.itemsList = new ArrayList<Item>();
	}
 
	public void addItem(Item item) {
		itemsList.add(item);
	}

	public void printItems() {

		for (Item item : itemsList) {
			System.out.println(item);
		}
	}

	public int noOfItems() {
		return itemsList.size();
	}

	public int noOfMusicItems() {
		int count = 0;

		for (Item i : itemsList) {
			if (i instanceof Music) {
				count++;
			}
		}
		return count;
	}

	public int noOfVideoItems() {
		int count = 0;

		for (Item i : itemsList) {
			if (i instanceof Video) {
				count++;
			}
		}
		return count;
	}

	public int notVideoAndNotMusic() {
		int count = 0;

		for (Item i : itemsList) {
			if (!(i instanceof Video) && !(i instanceof Music)) {
				count++;
			}
		}
		return count;
	}
}

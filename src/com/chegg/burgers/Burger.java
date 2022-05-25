package com.chegg.burgers;
/**
 * Define an abstract superclass named Burger which represents burgers
 */
public abstract class Burger {

	/**
	 * An abstract method named addToppings() which prints the toppings to a burger.
	 */
	public abstract void addToppings();

	/**
	 * A final method named make() which contains the method to make a burger.
	 */
	public final void make() {
		layBread();
		spreadSauce();
		addLettuce();
		addToppings();
	}

	/**
	 * A public method named layBread() which prints "lay bread"
	 */
	public void layBread() {
		System.out.println("lay bread");
	}

	/**
	 * A public method named spreadSauce() which prints "spread sauce"
	 */
	public void spreadSauce() {
		System.out.println("spread sauce");
	}

	/**
	 * A public method named addLettuce() which prints "add lettuce"
	 */
	public void addLettuce() {
		System.out.println("add lettuce");
	}
}

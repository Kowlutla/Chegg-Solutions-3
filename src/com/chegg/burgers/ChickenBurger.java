package com.chegg.burgers;

class ChickenBurger extends Burger {

	public void layBread() {
		System.out.println("lay bread");
	}

	public void spreadSauce() {
		System.out.println("spread Sauce");
	}

	public void addLettuce() {
		System.out.println("add lettuce");
	}

	public void addChicken() {
		System.out.println("add chicken");
	}

	@Override
	public void addToppings() {
		addChicken();
	}
}
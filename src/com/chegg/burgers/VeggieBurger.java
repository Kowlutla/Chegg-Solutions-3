package com.chegg.burgers;

class VeggieBurger extends Burger {

	public void layBread() {
		System.out.println("lay bread");
	}

	public void spreadSauce() {
		System.out.println("spread Sauce");
	}

	public void addLettuce() {
		System.out.println("add lettuce");
	}

	public void addVeggie() {
		System.out.println("add Veggie");
	}

	@Override
	public void addToppings() {
		addVeggie();
	}
}
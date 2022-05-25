package com.chegg.superPower;

public class SuperheroDemo {

	public static void main(String[] args) {

		// Create two person Objects
		Person p1 = new Person("kowlutla", 21, "Indian");
		Person p2 = new Person("kowlutla", 21, "Indian");
		// printing two persons
		System.out.println(p1);
		System.out.println(p2);

		// Checking two person objects are equal or not
		System.out.println("Is Two Persons are Equal: " + p1.equals(p2));

		System.out.println();
		// Creating Superhero Objects
		Superhero s1 = new Superhero("kowlutla", 21, "indian", "superhero1", "superPower1", "I love to fly");
		Superhero s2 = new Superhero("Sudeepthi", 20, "Chinees", "superhero2", "superPower2", "I love to code");
		System.out.println(s1);
		System.out.println(s2);

		// calling catchVillians for two times using two object
		s1.catchVillian();
		s2.catchVillian();
		// printing no of villians caught
		s1.villiansCaught();

		// Checking two Superhero objects are equal or not
		System.out.println("Is Two Superheros are Equal: " + s1.equals(s2));

		System.out.print("Speak Of Superhero1: ");
		s1.speak();
	}
}

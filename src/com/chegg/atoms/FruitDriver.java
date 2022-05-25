package com.chegg.atoms;

import java.util.Scanner;

public class FruitDriver {

	public static void main(String[] args) {

		// Create Fruit object using no-arg construcor
		Fruit fruit1 = new Fruit();

		// printing details of fruit1
		System.out.println("Default fruit name: " + fruit1.getName());
		System.out.println("Default fruit color: " + fruit1.getColor());
		System.out.println("Default fruit price$/1b: " + fruit1.getPrice());

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		//take the data from user 
		System.out.print("Enter fruit name: ");
		String name = sc.nextLine();
		System.out.print("Enter fruit color: ");
		String color = sc.nextLine();
		System.out.print("Enter fruit price$/1b: ");
		double price = sc.nextDouble();

		//Create Fruit Object with user provided data
		Fruit fruit2 = new Fruit(name, color, price);

		System.out.println();
		
		// printing details of fruit2
		System.out.println("fruit name: " + fruit2.getName());
		System.out.println("fruit color: " + fruit2.getColor());
		System.out.println("fruit price$/1b: " + fruit2.getPrice());

		System.out.println();

		System.out.println("Total number of fruits: " + Fruit.numberOfFruits());
		sc.close();
	}

}

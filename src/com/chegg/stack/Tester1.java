package com.chegg.stack;

import java.util.Scanner;

public class Tester1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// asking user to enter word
		System.out.print("Enter Word: ");
		String word = sc.nextLine();

		// create stack with size of word
		Stack stack = new Stack(word.length());

		// push the all characters of word into stack
		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}

		// print the all contents of stack which is reverse of word
		System.out.println("Reverse Of Word: ");
		while (!stack.isEmpty()) {
			System.out.print(stack.peek());
			stack.pop();
		}
		sc.close();
	}

}

package com.chegg.stack;

import java.util.Scanner;

public class Tester2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// creating two stacks to store even and odd numbers
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		int input;
		while (true) {
			// ask user to enter input
			System.out.print("Enter input: ");
			input = sc.nextInt();
			if (input == -1)
				break;

			// if input is even
			if (input % 2 == 0) {
				// push into stack1
				stack1.push(input);
			}
			// if input is odd
			else {
				// push into stack2
				stack2.push(input);
			}
		}
		// do above process until user enter -1 to stop

		// printing even numbers in reverse order (stack1 contents)
		System.out.println("Even Numbers: ");
		while (!stack1.isEmpty()) {
			System.out.print(stack1.peek() + " ");
			stack1.pop();
		}
		System.out.println();
		// printing odd numbers in reverse order (stack2 contents)
		System.out.println("Odd Numbers: ");
		while (!stack2.isEmpty()) {
			System.out.print(stack2.peek() + " ");
			stack2.pop();
		}
		System.out.println();
		sc.close();
	}

}

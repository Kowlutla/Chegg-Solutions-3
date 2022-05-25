import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReArrange {

	public static void main(String[] args) {

		// creating stack
		Stack<Integer> stack = new Stack<>();
		// adding elements into stack
		stack.push(11);
		stack.push(8);
		stack.push(5);
		stack.push(10);
		stack.push(7);

		// printing stack items bofore calling method
		System.out.println("Before calling method: " + stack);
		// calling rearrange method
		rearrange(stack);

		// printing stack items after calling method
		System.out.println("After calling method: " + stack);
	}

	/**
	 * Method that takes
	 * 
	 * @param stack and rearrange the items of stack such that all primes are above
	 *              the non primes
	 */
	public static void rearrange(Stack<Integer> stack) {
		// create Queue
		Queue<Integer> q = new LinkedList<>();

		// add all stack elements to queue by removing from stack
		while (!stack.isEmpty()) {
			q.add(stack.pop());
		}

		// get number of elements in queue
		int noOfElements = q.size();

		// perform noOfElements times
		while (noOfElements-- > 0) {
			// get the current item from queue
			int item = q.remove();

			// if current item is prime add it back to queue
			if (isPrime(item)) {
				q.add(item);
			}
			// if current item is not prime then push item into stack
			else {
				stack.push(item);
			}
		}

		// remove the all elements from queue and push into stack
		while (!q.isEmpty()) {
			stack.push(q.remove());
		}
	}

	// Utility method to check a number is prime or not
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}

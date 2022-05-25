import java.util.Arrays;

public class Test{

	public static void main(String[] args) {

		ArrayStack<Integer>stack=new ArrayStack<Integer>(10);
		stack.push(10);
		stack.push(20);
		
		ArrayStack<Integer>stack1=stack.clone();
		stack1.push(40);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.size());
		stack1.push(100);
		System.out.println(stack1.pop());
	}

}

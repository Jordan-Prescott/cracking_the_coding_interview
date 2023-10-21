package sandbox;

import java.util.Stack;

public class stacks {

	/**
	 * 
	 * Stacks follow a LIFO sequence meaning the item Last In is the First Out.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();	
		
		stack.push("Mark");
		stack.push("Jez");
		stack.push("Superhans");
		stack.push("Sophie");
		
		System.out.println(stack);

		// Remove top element
		stack.pop();
		System.out.println(stack);
		
		// Look at the top element without removing it
		System.out.println(stack.peek());
		
		// Returns the number of places from top
		System.out.println(stack.search("Jez"));
		
		// Check if stack is empty
		System.out.println(stack.isEmpty());
		
		// Check if stack is empty
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		
		
	}

}

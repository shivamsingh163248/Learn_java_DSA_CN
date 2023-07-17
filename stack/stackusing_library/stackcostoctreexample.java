package stackusing_library;

import java.util.Stack;

public class stackcostoctreexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now crating the stack class 
		Stack<Integer>stack = new Stack<>();
		// now push the element 
		stack.push(20) ; 
		stack.push(30);
		System.out.println(stack.size()); 
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		// some basic function of the stack 
		

	}

}

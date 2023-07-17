package stackusing_library;

import java.util.Stack;

public class stacklibaryexaple_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the stack 
		Stack<Integer>stack = new Stack<>();
		
		// now creating the arry 
		int[]arr = {2,3,45,5,6,7,9,1} ; 
		
		
		// now push the elemen using the for each loop 
		for (int i : arr) {
			stack.push(i) ; 
		}

		// now printing the element using the for each loop 
		for (int i : arr) {
			System.out.println(stack.pop());
		}
		
		// now printing the size of the stack 
		System.out.println(stack.size() + " size");
		
	}

}

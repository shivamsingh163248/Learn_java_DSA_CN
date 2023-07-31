package queueUsingStack;

import java.util.Stack;

import stackusing_library.stackcostoctreexample;

public class queueUsingStack <T> {
	
	// creating the stack the of the program 
	
	
	Stack<T> new1 ; 
	Stack<T> new2 ; 
	
	// now we are the creating the constocter 
	
	public queueUsingStack() {
		// TODO Auto-generated constructor stub
		new1 = new Stack<>();
		new2 = new Stack<>();
	}
	
	
	
	// crreating the inque function 
	 public void inque (T ele) {
		 
		 // creating the add method through the object 
		 new1.add(ele) ; 
		 
	 }
	 
	 // now creating the deque function 
	 
	 public T dique () {
		 
		// now creating the loop when stack is wmpty 
		 
		 while (!new1.isEmpty()) {
			
			 // copy all the element of the stack new1 to switch ti new2 
			 T temp = new1.pop() ; 
			 // PEST ALL THE ELEMTN IN THE NEW STACK 
			 new2.push(temp) ; 
			 
		}
		 
		 // remove the itme of the peek 
		 T result = new2.peek();
		 
		 // again we are the reversing copying in the frist stack 
		 
		 // creating the while loop for the copy of the element 
		 
		 while (!new2.isEmpty()) {
			
			 // again creating the variable for the reversing copying the element 
			 T tmep = new2.pop();
			 // push in the frist stack agian 
			 new1.push(tmep) ; 
		}
		 
		// now the return element is 
		 return result ; 
	 }

}

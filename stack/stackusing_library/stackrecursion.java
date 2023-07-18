package stackusing_library;

import java.util.Stack;

public class stackrecursion {
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here

	
         if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int top=input.pop();
        reverseStack(input,extra);
        
        while(!input.isEmpty())
        {
            extra.push(input.pop());
        }
        input.push(top);
        
        while(!extra.isEmpty())
        {
            input.push(extra.pop());
        }
	} 

	
	
	// now creating the print fucntion 
	public static void print(Stack<Integer>shivam ) {
		
		// using the for loop for the printing the stack \
		
		System.out.println();
		for (int i = 0; i < shivam.size(); i++) {
			System.out.print(shivam.pop());
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now creating the array for the pushing 
		Stack<Integer>shivam = new Stack<>();
		
	 // creating the aray 
		int[]arr = {2,3,4,5,6} ; 
		
		// now push the element 
		for (int i : arr) {
			shivam.push(i);
		}
		
//		// now creating agai for loop 
////		for (int i = 0; i < arr.length; i++) {
////			shivam.push(arr[i]);
////		}
//		
//		
//		// now check the top of the 
//		System.out.println(shivam.peek());
//		
//		// now calling the function 
//		
//		// again creating the blank object 
		Stack<Integer>itisha = new Stack<>();
//		
//		// now printing the size of the stack 
//		System.out.println(shivam.size());
//		System.out.println(itisha.size());
//		
//		print(shivam);
//		
		 reverseStack(shivam, itisha);
		 
//		 // now check the size of the itisha 
//		 System.out.println(itisha.size());
//		 
//		 
//		 print(shivam);

	}

}

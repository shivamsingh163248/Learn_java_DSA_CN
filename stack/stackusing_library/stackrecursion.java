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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

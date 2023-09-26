package BST_CHECK_BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class input_print_checkbst_function {
	
	// creating the function for the taking the input and from the user and then 
	// creating the print function 
	// creating the check binary tree are the binary search tree or not 
	
	public BinnaryTreeNode<Integer> takeinput_levelwise(){
		
		// now creating the scanner function for the takeing the input form the user 
		
		Scanner input  = new Scanner(System.in) ; 
		// now creating the display 
		System.out.println("enter root element ");
		int rootelement = input.nextInt() ; 
		
		
		
	// creating the condtion 
		if (rootelement != -1 ) {
			BinnaryTreeNode<Integer>root = new BinnaryTreeNode<Integer>(rootelement)  ; 
			
			// now creating the linklist using the stack 
			
			// creating the queu for the the taking the input each element in the queue
			Queue<BinnaryTreeNode<Integer>> pendingElement = new LinkedList<BinnaryTreeNode<Integer>>() ;
			
			// after the add object in the queue so add the element 
			pendingElement.add(root) ; 
			
			
			// now creating the loop for the taking the element again and again 
			
			// creating the while loop 
			while (!pendingElement.isEmpty()) {
				
				// creating the poll element 
				// creating the object of the node 
				BinnaryTreeNode<Integer>front = pendingElement.poll() ; 
				// taking the user input for the left element 
				System.out.println("enter the left element "+front.data);
				// using the scanner function for taking the input from the user 
				int leftElement = input.nextInt() ; 
				
				// creating the condition for the left node 
				if (leftElement != -1) {
					// if left element not into -1 the then this condtition run 
					// creating the NODE TAKING THE INPUT 
					BinnaryTreeNode<Integer>leftNode = new BinnaryTreeNode<Integer>(leftElement) ; 
					 
					
					// now creating the connection 
					front.leftnode = leftNode ; 
					
					// now adding the in the queue 
					pendingElement.add(leftNode) ;
					
				}
				
				//
				
				
				
			}
			
			
			
		}
		
		
		
	}

}

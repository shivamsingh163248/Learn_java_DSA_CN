package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class searchelemrntinBST {
	
	// CREATING THE three function 
	// level wise input 
	// level wise output 
	// banary searach tree 
	
	// creating the function for the take input level wise 
	public BinnarySearchTreeNode<Integer> takeinput_levelwise(){
		
		// creating the simple function using the queue 
		 // write the function of the takeinput lavelwise
		
		Scanner input = new Scanner(System.in) ; 
		
		// creating the display for the user for the 
		System.out.println("enter the root = ");
		// now take the input in the variable 
		int rootData = input.nextInt();
		
		
		
		// now creating the condition if the user input -1 then 
		if (root == -1) {
			return null ; 
		}
		
		// now creating the node for the root data creating the node fot the storing the input in the value 
		 
		BinnarySearchTreeNode<Integer>node_root = new BinnarySearchTreeNode<Integer>(rootData) ; 
		
		// creating the  queue using the linklist 
	Queue<BinnarySearchTreeNode<Integer>> pendingelement = new LinkedList<BinnarySearchTreeNode<Integer>>() ; 
	
	    // creating the add refrence of the node 
	pendingelement.add(node_root);
	
	// creating the condtion of the loop 
	
	while (!pendingelement.isEmpty()) {
		 
		//now storing data from the poll 
		BinnarySearchTreeNode<Integer>front = pendingelement.poll();
		// mow take the input from the 
		System.out.println("enter the left node : "+front.data);
		int leftnode = input.nextInt() ; 
		
		
		// now check the condtion og the lft node id the empty or not 
		
		if (leftnode != -1 ) {
			
			// now pushing the element of the node 
			// now creating the new node 
			
		}
		
		
		
	}
		
	}

}

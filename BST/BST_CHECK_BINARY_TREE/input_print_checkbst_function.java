package BST_CHECK_BINARY_TREE;

import java.awt.image.AreaAveragingScaleFilter;
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
		if (rootelement == -1 ) {
			
			return null ; 
		}
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
				
				// creating the user disply for the right node 
				System.out.println("enter the right node"+front.data);
				// now taking the input 
				int rightnodeData = input.nextInt() ; 
				
				// now check the element it is the -1 or not 
				if (rightnodeData != -1) {
					// creating the nod for the right node 
					BinnaryTreeNode<Integer>rightnode = new BinnaryTreeNode<Integer>(rightnodeData) ; 
					
					// now creating the conndection 
					front.rightnode = rightnode ; 
					// and the add 
					pendingElement.add(rightnode) ; 
					
				}
				
				
				
			}
			
			return root ; 
			
			
	}
	
	
	
	// creating the new function for the printing element 
	public void printBST(BinnaryTreeNode<Integer>root) {
		
		// now creating the base condition 
		if (root == null) {
			return ; 
		}
		
		// printing the root left and right node 
		//printing root node and left and wirint node 
		System.out.println("root node"+root.data);
		
		if (root.leftnode != null) {
			System.out.println("left :"+root.leftnode.data);
		}
		if (root.rightnode != null) {
			System.out.println("right :"+root.rightnode.data);
			
			
		}
		
		System.out.println();
		
		
		// now calling the left side and right side of the node 
		printBST(root.leftnode);
		printBST(root.rightnode);
		
		
		
		
	}
	

}

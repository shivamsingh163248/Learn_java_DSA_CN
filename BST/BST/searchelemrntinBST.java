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
		if (rootData == -1) {
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
		int leftnodedata = input.nextInt() ; 
		
		
		// now check the condtion og the lft node id the empty or not 
		
		if (leftnodedata != -1 ) {
			
			// now pushing the element of the node 
			// now creating the new node 
			BinnarySearchTreeNode<Integer>leftnode = new BinnarySearchTreeNode<Integer>(leftnodedata);
			
			// now creating 
			front.leftnode = leftnode ; 
			// now add the adress of the node in the queue 
		   pendingelement.add(leftnode) ; 	
		}
		
		// now enter the right node in the node for the enter the value 
		System.out.println("enter the right node "+front.data);
		// now take input from the user 
		 int rightnodedata = input.nextInt() ; 
		 
		 // now check the the condtion of the node it is the -1 or not 
		 if (rightnodedata != -1 ) {
			
			 // now creating the rigt node for the store the value 
			 BinnarySearchTreeNode<Integer>rigtnode = new BinnarySearchTreeNode<Integer>(rightnodedata) ; 
			 
			 // now creating the linking the process in the link list 
			 front.rightnode  = rigtnode ; 
			 // this node also add in the pending element 
			 pendingelement.add(rigtnode);
		}
		
		
		
	}
	
	return node_root ; 
		
	}
	
	// now creating the Bst search function 
	
	
	public boolean seachElementBST (BinnarySearchTreeNode<Integer>root , int k ) {
		
		// creating the base condition 
		if (root == null) {
			return false ; 
		}
		
		// creating the condition where match the data from the input 
		
		if (root.data == k) {
			return true ; 
		}
		
		// creating the condtion for the left and right node because this is the binary search tree 
		if (root.data < k) {
			// now calling the the left node because data are the big so calling the the left node 
			// using the property of the bst 
			// calling the left node for the seaching the element 
			 return seachElementBST(root.rightnode, k);
		}
		
		// again using the reverse node  
	
			// calling the left side node for the left node are the shorter then  root data \
			 return seachElementBST(root.leftnode, k) ; 
			
		
		
		
		
		
		
		
	}
			
			
			

}

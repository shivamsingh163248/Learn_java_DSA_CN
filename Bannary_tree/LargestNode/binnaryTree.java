package LargestNode;

import FindNumberNodeBinaryTree.BinnaryTreeNode;

public class binnaryTree {
	
	// creating the function of the number of the node 
	// creating the function of the sum of the data 

	// creating function of the largest node 
	public static int numberNode (BinnaryTreeNode<Integer>root) {
		
		// now creating the base condtiton 
		if (root == null ) {
			return 0 ; 
		}

		// now creating the function 
		// calling the dunction 
		int leftnode = numberNode(root.leftNode);
		// agian creaing for the right 
		int rightnode = numberNode(root.RightNode);
		
		// now return 
		return 1+ leftnode+rightnode ; 
		
	}
	
	
	// mow creating the sum of the deta function 
	
	public static int sumNode(BinnaryTreeNode<Integer>root) {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}

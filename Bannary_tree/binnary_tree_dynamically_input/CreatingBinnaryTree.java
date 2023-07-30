package binnary_tree_dynamically_input;

import bannary_tree.BinnaryTreeNode;

public class CreatingBinnaryTree {
	
	// now creating the print static fucntion 
	public static void BinaryTreePrint(BinaryTreeNode<Integer>root) {
		
		// NOW CREATING the print fuction 
		// if root is the null then its have no value 
		
		if (root == null ) {
			// now we will directly return the function 
			return ; 
			
		}
		
		// creating the print statement 
		
		System.out.print(root.deta + ":");
		// now creating the condition 
		if (root.LeftNode != null ) {
			// now print the statement 
			System.out.print(" L - "+ root.LeftNode.deta+" , ");
		}
		
		// again creating the right node of the deta 
		
		// creating agian condition staement 
		if (root.RightNode != null ) {
			// now print the statement 
			
			System.out.print("R - " + root.RightNode.deta + " , ");
		}
		
		System.out.println();
		
		
		// now calling the recursion function for the 
		BinaryTreePrint(root.LeftNode);
		// again calling for the right node 
		BinaryTreePrint(root.RightNode);
		
		// now again creating the value 
	// 	System.out.println();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// now creating the binary tree  
		
		// now creating the object 
		
		BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(1) ; 
		
		// now creating the left node and right node 
		BinaryTreeNode<Integer>LeftNode = new BinaryTreeNode<Integer>(2) ; 
		BinaryTreeNode<Integer>RightNode = new BinaryTreeNode<Integer>(3) ; 
		
		
		
		BinaryTreeNode<Integer>LeftnodeleftChild = new BinaryTreeNode<Integer>(4) ; 
		BinaryTreeNode<Integer>leftNodeRightChild = new BinaryTreeNode<Integer>(5) ; 
		
		
		BinaryTreeNode<Integer>RightNodeLeftChild = new BinaryTreeNode<Integer>(6) ; 
		BinaryTreeNode<Integer>RightnodeRightChild= new BinaryTreeNode<Integer>(7) ; 
		
		
		
		// now creating the connection 
		root.LeftNode = LeftNode ; 
		root.RightNode = RightNode  ; 
		
		
		
		// now linking the leftnoe 
		
		LeftNode.LeftNode = LeftnodeleftChild ; 
		LeftNode.RightNode = leftNodeRightChild ; 
		
		// again creating the linking process 
		
		RightNode.LeftNode = RightNodeLeftChild ; 
		RightNode.RightNode = RightnodeRightChild ; 
		
		
		
		// now calling the printng function 
		BinaryTreePrint(root);
		
	 
		

	}

}

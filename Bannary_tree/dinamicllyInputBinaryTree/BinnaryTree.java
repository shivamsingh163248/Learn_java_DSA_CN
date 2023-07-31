package dinamicllyInputBinaryTree;

import java.util.Scanner;

public class BinnaryTree {
	
	// creating the print function 
	
	public static void BinaryTreePrint( BinaryTreeNode<Integer>root) {
		
		// now writing the base condition 
		if (root == null ) {
			return  ; 
		}
		
		// now creating the print function 
		
		System.out.print(root.Data + " : ");
		// now creating the printing the left node and right node 
		
		if (root.LeftNode != null ) {
			// fallow the printing step 
			System.out.print("L : "+root.LeftNode.Data + " , " );
		}
		
		// AGAIN Ccreating the next right condtion 
		if (root.RighNode != null ) {
			System.out.println("R : "+root.RighNode.Data + " , ");
		}
		System.out.println();
		
		// now calling the function 
		
	BinaryTreePrint(root.LeftNode);
	// again we are the calling for the second node 
	BinaryTreePrint(root.RighNode);
	
		
	}
	
	public static BinaryTreeNode<Integer> takebinary(){
		
		
		//  take input form 
		
		// printing the term  
		System.out.println("enter the root : ");
		// creating the scanner function 
		Scanner input = new Scanner(System.in);
		// creating the input  
		int rootdata  = input.nextInt() ; 
		
		// creating the condition of the -1 
		if (rootdata == -1) {
			return null ; 
		}
		
		// now creating the node 
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata) ; 
		
		// creating new refrence 
		BinaryTreeNode<Integer> left = takebinary(); 
		BinaryTreeNode<Integer> Right = takebinary() ; 
		
		
		
		// now linking process for mte root 
		
		root.LeftNode = left ; 
		root.RighNode = Right ; 
		
		// now return the 
		return root ; 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now we are the calling the function 
		BinaryTreeNode<Integer> shivam = takebinary() ; 
		
		// now calling the print function 
		BinaryTreePrint(shivam);
		

	}

}

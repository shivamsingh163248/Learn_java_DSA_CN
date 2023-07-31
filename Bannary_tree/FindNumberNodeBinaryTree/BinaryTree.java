package FindNumberNodeBinaryTree;

import java.util.Scanner;



public class BinaryTree {
	
	
	 
	
	public  BinnaryTreeNode<Integer>BinaryTreeInput (){
		// now creating the some basic codtion 
		// print something for the display for the user 
		System.out.println("enter root : ");
		// creating the object of the scanner 
		Scanner input = new Scanner(System.in) ; 
		
		// now taking the input inthe integer form 
		int rootDeta  = input.nextInt() ; 
		// now creating the object of the node mean creating the parent node 
		
		// now writing the base cindition 
		if (rootDeta == -1 ) {
			return null ; 
		}
		
		
		
		BinnaryTreeNode<Integer>root = new BinnaryTreeNode<Integer>(rootDeta) ; 
		
		// now again creting the two refrencre 
		BinnaryTreeNode<Integer>leftnode = BinaryTreeInput() ; 
		// now again creating the different refreance like right node 
		BinnaryTreeNode<Integer>RightNode = BinaryTreeInput() ; 
		
		
		// now crating the linking process 
		
		root.leftNode  = leftnode ; 
		root.RightNode = RightNode ; 
		
		// now we are return the root node that is parent node of the left and right child 
		return root ; 
		
		
		
		
		
	}
	
	// now creating the fucntion of the printing 
	
	public  void printBinaryTree (BinnaryTreeNode<Integer>root) {
		
		// fist wea are crating the base condtion 
		
		if (root == null ) {
			return  ; 
		}
		
		
		// after the creating the base condtion 
		// we are printng the root deta 
		System.out.print(root.data +" : ");
		
		// now creating the some condition for the 
		if (root.leftNode != null ) {
		System.out.print(" L : "+ root.leftNode.data +" , ");	
		}
		// again creating the second condition for the 
		if (root.RightNode != null ) {
			System.out.print(" R "+ root.RightNode.data+" , ");
		}
		
		System.out.println();
		
		
		// NOW calling the function  
		printBinaryTree(root.leftNode);
		// again calling the funcion for the right node 
		printBinaryTree(root.RightNode);
		
	}

	
	// now creating the new function for the taking taking input isly 
	
	public  BinnaryTreeNode<Integer> takeinputBinaryTree( boolean isRoot , int parent , boolean isLeft){
		
		// we are the using the two boolean function 
		
		if (isRoot) {
			// now printing the simple user display 
			System.out.println("Ener the root : ");
		}else if (isLeft) {
			System.out.println("Enter left node "+ parent);
		}else {
			System.out.println("Enter Right node "+ parent);
		}
		
		
		
		// now creating the scanner function 
		
		Scanner input = new Scanner(System.in) ; 
		// now taking user for the input 
		int rootdeta = input.nextInt();
		
		// now creating the condition 
		if (rootdeta == -1) {
			return null ; 
		}
		
		// now creating the object 
		
		BinnaryTreeNode<Integer>root = new BinnaryTreeNode<Integer>(rootdeta) ; 
		
		// now calling the function  nad creating the refrence 
		
		BinnaryTreeNode<Integer>LeftNode = takeinputBinaryTree(false, rootdeta, true) ;
		// now creating the refrence for the right node 
		BinnaryTreeNode<Integer>RightNode = takeinputBinaryTree(false, rootdeta, false);
		
		// now creating the the linking process 
		
		root.leftNode = LeftNode ; 
		root.RightNode = RightNode ; 
		
		
		// now return the function 
		return root ; 
		
	
		
	
		
		
		
	}
	

}

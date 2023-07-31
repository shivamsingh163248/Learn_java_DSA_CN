package dyacmacllyTakingInput;

import java.util.Scanner;

public class BinaryTree {
	
	// lets creating the input function 
	
	public static BinnaryTreeNode<Integer>BinaryTreeInput (){
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
	
	public static void printBinaryTree (BinnaryTreeNode<Integer>root) {
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinnaryTreeNode<Integer>shivam = BinaryTreeInput() ; 
		// calling FOR THE PRINTG 
		printBinaryTree(shivam);

	}

}

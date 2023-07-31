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
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

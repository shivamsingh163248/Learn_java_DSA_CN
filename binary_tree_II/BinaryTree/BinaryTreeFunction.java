package BinaryTree;

import java.util.Scanner;

import bannary_tree.BinnaryTreeNode;
import stack_using_linklist.nullPointer;

public class BinaryTreeFunction {
	
	// creating the function of the taking the input 
	
	public BinaryTreeNode<Integer>TakeInput(boolean isRoot , int parent , boolean isLeft){
		
		// creating the print function 
		// creating the print function 
	if (isRoot) {
		System.out.println("enter the root : - ");
	}else if (isLeft) {
		System.out.println("enter the Left node of "+parent);
	}else {
		System.out.println("enter the Right Node of "+parent);
	}
	
	// now creating the condtion 
	// creating the scanner
	Scanner input = new Scanner(System.in) ; 
	
	// now taking the input 
	int rootDeta = input.nextInt();
	
	// now creating the condition 
	if (rootDeta == -1) {
		return null; 
	}
	
	
	// now now calling the function 
	
	BinaryTreeNode<Integer>root = new BinaryTreeNode<Integer>(rootDeta) ; 
	
	// now calling the node 
	
	// now calling the left and right node 
	BinaryTreeNode<Integer>leftNode = TakeInput(false, rootDeta, true);
	// now calling the for the right node 
	BinaryTreeNode<Integer>RightNode = TakeInput(false, rootDeta, false);
	
	
	// now  linking process 
	
	root.LeftNode = leftNode ; 
	root.RightNode = RightNode ; 
	
	// now return function 
	
	return root ; 
	
	
	
	}
	
	// now creating the function of the oputput 
	public void PrintBinaryTree(BinaryTreeNode<Integer>root) {
		
		// now creating the base function 
		if (root == null) {
		 return  ; 
		}
		
		// now print function 
		
	// calling the function 
		System.out.print(root.data+" : ");
		
		if (root.LeftNode != null) {
			System.out.print("L : "+ root.LeftNode.data +" , ");
		}
		if (root.RightNode != null) {
			System.out.print("R : "+ root.RightNode.data + " , ");
		}
		
		System.out.println();
		
		PrintBinaryTree(root.LeftNode);
		PrintBinaryTree(root.RightNode);
		
	}
	
	
	// now creating the function of the size of the node 
	
	public int deftNode(BinaryTreeNode<Integer>root) {
		// creating the base condtion 
		if (root == null) {
			return 0 ; 
		}
		
		int left = deftNode(root.LeftNode) ; 
		int right = deftNode(root.RightNode) ; 
		
		// now size 
		if (left > right) {
		   return left +1  ; 	
		}else {
			return right+1 ; 
		}
		
		
		
	}
	
	
	// again creatig the total number of the node 
	

}

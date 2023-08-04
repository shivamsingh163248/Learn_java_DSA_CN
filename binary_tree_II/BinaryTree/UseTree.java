package BinaryTree;

import java.util.Scanner;

public class UseTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the object of these calss 
		BinaryTreeFunction shivam = new BinaryTreeFunction() ; 
		
		// now taking the input 
		//so frist creatiang the refrence of the node 
		BinaryTreeNode<Integer>rootnode = shivam.TakeInput(true, 0, false);
		// now printing the function of these node 
		shivam.PrintBinaryTree(rootnode);
		// now printing the deft 
		System.out.println("deft of the node ");
		System.out.println(shivam.deftNode(rootnode));
	
		System.out.println("total node");
		System.out.println(shivam.totalNode(rootnode));
		System.out.println("total leaf node ");
		System.out.println(shivam.totalLeafNode(rootnode));
		System.out.println("print node at the k ");
		Scanner  input = new Scanner(System.in) ; 
		int s = input.nextInt() ;
		shivam.printATk(rootnode, s);
	

	}

}

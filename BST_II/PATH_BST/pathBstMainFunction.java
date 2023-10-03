package PATH_BST;

import java.util.ArrayList;
import java.util.Scanner;

public class pathBstMainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object of the funcrtion 
		PathOfBst function = new PathOfBst() ; 
		
		BinaryTreeNode<Integer>root =  function.TakingInputBST() ; 
		// now calling the function 
		// enter the number 
		Scanner input = new Scanner(System.in) ; 
		System.out.println();
		System.out.println("enter the number you want to find path ");
		int node = input.nextInt() ; 
		
		// now callin the function  
		ArrayList<Integer>array =  function.BstPath(root, node) ;
		// now again calling for the printing 
		function.printArrylist(array);
		

	}

}

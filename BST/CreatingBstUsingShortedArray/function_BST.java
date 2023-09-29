package CreatingBstUsingShortedArray;

import java.util.Scanner;

public class function_BST {
	//creating the input function level wise input 
	// creating the function for the printing 
	
	public binaryTreeNode<Integer> takeinput_LevelWise(){
		
		//creating the scanner object 
		Scanner input = new Scanner(System.in) ; 
		// creating the statement for the user dispalay
		System.out.println("enter root");
		// taking the input form the 
		int rootNodeDeta = input.nextInt();
		
		// now check the this is the input -1 
		if (rootNodeDeta == -1) {
			return null ; 
		}
		
		// now store the data in the node 
		
	}

}

package PATH_BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BSTtoLL.binaryTreeNode;

public class PathOfBst {
	
	// now creating the function for the finding path 
	
	public ArrayList<Integer> BstPath(BinaryTreeNode<Integer>root , int x ){
		
		// now creating the base condition 
		if (root == null) {
			return null ; 
			
		}
		
		 // creating the array ksit object 
		
		
		// now creating the condtion 
		if (root.data == x ) {
			ArrayList<Integer>ArrayObject  = new ArrayList<>() ;
			// now add the data in the arrya lsit 
			ArrayObject.add(root.data) ; 
			// now return the object 
			return ArrayObject ; 
		}
		
		// now calling the left side 
		ArrayList<Integer>leftsideTree = BstPath(root.leftNode, x) ; 
		if (leftsideTree != null) {
			// now add the element in the leftside of the array list 
			leftsideTree.add(root.data); 
			return leftsideTree ; 
		}
		 
		
		// now again calling the left side 
		ArrayList<Integer>RightsideTree = BstPath(root.rightNode, x) ; 
		if (RightsideTree != null) {
			// now adding the 
			RightsideTree.add(root.data) ;
			return RightsideTree ; 
		}
		
		return null ; 
		
	}
	
	
	// now creating the print of the array lsit 
	public void printArrylist(ArrayList<Integer>arrya) {
		
		// creating the for each loop for the printing of the every element 
		for (Integer integer : arrya) {
			System.out.print(integer);
		}
	}
	
	
	
	// now creating function for the taling input form the user of the binnary tree 
	
	// creating the access modifire 
	public BinaryTreeNode<Integer> TakingInputBST(){
		
		// now creating the user display for the root node 
		System.out.println("enter the root : ");
		// now creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		// now input object user to taking input from the user 
		int rootdata = input.nextInt() ; 
		
		// now check what is actually input by the user 
		if (rootdata ==  -1) {
			return null ; 
		}
		
		// now creating the object of the node for the storing the value of the root data in the form of the node 
		 BinaryTreeNode<Integer>rootNode = new BinaryTreeNode<Integer>(rootdata) ; 
		 // now creating the queu for for the input level wise 
		 Queue<BinaryTreeNode<Integer>>pendingElement  = new LinkedList<BinaryTreeNode<Integer>>();
		 // now adding the root node in the pending element 
		 pendingElement.add(rootNode) ; 
		 
		 // now creating the loop for the taking input contineusely 
		 // using the condtition pending element is not empety 
		 if (!pendingElement.isEmpty()) {
			
			 // now creating the refrence of the node storing the pending element 
			 
			 
			 
		}
		 
	}

}

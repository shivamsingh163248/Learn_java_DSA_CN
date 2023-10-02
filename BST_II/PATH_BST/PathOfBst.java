package PATH_BST;

import java.util.ArrayList;

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
		
		 
	}

}

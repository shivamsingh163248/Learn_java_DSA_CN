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

}

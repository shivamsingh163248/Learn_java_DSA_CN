package CHECK_BST;

import PATH_BST.BinaryTreeNode;

public class checkbst_function {
	
	  // creating the boolean function for the checking bst
	
	public boolean isBst(BinnaryTreeNode<Integer>root ) {
		
		// creating the base condition 
		if (root == null ) {
			return true ; 
		}
		
		// creating the two helper function maximum and minimum 
		int max = maximum(root.left) ; 
		// now check the condition 
		if (max >= root.data) {
		 return false ; 
		}
		
		 
		int min = minimum(root.right) ; 
		
		// now check the condition 
		if (min < root.data) {
			return false ; 
		}
		
		// now calling the left and right side 
		
    boolean left = isBst(root.left) ;
    boolean  rights = isBst(root.right) ; 
    
    return left && rights ; 
    
    
    
    
		
		
	}

	private int minimum(BinnaryTreeNode<Integer>root) {
		// creating the base condition 
		if (root == null) {
			return Integer.MAX_VALUE ;
		}
		
		int left = minimum(root.left) ; 
		int right = minimum(root.right);
		
		
		return Math.min(root.data, Math.min(left, right));
	}

	

	private int maximum(BinnaryTreeNode<Integer>root) {
		
		// now calling the left side and right side 
		// now creating the base condition 
		if (root == null) {
			return Integer.MIN_VALUE ; 
		}
		
		// now calling the left side and the right side 
	int left = 	maximum(root.left) ; 
    int right = maximum(root.right) ; 
		
		// now return the maximum 
		
		
		
		return Math.max(root.data, Math.max(left,right ));
	}

}

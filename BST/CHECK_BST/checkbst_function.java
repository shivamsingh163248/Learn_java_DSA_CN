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

	private int minimum(BinnaryTreeNode<Integer> right) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	private int maximum(BinnaryTreeNode<Integer>root) {
		
		// now calling the left side and right side 
		
		
		return 0;
	}

}

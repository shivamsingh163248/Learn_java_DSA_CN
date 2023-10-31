package TREE_FUNCTION;

public class functionTree {
	
	// creating the input and output function 
	
	// creating the function for the finding the leaf node in tree 
	// they are the return the integer 
	public int CountLeafNode(TreeNode<Integer>root) {
		
		// creating the base condtion
		if (root == null) {
			return 0 ; 
		}
		
		int count = 0 ; 
		if (root.children.size() == 0 ) {
			count++ ; 
		}
		
		// now calling the for loop for the all the child 
		for (int i = 0; i < root.children.size(); i++) {
			int returnintger = CountLeafNode(root.children.get(i)) ; 
			count += returnintger ; 
		}
		
		return count ; 
		
		
	}

}

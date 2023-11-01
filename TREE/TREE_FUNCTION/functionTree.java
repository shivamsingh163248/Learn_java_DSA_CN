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
	
	// creating the next larger element program 
	public TreeNode<Integer> nextLaregerElement(TreeNode<Integer>root , int n ){
		
		// n is the number find the next larger element 
		// creating the base condition 
		if (root == null) {
			return null ; 
		}
		
		// now creating the refrence of the object 
		TreeNode<Integer>nextNode = null ; 
		
		if (root.Data > n) {
			// now update the refrence 
			nextNode = root ; 
		}
		
		// now calling the all the children of all the root all the node 
		
		
	}

}

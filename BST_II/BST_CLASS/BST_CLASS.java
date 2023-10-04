package BST_CLASS;

public class BST_CLASS {
	
	// crating the two private member 
	private BinaryTreeNode<Integer>root ; 
	private int size; 
	
	
	// NOW creating the function 
	// creating the helper function of the below function 
	public boolean isPresentHelper(BinaryTreeNode<Integer>node ,int x  ) {
		// creating the base condition 
		if (node == null) {
			return false ; 
		}
		
		// now creating the condition 
		
		if (node.data == x) {
			return true ; 
		}
		
		// now calling the both side according 
		if (root.data > x ) {
			// now caling the left side 
			return isPresentHelper(node.left, x) ; 
		}else {
			return isPresentHelper(node.right, x) ; 
		}
		
		
	}
	
	// now creating the function for the insurt 
	public boolean isPresent(int x) {
		
	}
	


}

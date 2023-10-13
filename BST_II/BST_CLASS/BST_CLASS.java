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
		
		// now calling the helper function 
		return isPresentHelper(root, x) ; 
		
	}
	
	// now creating again insurt function  fuction 
	
	public void insert(int x ) {
		
		// now creating the helper function 
		root = insertHelper(root, x) ; 
		
	} 
	
	// now now creating the helper function 
	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer>root , int x ) {
		
		// creating the base condition 
		// two concept are working if bigger the root the attach with the right side and other wise 
		// attech with left side 
		if (root == null ) {
			// creating the new node object 
			BinaryTreeNode<Integer>newNode = new BinaryTreeNode<Integer>(x) ; 
			return newNode ; 
		}
		
		// now creating the condition of the calling the left and right side and linking 
		if (x >= root.data) {
			// now calling the right side 
			root.right = insertHelper(root.right, x) ; 
		}else {
			root.left = insertHelper(root.left , x);
		}
		return root ; 
		
	}
	
	// now creating the print function 
	public void print() {
		
		
	}
	
	// creating the helper function 
	private void print(BinaryTreeNode<Integer>root) {
		
		// now creating the base condition 
		if (root == null ) {
			return ; 
		}
		
		
		System.out.println("root : "+root.data);
		
		// now printing the left and right side 
		if (root.left != null) {
			System.out.println("L :"+root.left.data);
		}
		// creating the second condition for the right side 
		if (root.right != null) {
			System.out.println("R :"+root.right.data);
		}
		
		// now creating for the spcae 
		System.out.println(); 
		
		// now calling the lef side and the right side 
		print(root.left);
		print(root.right);
		
	}
	
	
	// now creating the function 
	
	


}

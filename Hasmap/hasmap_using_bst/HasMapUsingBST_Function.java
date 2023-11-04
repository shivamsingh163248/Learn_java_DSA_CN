package hasmap_using_bst;

public class HasMapUsingBST_Function {
	
	// creating the variable 
	private TreeNode<Integer>root ; 
	
	// now creating the constructor of the hasmap using function 
	
	public HasMapUsingBST_Function() {
		// now creating the default value of the treenode is the null 
		// when creating the object of this class 
	    root = null ; 
	}
	
	// now creating the insert function 
	public void put(int key , int value) {
		
		// calling the put function 
		root = insert(root , key , value) ; 
	}

	private TreeNode<Integer> insert(TreeNode<Integer> root, int key, int value) {
		
		// now creating the base condition 
		if (root == null) {
			return new TreeNode<Integer>(key, value) ; 
		}
		
		// now calling the left side and right side according to condition 
		
		if (root.key > key) {
			// now calling the left side 
		root.left = 	insert(root.left, key, value) ; 
		} else if(root.key < key){
			// now calling the right side of the node 
			root.Right  = insert(root.Right, key, value);
			
		}else {
			// if both condition not match it means key and same 
			root.value = value ; 
			
		}
		
		
		
		
		
		
		
		return root;
	} 
	
	
	
	
	
	// now creating the another function for searching that function name is the get 
	public int get(int key) {
		
		// creating the tarnry operator 
		TreeNode<Integer>node = searching(root, key) ; 
        return (node != null)? node.value : -1 ; 
	}

	private TreeNode<Integer> searching(TreeNode<Integer> root, int key) {
		
		// creating the base condition 
		if (root == null || root.key == key) {
			return root ; 
		}
		
		// now calling the left side and right side 
		if (root.key > key ) {
			return searching(root.left, key);
		}
		return searching(root.Right, key) ; 
		
		
	}
	
	
	// now creating the function 
	public void  remove(int key) {
		// calling the function delete 
		root = delete(root , key) ; 
	}

	private TreeNode<Integer> delete(TreeNode<Integer> root, int key) {
		
		
		
		return null;
	}

	
	

}

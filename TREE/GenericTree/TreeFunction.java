package GenericTree;

public class TreeFunction {

	
	 // now creating the printing function 
	public void printTree(TreeNode<Integer>root) {
		
		// now writing the base case 
		if (root == null) {
			return ; 
		}
		
		// now printing the data 
		System.out.print(root.data+" : ");
		for (int i = 0; i < root.childeren.size(); i++) {
			System.out.print(root.childeren.get(i).data+" ");
		}
		System.out.println();
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			// now creating the refrence of the tree 
			TreeNode<Integer>node = root.childeren.get(i);
			printTree(node);
		}
	}
	
	// creating the function counting the node of the tree 
	// now return the integer 
	public int TotalTreeNode(TreeNode<Integer>root) {
		
		int count = 1 ; 
		
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			int childcount = TotalTreeNode(root.childeren.get(i));
			count += childcount ; 
		}
		return count ; 
		
	}
}

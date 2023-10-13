package BST_CLASS;

import CHECK_BST.BinnaryTreeNode;

public class bst_delete_return {
	
	private BinaryTreeNode<Integer>root ; 
	// creating the deleted  variable 
	private boolean deleted ; 
	
	// creating the constrocter 
	public bst_delete_return(BinaryTreeNode<Integer>root , boolean deleted) {
		this.root = root ;
		this.deleted = deleted ; 
	}

}

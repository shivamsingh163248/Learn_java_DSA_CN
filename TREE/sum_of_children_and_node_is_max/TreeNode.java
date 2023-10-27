package sum_of_children_and_node_is_max;

import java.util.ArrayList;

public class TreeNode <T> {
	
	T data ; 
	ArrayList<TreeNode<T>>children ; 
	
	// now creating the constrocter 
	public TreeNode(T data ) {
		this.data = data ; 
		children = new ArrayList<>()  ; 
	}

}

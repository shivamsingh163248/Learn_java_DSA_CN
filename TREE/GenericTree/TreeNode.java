package GenericTree;

import java.util.ArrayList;

public class TreeNode <T>{

	// creating the t type data 
	T data ; 
    ArrayList<TreeNode<T>>childeren ; 
	
	public TreeNode(T data) {
		
		this.data = data;
		this.childeren = new ArrayList<>() ; 
	} 
	

	
}

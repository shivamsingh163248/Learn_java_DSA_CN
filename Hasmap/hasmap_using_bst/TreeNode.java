package hasmap_using_bst;

public class TreeNode<T>{
	
	// creating the node node 
	T key ; 
	T value ; 
	
	// creating the reference of the same class 
	TreeNode<T>left ; 
	TreeNode<T>Right ; 
	
	// now creating the constructor 
	
 public TreeNode(T key , T value) {
	this.key = key ; 
	this.value = value ; 
}
}

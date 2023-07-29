package bannary_tree;



public class BinnaryTreeNode <T>{  // fist we are the creating the generic 
	
	   // now creating the t deta type of the deta 
	
	T data ; 
	// creating the next node refrencing deta  type that are storing the class type 
	BinnaryTreeNode<T> LeftNde ; 
	// creating the refrencing for the right node 
	BinnaryTreeNode<T> RigtNode ; 
	
	// now creating the constocter for the set the value 
	
	public BinnaryTreeNode(T data ){
		// now set the value of the data with using of the this keyworld 
		this.data = data ; 
	}

}

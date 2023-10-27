package sum_of_children_and_node_is_max;

public class sum_of_children_function {

	public TreeNode<Integer> sum_of_children(TreeNode<Integer>root){
		
		if (root == null) {
			return null ; 
		}
		
		// now calling the helper function ]
		
		// creating the object of the pair function 
		
   pair ans = helper_sum_of_chidren(root);
   
   return ans.node ; 
		
		
	}
	
	// creating the helper function 
	
	public pair helper_sum_of_chidren(TreeNode<Integer>root) {
		
		// now creating the object of the pair class 
		pair ans = new pair() ; 
		ans.node = root ; 
		// creating the data is root 
	 int sum = root.data ; 
	 
	 // now creating the loop for the adding all the children 
	 for (int i = 0; i < root.children.size(); i++) {
		sum += root.children.get(i).data ; 
	}
	 
	 // now set the all the sum 
	 ans.xsum = sum ; 
	 
	 // now  creating the loop for the calling all the child node 
	 for (int i = 0; i < root.children.size(); i++) {
		
		 // creating the object of the class of  the pair 
		 pair sumNode = helper_sum_of_chidren(root.children.get(i)) ; 
		 
		 // now creating the condition 
		 if (sumNode.xsum >  ans.xsum) {
			
          // if the sum node is the  greate form the other child then update the value 
			 ans.xsum = sumNode.xsum ; 
			 ans.node = sumNode.node ; 

		}
		 
	}
	 
		return ans ; 
		
		
	}
	
	
	
	
	
	
}

package TREE_FUNCTION;

import java.util.ArrayList;

public class TreeNode <T>{

   T Data ;
   ArrayList<TreeNode<Integer>>children ; 
   
   public TreeNode(T data) {

	   // now creating the set the data in the parameter 
	   this.Data = data ; 
	   // now creating the arraylist 
	   children = new ArrayList<>() ; 
}
   
   
}

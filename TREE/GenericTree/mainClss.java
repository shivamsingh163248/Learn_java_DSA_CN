package GenericTree;

public class mainClss {
	
	// now creating the object 
	public static void main(String[] args) {
		
//		TreeNode<Integer>root = new TreeNode<Integer>(5) ; 
//		TreeNode<Integer>node1 = new TreeNode<Integer>(2) ; 
//		TreeNode<Integer>node2 = new TreeNode<Integer>(3) ; 
//		TreeNode<Integer>node3 = new TreeNode<Integer>(10) ; 
//		TreeNode<Integer>node4 = new TreeNode<Integer>(15) ; 
//		TreeNode<Integer>node5 = new TreeNode<Integer>(25) ; 
//		
//		
//		// now creating the linking process 
//		root.childeren.add(node1);
//		root.childeren.add(node2);
//		root.childeren.add(node3);
//		node1.childeren.add(node4);
//		
//		// now connection in node i 
//		node1.childeren.add(node5) ; 
//		
////		System.out.println(node);
////		node.childeren.add(node);
////		node.childeren.add(nodee);
////		
////		System.out.println("check aonther");
////		System.out.println(node.childeren);
//		
//		// now creating the object of the function 
//		TreeFunction function = new TreeFunction() ; 
//		function.printTree(root);
//		
//		
//		// now test the  total number function 
//		int total = function.TotalTreeNode(root) ; 
//		System.out.println("total number node : "+total);
//		
//		System.out.println(function.SumTotalTreeNode(root));
		
		// now creating the testing the data  the valu of the number 
		// now creatinga the testing the data 
		// for the testing the data 
		
		// creating the diiferent object 
		TreeFunction  test = new TreeFunction() ; 
		
//		
		TreeNode<Integer>LevelWiseNode = test.TaingInputLevelWiseTree();
		test.printTree(LevelWiseNode);
		// printing the level wisee 
		test.printLevelwise(LevelWiseNode);
		
	}

}

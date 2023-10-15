package GenericTree;

public class mainClss {
	
	// now creating the object 
	public static void main(String[] args) {
		
		TreeNode<Integer>root = new TreeNode<Integer>(5) ; 
		TreeNode<Integer>node1 = new TreeNode<Integer>(53) ; 
		TreeNode<Integer>node2 = new TreeNode<Integer>(55) ; 
		TreeNode<Integer>node3 = new TreeNode<Integer>(35) ; 
		TreeNode<Integer>node4 = new TreeNode<Integer>(85) ; 
		TreeNode<Integer>node5 = new TreeNode<Integer>(45) ; 
		
		
		// now creating the linking process 
		root.childeren.add(node1);
		root.childeren.add(node2);
		root.childeren.add(node3);
		node1.childeren.add(node4);
		
		// now connection in node i 
		node1.childeren.add(node5) ; 
		
//		System.out.println(node);
//		node.childeren.add(node);
//		node.childeren.add(nodee);
//		
//		System.out.println("check aonther");
//		System.out.println(node.childeren);
		
		// now creating the object of the function 
		TreeFunction function = new TreeFunction() ; 
		function.printTree(root);
		
//		
	}

}

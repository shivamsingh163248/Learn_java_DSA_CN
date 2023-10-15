package GenericTree;

public class mainClss {
	
	// now creating the object 
	public static void main(String[] args) {
		
		TreeNode<Integer>node = new TreeNode<Integer>(5) ; 
		TreeNode<Integer>nodee = new TreeNode<Integer>(5) ; 
		System.out.println(node);
		node.childeren.add(node);
		node.childeren.add(nodee);
		
		System.out.println("check aonther");
		System.out.println(node.childeren);
		
	}

}

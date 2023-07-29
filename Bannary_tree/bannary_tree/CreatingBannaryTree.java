package bannary_tree;

public class CreatingBannaryTree {
	
	// creating the printing function of the print the binary tree 
	public static void print(BinnaryTreeNode<Integer>root) {
		// creating the simple simple print function 
		
		// basically i righting the simple function 
		System.out.println(root.data);
		
		// now calling both node 
		
		if (root.LeftNode != null ) {
			// callling the left node for the printing 
			print(root.LeftNode);
		}
		
		if (root.RigtNode != null ) {
			// calling the root function 
			print(root.RigtNode);
		}
		
	}
	
	// again we are the creating the printing funcrion 
	public static void BinaryTreePrint(BinnaryTreeNode<Integer>root) {
		
		// creating the base function 
		if (root == null ) {
			return ; 
		}
		// now calling the function 
		System.out.println(root.data);
		BinaryTreePrint(root.LeftNode);
		BinaryTreePrint(root.RigtNode);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object of the node that is the root node 
//		BinnaryTreeNode<Integer>root = new  BinnaryTreeNode<Integer>(20) ; 
//		// creating the two more node one the left node and the second one the right node 
//		// again creating the object and creating the both node as the set of the 
//		// Binary tree 
//		BinnaryTreeNode<Integer>LeftNode = new BinnaryTreeNode<Integer>(45) ; 
//		// agian creaing the right node 
//		BinnaryTreeNode<Integer>RightNode = new BinnaryTreeNode<Integer>(234) ; 
//		
//		// now creating the linking procress 
//		
	 // root.LeftNde = LeftNode ; 

		
//		
//		BinnaryTreeNode<Integer> 
//		
//		
//		
//		
//		
//		
//		// for the checking the printing we are calling the print function 
//		print(root);
//		
//		// test the function again 
//		BinaryTreePrint(root);
		
		
		
		BinnaryTreeNode<Integer>root = new BinnaryTreeNode<Integer>(25);
		BinnaryTreeNode<Integer> LeftNode = new BinnaryTreeNode<Integer>(30) ; 
		BinnaryTreeNode<Integer>RightNode = new BinnaryTreeNode<Integer>(35) ; 
		
		// again creating the node 
		BinnaryTreeNode<Integer>leftnode1 = new BinnaryTreeNode<Integer>(40) ; 
		BinnaryTreeNode<Integer>RightNode1 = new BinnaryTreeNode<Integer>(41) ; 
		BinnaryTreeNode<Integer>RightNode2= new BinnaryTreeNode<Integer>(20) ; 
		
		// now creating the linking process 
		
		root.LeftNode = LeftNode ;
		root.RigtNode = RightNode ; 
		
		// linking step 2 
		
		LeftNode.LeftNode = leftnode1 ; 
		LeftNode.RigtNode = RightNode1 ; 
		
		RightNode.RigtNode = RightNode2 ; 
		
		System.out.println(LeftNode.RigtNode);
		
		
		
		
		// now calling the print function 
		
		BinaryTreePrint(root);
		
		
		
		
		
		

	}

}

package BinaryTree;

public class balanceTree {
	
	// creating the function of the hight of the tree 
	
	public static int HightBinaryTree(BinaryTreeNode<Integer>root) {
		// creating the base condition 
		if (root == null ) {
			return 0 ; 
		}
		
		
		// calling the function 
		
		int left = HightBinaryTree(root.LeftNode) ; 
		int right = HightBinaryTree(root.RightNode) ; 
		
		
		// check the conditon of te return 
		if (left>right) {
			return 1+ left ; 
		}else {
			return 1+right ; 
		}
		
		
			}
	
	// creating the function og thebalanceing 

	
	public static boolean isBalncedTree(BinaryTreeNode<Integer>root ) {
		
		// fist creating the base condition 
		if (root == null ) {
			return true ; 
		}
		
		// now calling the left root hight and right hight 
		int lefthight = HightBinaryTree(root.LeftNode) ; 
		int RightHight = HightBinaryTree(root.RightNode) ; 
		
		if (Math.abs(lefthight-RightHight)> 1) { // math.asb use of the creating the absulting value 
			// ex if after - you value become -1  then it is creating the 1 
			return false ; 
		}
		
		
		// now 
		
		// now calling the both 
		boolean isleft = isBalncedTree(root.LeftNode) ; 
		boolean isRight = isBalncedTree(root.LeftNode) ; 
		
		// now  
		return  isleft && isRight ; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 // creating the refrence of the root node \
		
		// creating the binnary tree function object 
		BinaryTreeFunction shivam = new BinaryTreeFunction() ; 
		
		BinaryTreeNode<Integer>root = shivam.TakeInput(true, 0, false) ; 
		
		// check balance or not 
		System.out.println(isBalncedTree(root));
		

	}

}

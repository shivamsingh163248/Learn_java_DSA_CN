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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

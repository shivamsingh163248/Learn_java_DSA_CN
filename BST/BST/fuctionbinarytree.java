package BST;

import java.util.Scanner;

public class fuctionbinarytree {
	
	// creating the all function of the node 
	// creating the take function ]
	// 	creating the function of the teching the input 
	
	
	public BinnarySearchTreeNode<Integer>takeinput(boolean isRoot , int Present , boolean rootleft){
		
		// creating the condition 
		if (isRoot) {
			System.out.println("enter the root : ");
		}else if(rootleft) {
			System.out.println("enter the leftnode : "+Present);
		}else {
			System.out.println("enter the rightndoe : "+Present);
		}
		
		// creating the scanner function 
		Scanner input = new Scanner(System.in);
		
		int rootdata = input.nextInt();
		
		if (rootdata == -1) {
			return null ; 
		}
		
		// now creating the scanner function 
		
		// creating the object for the node 
		BinnarySearchTreeNode<Integer>node = new BinnarySearchTreeNode<Integer>(rootdata) ; 
		// now creating again new node 
		BinnarySearchTreeNode<Integer>leftnode = takeinput(false, rootdata, true) ;
		BinnarySearchTreeNode<Integer>rightnode = takeinput(false, rootdata, false);
		
		// now creating the linking process 
		
		node.leftnode = leftnode ; 
		node.rightnode = rightnode ; 
		
		// now creating the return function 
		return node ; 
		
		
		
		
		
		
	}
	
	// now creating the printing function 
	
	public void Bst_pritnt(BinnarySearchTreeNode<Integer>root) {
		
		// checking the root node is empty or not 
		
		if (root == null) {
			return  ; 
		}
		
		// now again creating the  algorithum 
		 // now printing the left 
		
		// now printing the root 
		System.out.println("root : "+root.data);
		
		if (root.leftnode != null) {
			System.out.println(" L : " +root.leftnode.data);
		}
		// now again printing the right node 
		if (root.rightnode != null ) {
			System.out.println(" R : " +root.rightnode.data);
		}
		
		System.out.println();
		
		
		// AGAIN CALLING THE FUNCTION 
		Bst_pritnt(root.leftnode);
		Bst_pritnt(root.rightnode);
		
	}
	
	// creating the function of the deft of the node 
	
	public int defth_of_tree(BinnarySearchTreeNode<Integer>rootnode) {
		
		// now writing the base function 
		if (rootnode == null) {
			return 0 ; 
		}
			// calling the left and right node 
			int left = defth_of_tree(rootnode.leftnode);
			int right = defth_of_tree(rootnode.rightnode) ; 
			
			// now check the condtion 
			if (left > right) {
				return left+1 ; 
			}else {
				return right+1 ; 
			}
			
			
			
		
	}
	
	
	// again creating the next function that is the total umber of the node
	public int total_node (BinnarySearchTreeNode<Integer>root_node) {
		
		// check for the frist node if the blank then print return o 
		if (root_node == null) {
			return 0 ; 
		}
		
		// calling the function for the left and right 
		
		int left = total_node(root_node.leftnode) ; 
		int right = total_node(root_node.rightnode) ; 
		
		// now creating the return function 
		return left+right+1 ; 
		
	}
	
	// creating the function total leaf node 
	
	// creating the function for the counting the total node  
	
	public int number_leafnode (BinnarySearchTreeNode<Integer>root_node) {
		 
		// now creating the base condition 
		
		
		if (root_node == null) {
			return 0 ; 
		}
		
		// creating the condition for the left condition and the right condition are the null then 
		// then we are the calling the left node 
		if (root_node.leftnode == null && root_node.rightnode == null) {
			return 1 ; 
		}
		
		// now calling for the left and right for the node 
		int left = number_leafnode(root_node.leftnode) ; 
		int right = number_leafnode(root_node.rightnode) ; 
		
		// now using the return function 
		return left+right ; 
		
	}
	
	
	

}

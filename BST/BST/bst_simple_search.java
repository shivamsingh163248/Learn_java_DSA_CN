package BST;

public class bst_simple_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// now calling the ake input function 
		// creating the object of the function of the binary tree 
		
		fuctionbinarytree allfunction = new fuctionbinarytree();
		
		// now callinf for the take input 
		
	 // creating the refrence of the of node 
		
		BinnarySearchTreeNode<Integer>rootnode = allfunction.takeinput(true, 0, false) ; 
		
		// now again calling for the printing 
		
		allfunction.Bst_pritnt(rootnode);
		

	}

}
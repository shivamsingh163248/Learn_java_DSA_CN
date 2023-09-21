package BST;

public class bst_simple_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// now calling the ake input function 
		// creating the object of the function of the binary tree 
		
		fuctionbinarytree allfunction = new fuctionbinarytree();
		
		// now callinf for the take input 
		
	 // creating the refrence of the of node 
		
	//	BinnarySearchTreeNode<Integer>rootnode = allfunction.takeinput(true, 0, false) ; 
		
		// now again calling for the printing 
		
	//	allfunction.Bst_pritnt(rootnode);
		
		// calling the function for the level wise input 
		
		// fist creating the object 
		
		searchelemrntinBST test = new searchelemrntinBST() ; 
		
		// taking the function of the level wise input 
		BinnarySearchTreeNode<Integer>input = test.takeinput_levelwise() ; 
		// creating the print function for the using the different object 
		allfunction.Bst_pritnt(input);
		

	}

}

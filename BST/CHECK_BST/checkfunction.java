package CHECK_BST;

public class checkfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// taking input form the user 
		// creating the object 
		checkbst_function function = new checkbst_function();
		BinnaryTreeNode<Integer>root =  function.TakingInputBST() ; 
		System.out.println(function.isBst(root));
		
	}

}

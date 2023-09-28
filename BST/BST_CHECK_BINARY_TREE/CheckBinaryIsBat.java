package BST_CHECK_BINARY_TREE;

public class CheckBinaryIsBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// creating the object for the calling method 
		input_print_checkbst_function function = new input_print_checkbst_function() ; 
		// calling for the input 
		
		// creating the node for the store the value 
		BinnaryTreeNode<Integer>inputRootNode = function.takeinput_levelwise() ; 
		
		// now creating the printing function 
		function.printBST(inputRootNode);
		
		// check bst is the binnary 
		// calling the function of the check binary is the bst 
		System.out.println(); 
		System.out.println(function.checkBnaryTreeIsBst(inputRootNode));

	}

}

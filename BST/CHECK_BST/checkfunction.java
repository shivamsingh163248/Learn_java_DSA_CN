package CHECK_BST;

public class checkfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// taking input form the user 
		// creating the object 
		checkbst_function function = new checkbst_function();
		BinnaryTreeNode<Integer>root =  function.TakingInputBST() ; 
		// creating the class refreance of ans the obejct 
		isBstRetuen returnobject = function.isBstcheck(root);
		System.out.println(returnobject.min + " "+returnobject.max +" "+returnobject.isBst);
		
		System.out.println("this is the another ans ");
		
		System.out.println(function.isBst(root));
		
	}

}

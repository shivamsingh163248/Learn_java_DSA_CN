package BinaryTree;

public class BalanceTreeInprved {
	
	// creating the function improvent in thebalnced treee 
	
	public static BalancedTreeReturn isBalncedBatter (BinaryTreeNode<Integer>root) {
		
		// fist we are the ccreating the base condition 
		if (root == null ) {
			int hight = 0 ; 
			boolean isbalnced = true  ; 
			BalancedTreeReturn ans = new BalancedTreeReturn() ; 
			ans.hight = hight ; 
			ans.isBalanced = isbalnced ; 
			return ans ; 
		}
		
		// now calling the object 
		BalancedTreeReturn leftoutput = isBalncedBatter(root.LeftNode) ;
		// now again calling the right side part 
		BalancedTreeReturn Rightoutput = isBalncedBatter(root.RightNode) ; 
		
		// now creating the integer of the hight and isbalanced ; 
		int hight = 1+ Math.max(leftoutput.hight, Rightoutput.hight);
		boolean isbalnced = true  ; 
		
		// now check the condtion of the false 
		if (Math.abs(leftoutput.hight - Rightoutput.hight) > 1) {
			isbalnced = false ; 
		}
		
		if (!leftoutput.isBalanced || !Rightoutput.isBalanced) {
			isbalnced = true ; 
		}
		
		
		// now set the value in the object 
		// hear is upgreading in the object 
		BalancedTreeReturn ans = new BalancedTreeReturn(); 
		ans.hight = hight ; 
		ans.isBalanced = isbalnced ; 
		return ans ; 
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the obejct of the function of the binary tree 
		BinaryTreeFunction shivam = new BinaryTreeFunction();
		
		// creating the refrence of the root node 
		BinaryTreeNode<Integer>root = shivam.TakeInput(true, 0, false);
		
		// calling the function of the 
		System.out.println(isBalncedBatter(root).isBalanced);
		// creaing the refrence of the 
	BalancedTreeReturn itisha  = isBalncedBatter(root) ; 
	System.out.println(itisha.isBalanced);

	}

}

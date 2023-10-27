package CHECK_BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import PATH_BST.BinaryTreeNode;

public class checkbst_function {
	
	  // creating the boolean function for the checking bst
	
	public boolean isBst(BinnaryTreeNode<Integer>root ) {
		
		// creating the base condition 
		if (root == null ) {
			return true ; 
		}
		
		// creating the two helper function maximum and minimum 
		int max = maximum(root.left) ; 
		// now check the condition 
		if (max >= root.data) {
		 return false ; 
		}
		
		 
		int min = minimum(root.right) ; 
		
		// now check the condition 
		if (min < root.data) {
			return false ; 
		}
		
		// now calling the left and right side 
		
    boolean left = isBst(root.left) ;
    boolean  rights = isBst(root.right) ; 
    
    return left && rights ; 
    
    
    
    
		
		
	}

	private int minimum(BinnaryTreeNode<Integer>root) {
		// creating the base condition 
		if (root == null) {
			return Integer.MAX_VALUE ;
		}
		
		int left = minimum(root.left) ; 
		int right = minimum(root.right);
		
		
		return Math.min(root.data, Math.min(left, right));
	}

	

	private int maximum(BinnaryTreeNode<Integer>root) {
		
		// now calling the left side and right side 
		// now creating the base condition 
		if (root == null) {
			return Integer.MIN_VALUE ; 
		}
		
		// now calling the left side and the right side 
	int left = 	maximum(root.left) ; 
    int right = maximum(root.right) ; 
		
		// now return the maximum 
		
		
		
		return Math.max(root.data, Math.max(left,right ));
	}
	
	
	// now taking the input level wise 
public BinnaryTreeNode<Integer> TakingInputBST(){
		
		// now creating the user display for the root node 
		System.out.println("enter the root : ");
		// now creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		// now input object user to taking input from the user 
		int rootdata = input.nextInt() ; 
		
		// now check what is actually input by the user 
		if (rootdata ==  -1) {
			return null ; 
		}
		
		// now creating the object of the node for the storing the value of the root data in the form of the node 
		 BinnaryTreeNode<Integer>rootNode = new BinnaryTreeNode<Integer>(rootdata) ; 
		 // now creating the queu for for the input level wise 
		 Queue<BinnaryTreeNode<Integer>>pendingElement  = new LinkedList<BinnaryTreeNode<Integer>>();
		 // now adding the root node in the pending element 
		 pendingElement.add(rootNode) ; 
		 
		 // now creating the loop for the taking input contineusely 
		 // using the condtition pending element is not empety 
		 while (!pendingElement.isEmpty()) {
			
			 // now creating the refrence of the node storing the pending element 
			 
			 BinnaryTreeNode<Integer>rootnode = pendingElement.poll();
			 // now taking the input for the left side of the tree 
			 // creating the node for the left  side 
			 System.out.println("Left : "+rootnode.data);
			 // now creating the scanner function 
			 int leftData = input.nextInt();
			
			 
			 // now check the condtion
			 if (leftData != -1) {
				
				 // now creating the node and the adding the deta 
				 BinnaryTreeNode<Integer>leftNode = new BinnaryTreeNode<Integer>(leftData) ; 
				 // now linking thre deta 
				 rootnode.left = leftNode ; 
				 // mow adding in the queue that is the pending element 
				 pendingElement.add(leftNode) ; 
			}
			 
			 // now user disppaly for the right node
			 System.out.println("rightnode : "+rootnode.data);
			 // now taking the input 
			 int rightnodedata = input.nextInt();
			 
			 // now creating the  condition 
			 if (rightnodedata != -1) {
				
				 // now adding the data in the right node 
				 BinnaryTreeNode<Integer>rightnode = new BinnaryTreeNode<Integer>(rightnodedata) ; 
				 
				 // now creating the linking the process 
				 rootnode.right = rightnode ; 
				 // now adding in the pending queue 
				 pendingElement.add(rightnode) ; 
			}
			 
		}
		 
		 // now return the 
		 return rootNode ; 
	}

// now creating the another function check bst or not using the bst class 

/// now creating the function name 
public isBstRetuen isBstcheck(BinnaryTreeNode<Integer>root) {
	
	// now creating the base condition 
	if (root == null ) {
		// creating the object of the isbast return 
		isBstRetuen object = new isBstRetuen(Integer.MAX_VALUE, Integer.MIN_VALUE, true) ;
		// now return the object 
		return object ; 
	}
	
	// NOW calling the left side and the right side 
	isBstRetuen left = isBstcheck(root.left) ; 
    isBstRetuen right = isBstcheck(root.right) ; 
    
    // now finding the min value 
    
    int minvalue = Math.min(root.data, Math.min(left.min, right.min)) ; 
    int maxvalve = Math.max(root.data, Math.max(left.max, right.max)) ; 
    
    // now creating the chek the value 
    
    System.out.println("root data "+root.data+" left min : "+left.min+"right min :"+right.min+" left max :"+left.max+" right max : "+right.max);
    boolean isbstis = true ; 
    // now check the condition 
    if (left.max > root.data) {
		isbstis = false  ; 
	}
    if (right.min < root.data) {
		isbstis = false ; 
	}
    
    // now creating the condition of true and flase 
    if (!left.isBst) {
		isbstis = false ; 
	}
    if (!right.isBst) {
		isbstis = false ; 
	}
    
    // now calling the both side 
    
    isBstRetuen ans = new isBstRetuen(minvalue, maxvalve, isbstis);
    return ans ; 
     
	
	
	
	
}
	

}

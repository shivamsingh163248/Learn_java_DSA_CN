package find_maximun_minum_using_pair;

public class FindMaxMin {
	
	// creating the class of the pair 
	
	public static Pair<Integer, Integer> findminmax = new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE) ;
	
	// now creating the function that one is the return pair class 
	
	// creating the function 
	
	public static Pair<Integer, Integer> findmaxmin (BinaryTreeNode<Integer>root){
		
		//CALLING THE FUNCTUIN 
		getMinAndMaxHelper(root);
		// return 
		return findminmax ; 
		
	}
	
	
	  private static void getMinAndMaxHelper(BinaryTreeNode<Integer> root) {
		  
		  // creating the 
		  if (root == null ) {
			return ; 
		}
		  
		  
		  // now find the minmun and maximum 
		  int rootdata = root.data ; 
		  int min = findminmax.maximum ; 
		  
		  if (rootdata > min) {
			// now changed the min 
			  findminmax.maximum  = rootdata; 
		}
		  
		  // now creating  the 
		  
		  int max = findminmax.minimum ; 
		  if (rootdata < max) {
			// now store the value 
			  findminmax.minimum = rootdata ; 
		}
		  
		  
		  // now calling for the left and right 
		  getMinAndMaxHelper(root.LeftNode);
		  getMinAndMaxHelper(root.RightNode);
		  
	  }
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}

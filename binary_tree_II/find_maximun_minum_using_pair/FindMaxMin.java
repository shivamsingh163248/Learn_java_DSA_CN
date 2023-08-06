package find_maximun_minum_using_pair;

import java.util.LinkedList;
import java.util.Queue;

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
	  
	  
	  
	  // now gain creating the lavel wise pritning 
	  public static void LavelWisePrinting(BinaryTreeNode<Integer>root) {
		  
		  // now creating the base condtion for the lavel wise printing 
		  if (root == null ) {
			return ; 
		}
		  
		  // now creating the object of the  queue 
		  Queue<BinaryTreeNode<Integer>>pendingnode = new LinkedList<BinaryTreeNode<Integer>>();
		  //now add the  root element in 
		  pendingnode.add(root) ; 
		  // now adding the null in the queue for the space printing 
		  pendingnode.add(null) ; 
		  
		  
		  // now creating the loop 
		  while (!pendingnode.isEmpty()) {
			
			  // now creating the condtion 
			  // creating the rtefrence of the node 
			  BinaryTreeNode<Integer>front = pendingnode.poll();
			  
			  // now checking the condition 
			  if (front == null) {
				
				  if (pendingnode.isEmpty()) {
					break ; 
				}else {
					System.out.println();
					// now add null ofr the next term 
					pendingnode.add(null) ; 
				}
				  
				  
				  
			}else {
				
				// printing for the left ans right 
				System.out.print(front.data+" ");
				
				//  name = new ();
				if (front.LeftNode != null) {
					// now adding the deta of the left 
					pendingnode.add(front.LeftNode) ; 
				}
				if (front.RightNode != null) {
					// now adding the deta of the left 
					pendingnode.add(front.RightNode) ; 
				}
			}
		}
		  
		  
	  }
	
	
	
	
	
	
	public static void main(String[] args) {
		
	}

}

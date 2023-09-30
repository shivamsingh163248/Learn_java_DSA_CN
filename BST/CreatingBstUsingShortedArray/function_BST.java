package CreatingBstUsingShortedArray;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class function_BST {
	//creating the input function level wise input 
	// creating the function for the printing 
	
	public binaryTreeNode<Integer> takeinput_LevelWise(){
		
		//creating the scanner object 
		Scanner input = new Scanner(System.in) ; 
		// creating the statement for the user dispalay
		System.out.println("enter root");
		// taking the input form the 
		int rootNodeDeta = input.nextInt();
		
		// now check the this is the input -1 
		if (rootNodeDeta == -1) {
			return null ; 
		}
		
		// now store the data in the node 
		
		binaryTreeNode<Integer>root  = new binaryTreeNode<Integer>(rootNodeDeta);
		//after the creating the node 
		// creating the queue using the linklist 
		Queue<binaryTreeNode<Integer>>pendingElement = new LinkedList<binaryTreeNode<Integer>>();
		// now adding the deta in the queue 
		 pendingElement.add(root) ; 
		 
		 
		 // now creating the loop 
		 while (!pendingElement.isEmpty()) {
			 
			 // now creating the refreance of the one node 
			 binaryTreeNode<Integer>rootNode = pendingElement.poll();
			 // after the polling creating the left node and the write node 
			 System.out.println("enter left "+rootNode.data);
			 int LeftNodeData = input.nextInt();
			 
			 // now check the left node is the -1 or not 
			 if (LeftNodeData != -1) {
				
				 // creating the refreance of the node object and store the left node value 
				 binaryTreeNode<Integer>leftNode = new binaryTreeNode<Integer>(LeftNodeData) ; 
				 // now adding the and linking process 
				 rootNode.LeftNode = leftNode ; 
				 // now adding  the element in queues 
				 pendingElement.add(leftNode) ; 
			}
			 
			 // now display the user display for the right node 
			 System.out.println("enter Right: "+rootNode.data);
			 // taking the input form the user 
			 int RightNodeData = input.nextInt();
			 
			 // now creating the condition 
			  if (RightNodeData != -1) {
				// now crating the refrence of the node for the adding the right node 
				  binaryTreeNode<Integer>RightNode = new binaryTreeNode<Integer>(RightNodeData) ; 
				  
				  // now creating the connection 
				  rootNode.RightNode = RightNode ; 
				  // adding in the pending element 
				  pendingElement.add(RightNode) ; 
			}
			
		}
		 
		// now writing the return element 
		 return root ; 
	}
	
	
	// now creating the printing fucntion 
	public void printBST(binaryTreeNode<Integer>root ) {
		
	 // fristly crating the base condtion 
		if (root == null) {
			return  ; 
		}
		
		// printing the root 
		System.out.println("root: "+root.data);
		// now printing the left elemtnt of the root 
		if (root.LeftNode != null ) {
			// now pritnig the root left deta 
			System.out.println("left : "+root.LeftNode.data);
			
		}
		// again creating for the right node 
		if (root.RightNode != null ) {
			System.out.println("right : "+root.RightNode.data);
		}
		
		// creating for the space 
		System.out.println();
		
		// now calling the left side and write side node 
		printBST(root.LeftNode);
		printBST(root.RightNode);
		
	}
	
	
	// now creating the function for the creating bst using the shorted array 
	
	// CREATING ARRAY INPUT 
	public int[] takinputArry() {
		
		// creating array 
		System.out.println("enter the size of the array ");
		Scanner input = new Scanner(System.in) ; 
		int size = input.nextInt();
		// creating the array 
		int[]inputarry = new int[size] ; 
		
		// creating the for loop for the taking the input 
	
		for (int i = 0; i < inputarry.length; i++) {
			 System.out.println("enter the index : "+i);
			int taking_value = input.nextInt() ; 
			 inputarry[i] = taking_value ; 
			
		}
		
		return inputarry ; 
		
	}
	
	// creating the printing function of the array 
   public void printArray(int[]arr) {
	   
	   // simple creating the for loop for the printnig the array 
	   for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	   
	   // creating the for each loop 
//	   for (int i : arr) {
//		System.out.println(arr[i]+" ");
//	}
	   
	   
   }
	
	
	
	
	
	
	// creating the private fucntion  for the supporting the below function 
	private binaryTreeNode<Integer>BSTusingArry(int[]arr , int si , int ei){
		
		System.out.println("staritng   "+ si +" ending : "+ ei );
		
		// creating the base condition 
		if (si>ei) {
			return null ;
		}
		
		// creating the root node for the entering the value 
		// creating the mid value 
		
		int mid = (si+ei)/2 ; 
		
		// this is for the testing purpose 
		System.out.println(" mid  "+ mid + "   mid arry :"+arr[mid]);
		
		binaryTreeNode<Integer>root = new binaryTreeNode<Integer>(arr[mid]) ; 
		
		// now calling the left and right side of the node 
		
		// now printing the for the testing gow actually return  
		
		
		
		
		root.LeftNode = BSTusingArry(arr, si, mid-1) ; 
		root.RightNode = BSTusingArry(arr, mid+1, ei) ; 
		
		return root ; 
		
	}
	
	public binaryTreeNode<Integer>BSTusingShortedArray(int[]arr , int n ){
		
		// calling the above function 
		return BSTusingArry(arr, 0, n-1) ; 
		
		
	}
	

}

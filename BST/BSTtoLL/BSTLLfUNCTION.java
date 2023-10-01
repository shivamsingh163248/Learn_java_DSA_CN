package BSTtoLL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import learn_link_list.link;



public class BSTLLfUNCTION   {

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
	
	// now creating the fucntion of the bst to link list 
	
	
	// now creating the function of the bst to link list that is the return the object 
	public PairLinklist BSTtoLinklistHelper(binaryTreeNode<Integer>root) {
		
		
		// now creating the base condition for the return 
		if (root == null) {
			
			PairLinklist output = new PairLinklist() ; 
			output.head = null ; 
			output.tail = null ; 
			return output ; 
			
		}
		
		// now calling the same function 
		// creating the refrence 
		PairLinklist leftTree = BSTtoLinklistHelper(root.LeftNode) ; 
		
		// now creating the new node of the linklist for the  soring the data and linking with 
		
		LinkListNode<Integer>nodeLinkList = new LinkListNode<Integer>(root.data) ; 
		
		// again creating the right tree refreance of the object 
		 PairLinklist rightTree = BSTtoLinklistHelper(root.RightNode) ; 
		 
		 // creating the new object 
		 PairLinklist output = new PairLinklist() ; 
		 
		 
		 // now creating the condtion 
		 
		 if (leftTree.head != null) {
			 
			 output.head = leftTree.head ;
			 leftTree.tail.next  = nodeLinkList ; 
			
		}else {
			
			output.head = nodeLinkList ; 
		}
		 
		 // now again creatig right 
		 nodeLinkList.next = rightTree.head ; 
		 
		 // again creating the condition 
		 if (rightTree.head == null) {
			
			 output.tail = nodeLinkList ; 
		}else {
			output.tail = rightTree.tail ; 
		}
		 
		
		return output ; 
		
		
	}
	
	
	public  LinkListNode<Integer> constructLinkedList(binaryTreeNode<Integer> root) {

	     // calling the above function 
		PairLinklist ans = BSTtoLinklistHelper(root) ; 
		return ans.head ; 

	     
		}
	
	
	
}

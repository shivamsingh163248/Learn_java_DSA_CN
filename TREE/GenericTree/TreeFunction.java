package GenericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeFunction {

	
	 // now creating the printing function 
	public void printTree(TreeNode<Integer>root) {
		
		// now writing the base case 
		if (root == null) {
			return ; 
		}
		
		// now printing the data 
		System.out.print(root.data+" : ");
		for (int i = 0; i < root.childeren.size(); i++) {
			System.out.print(root.childeren.get(i).data+" ");
		}
		System.out.println();
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			// now creating the refrence of the tree 
			TreeNode<Integer>node = root.childeren.get(i);
			printTree(node);
		}
	}
	
	// creating the function counting the node of the tree 
	// now return the integer 
	public int TotalTreeNode(TreeNode<Integer>root) {
		
		int count = 1 ; 
		
		// now creating the loop 
		for (int i = 0; i < root.childeren.size(); i++) {
			int childcount = TotalTreeNode(root.childeren.get(i));
			System.out.println(childcount+" "+count);
			count += childcount ; 
		}
		return count ; 
		
	}
	
	public int SumTotalTreeNode(TreeNode<Integer>root) {
		
		// creating the for loop 
		int total = root.data ; 
		for (int i = 0; i < root.childeren.size(); i++) {
		//	int number = root.childeren.get(i).data ;  
			int number = SumTotalTreeNode(root.childeren.get(i)) ; 
			total += number ; 
		}
		return total ; 
	}
	
	// creating the function takining the input levelwise 
	
	public TreeNode<Integer>root TaingInputLevelWiseTree(){
		
		// now creating the scanner function  
		Scanner input = new Scanner(System.in) ; 
		// enter the root and display 
		System.out.println("ente the root : ");
		 int rootData = input.nextInt() ; 
		 //now checking the element    
		 if (rootData == -1) {
			return null ; 
		}
		 
		 // now creating the root node
		 TreeNode<Integer>root = new TreeNode<Integer>(root.data) ; 
		 // now creating the queue 
		 Queue<TreeNode<Integer>>pendingNode = new LinkedList<TreeNode<Integer>>() ; 
		 pendingNode.add(root) ; 
		 
		 // now creating the loop and adding the children node in the queue 
		 
		 while (!pendingNode.isEmpty()) {
			
			 // now poll the node 
			 TreeNode<Integer>front = pendingNode.poll() ; 
			 // now user display of the number of the node 
			 System.out.println("enter the no of children "+front.data);
			 int childrenSize = input.nextInt();
			 
			 // now creating the loop 
			 for (int i = 0; i < childrenSize; i++) {
				 
				 // creating the child input 
				 System.out.println(front.data+" children "+i+":");
				 int childNodeData = input.nextInt();
				 // now creting the node 
				 TreeNode<Integer>childnode = new TreeNode<Integer>(childNodeData) ; 
			// now adding in the row 
				 pendingNode.add(childnode);
				 // now creating the connection 
				  
				 
				  
				    
				 
				 
			}
		}
		 
	}
}

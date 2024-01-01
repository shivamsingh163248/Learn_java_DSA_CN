package sum.linklist;

import java.util.Scanner;

public class Method {
	
	
	// printing the linklist 
	public void print(ListNode node) {
		
		// now printing the node 
		
		ListNode head  = node ; 
		
		while (head != null) {
			
			System.out.println(head.val+" ");
			head = head.next ; 
			
		}
		
//		node = node.next ; 
//		System.out.println(node.val+" ");
//			node = node.next ; 
//			System.out.println(node.val+" ");
//			node = node.next ; 
//			System.out.println(node.val+" ");
//			node = node.next ; 
//			System.out.println(node.val+" ");
		
		
	}
	
	public ListNode revesing(ListNode node) {
		
		// creating the object of the list node 
		// creating the using recussrison 
		
		if (node.next == null) {
			
				ListNode output = 	new ListNode(node.val) ; 
				output.next = null ; 
				return output ; 
		}
		
		
		
		
		
		
		
		ListNode output =   revesing(node.next) ; 
		
		ListNode small = new ListNode(node.val) ; 
		small.next = output ; 
		return small ; 
		
		
	
	  
		
		
	}
	
	// now creating the linklist 
	
	public ListNode insert() {
		
	 // taking the user input 
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in) ; 
		int n = input.nextInt();
		// creating the object of the node 
		// creating the condition if -1 then output 
		ListNode head = null ; 
		ListNode tail = null ; 
		
		
		while (n != -1) {
			
		  // creating the object of the list node 
			ListNode currentNode = new ListNode(n) ; 
			
			
			if (head == null) {
			 
				head = currentNode  ; 
				tail = currentNode ; 
				
				
				
			}else {
				// now upgreade the vlaue 
				tail.next = currentNode ; 
				tail = currentNode ; 
				
			}
			// now 
			System.out.println("enter the number");
			
			n = input.nextInt();
			 
			
			
			
		}
		return head ; 
		
	}
	
	
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        
	        
	        int carry = 0 ; 

	        while(l1 != null && l2 != null){
	         
                  
	             
	         l1 = l1.next ;
	         l2 = l2.next ; 
	        } 
	         return l1 ; 
	    }

}

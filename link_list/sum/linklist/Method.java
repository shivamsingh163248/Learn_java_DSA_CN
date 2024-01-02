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
	
	public ListNode revesing(ListNode node  , ListNode head) {
		
		if (node == null) {
			return null ; 
		}
		
		// now calling the function 
		
		revesing(node.next, head);
		return node ; 
		
	}
	
	// now creating the linklist 
	
	// creating the reversing the link list 
	public ListNode reversing(ListNode node) {
		
		// creating the refrance of list node 
		
		ListNode head  = null; 
		ListNode tail = null  ; 
		
		while (node != null) {
			
		head = new ListNode(node.val) ; 
		head.next = tail ; 
		tail = head ; 
		
		node = node.next ; 
			
						
		}
		return  head; 
		
	}
	
	
	// creating the reversing function in build without creating the any object 
	public ListNode revese(ListNode node) {
		// creating the three node 
		ListNode currentNode = node ; 
		ListNode privesNode = null ; 
		ListNode nextNode = null ; 
		
		// now creating the loop 
		while (currentNode != null) {
			
			nextNode = currentNode.next ; 
			currentNode.next = privesNode ; 
			privesNode = currentNode ; 
			currentNode = nextNode ; 
		}
		
		return privesNode ; 
	}
	
	
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

package sum.linklist;

import java.util.Scanner;

public class Method {
	
	
	// printing the linklist 
	public void print(ListNode node) {
		
		// now printing the node 
		
			System.out.println(node.val+" ");
			node = node.next ; 
			System.out.println(node.val+" ");
			node = node.next ; 
			System.out.println(node.val+" ");
			node = node.next ; 
			System.out.println(node.val+" ");
		
		
	}
	
	public ListNode revesing(ListNode node) {
		
		// creating the object of the list node 
		// creating the using recussrison 
		
		if (node == null) {
			return null ; 
		}
		
		
		ListNode output =   revesing(node.next) ; 
			 // now creating the algorithum 
		// creating the new 
		ListNode samllout = new ListNode(node.val) ; 
	      samllout.next = output ; 
		return samllout ; 	
		
		
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
			
			head = new ListNode(n) ; 
			System.out.println("enter the number");
			 n = input.nextInt();
			 head.next = tail ; 
			 tail = head ; 
			
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

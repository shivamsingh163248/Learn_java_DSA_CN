package sum.linklist;

import java.util.Scanner;

public class Method {
	
	
	// printing the linklist 
	public void print(ListNode node) {
		
		// now printing the node 
		
		ListNode head  = node ; 
		
		while (head != null) {
			
			System.out.print(head.val+" ");
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
	public ListNode samerevese(ListNode node) {
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
		  
		  // First we are reversing the node 
		 ListNode node1 =  samerevese(l1);
		 ListNode node2 = samerevese(l2) ; 
		 
		 // now creating the new node 
		 ListNode head  = null; 
			ListNode tail = null  ; 
			int carry = 0  ; 
		 
		 // creating the loop for the first node 
		 while (node1 != null && node2 != null) {
			
			 // we are the getting the reminder 
			 int a = node1.val ; 
			 int b = node2.val ; 
			 
		 int remainder = (a+b+carry)%10 ;
		 // creating the reversion problem 
		 // creating the 
		
		 head = new ListNode(remainder) ; 
		 carry = (a+b+carry)/10 ; 
			head.next = tail ; 
			tail = head ; 
			
			node1 = node1.next ; 
			node2 = node2.next ; 
			
			
			
			 
			 
		}
		 
		 
		 // now creating the codtion 
		 if (node1 != null) {
			
			 while (node1 != null ) {
					
				 // we are the getting the reminder 
				 int a = node1.val ; 
				
				 
			 int remainder = (a+carry)%10 ;
			 // creating the reversion problem 
			 // creating the 
			
			 head = new ListNode(remainder) ; 
			 carry = (a+carry)/10 ; 
				head.next = tail ; 
				tail = head ; 
				
				node1 = node1.next ; 
				 
				
				
				
				 
				 
			}
			 
			 
		}
		 
		 if (node2 != null) {
				
			 while (node2 != null ) {
					
				 // we are the getting the reminder 
				 int b = node2.val ; 
				
				 
			 int remainder = (b+carry)%10 ;
			 // creating the reversion problem 
			 // creating the 
			
			 head = new ListNode(remainder) ; 
			 carry = (b+carry)/10 ; 
				head.next = tail ; 
				tail = head ; 
				
				
				node2 = node2.next ; 
				
				
				
				 
				 
			}
			 
			 
		}
		 
		 if (carry > 0) {
			 head = new ListNode(carry) ;
			 head.next = tail ; 
				tail = head ; 
				carry = 0 ;
		}
		 
		 
		  
		  
		return head;
	        
	
		  
	        
	  }

}

package takeinput_recursively;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class mergeshoeting_lisnklist {
	
public static node<Integer> takeinput (){
		
		// creatng the scanner 
		Scanner input = new Scanner(System.in) ; 
		// taking the input 
		int data = input.nextInt() ; 
		
		// now creating the reference of the node 
		node<Integer>head = null , tail = null ; 
		
		// creating the while loop for the taking the input 
		while (data != -1 ) {
			
			
			// calling the node class for the making object taht are the creating the node refreance 
			node<Integer> current = new node<Integer>(data) ; 
			
			// creating the if else condation for the set the value in the link list 
			if (head == null ) {
				head = current ; 
				tail = current ; 
				
			}else{
				// this is the condation of the not null of the head 
				// now we are the set value of the next 
				tail.next = current ; 
				tail = current ; 
			}
			data = input.nextInt() ; 
			
		}
 return head ; 
	}
	
	
	// creating the print function 
public static void print(node<Integer>head) {
		
		
		// creating the print function for the solving the fucntion 
		// creating the while fucntion 
		// creating the tamp function 
		System.out.println();
		node<Integer>temp = head ; 
		while (temp != null ) {
			// now printing the data of the value 
			System.out.print(temp.data + " ");
			// now next address store in the same 
			// head = head.next ; 
			temp  = temp.next ; 
		}
		System.out.println();
	}

// now creating the method of the two link list merge 
 public static node<Integer> margeTwoLinkList(node<Integer>head1 , node<Integer>head2){
	 
	 // if the any lisnk list is null 
	 if (head1 == null ) {
		return head2 ; 
	}
	 if (head2 == null ) {
		return head1 ; 
	}
	 
	 
	 // frist we are the taking the copy of the refrence 
	 node<Integer>linklist1 = head1 , linklist2 = head2 ; 
	 // creating the head and tail null refreance 
	 node<Integer>head = null , tail = null ; 
	 
	 // check the data which is the big one 
	 if (linklist1.data >= linklist2.data) {
		head = linklist2 ; 
		tail = linklist2 ; 
		linklist2 = linklist2.next ; 
	}else {
		// creating the next condation for the making the head 
		head = linklist1 ; 
		tail = linklist1 ; 
		linklist1 = linklist1.next ; 
		
	}
	 
	 // creating the while loop for the 
	 while (linklist1 != null && linklist2 != null  ) {
		 
		 // again check the condation of the deta 
		 if (linklist1.data <= linklist2.data ) {
			 tail.next = linklist1 ; 
			 tail = linklist1 ; 
			 linklist1 = linklist1.next ; 
			
		} else {

			// if these condition fail 
			tail.next = linklist2 ;
			tail = linklist2 ; 
			linklist2 = linklist2.next ; 
		}
		
	}
	 
	 // when the condition fail 
	 if (linklist1 != null ) {
		
		 // now creating the tail next attach whith dema 
		 tail.next = linklist1 ; 
	}else {
		tail.next = linklist2  ; 
	}
	 
	 // now return head ; 
	 return head ; 
	 
	 
	 
 }
 
 public static node<Integer> midpont (node<Integer>head){
	 // creating the slow and fast node refreance 
	 node<Integer>slow = head ; 
	 node<Integer>fast = head ; 
	 
	 // now creating the condation 
	 if (head == null || head.next == null ) {
		return head ; 
	}
	 
	 // creatin the loop 
	 while (fast.next != null && fast.next.next != null ) {
		 slow = slow.next ; 
		 fast = fast.next.next ; 
		
	}
	 return slow ; 
	 
 }
 
 // creating the merge shoeting function 
 public static node<Integer>meregeshorting(node<Integer>head){
	 
	 // creating the dubplicate refreance 
	 if (head == null || head.next == null ) {
		return head ; 
	}
	 
	 // creating the refreance 
	 node<Integer>midpoint = midpont(head) ; 
	 node<Integer>head1 = head , head2 = null ; 
	 
	 head2 = midpoint.next ; 
	 midpoint.next = null ; 
	 // now calling the dsame function 
	 
//	 System.out.println("print head 1 and 2"); 
//	 print(head1);
//	 print(head2);
	 
	 
	 
	 
	 
	 node<Integer>linkLIstHead1 = meregeshorting(head1) ; 
	 node<Integer>linkLIstHead2 = meregeshorting(head2);
	 
	 // now merging 
	 node<Integer>newhead = margeTwoLinkList(linkLIstHead1, linkLIstHead2);
	 return newhead ; 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling the input function node
		node<Integer>takeinput = takeinput() ; 
		node<Integer>midpoint = midpont(takeinput) ; 
		print(midpoint);
		
		
		 node<Integer>shortedlinklist =  meregeshorting(takeinput);
		 print(shortedlinklist);

	}

}

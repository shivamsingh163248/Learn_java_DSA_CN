package takeinput_recursively;

import java.util.Scanner;

public class print_revers_recorsion {
	public static node<Integer> takeinput(){
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		
		int data = input.nextInt();
		
		// creating the blank rereave of the node class 
		node<Integer> head = null , tail = null ; 
		
		// creating the while loop for thataking thei nput 
		while (data != -1) {
			node<Integer>currentnode = new node<Integer>(data) ; 
			
			// creating the condation 
			if (head == null ) {
				head = currentnode ; 
				tail = currentnode ; 
			} else {

				// if the node  is null 
				tail.next = currentnode ; 
				tail = currentnode ; 
				
			}
			data = input.nextInt() ; 
		}
		return head ; 

	}
	
	// now creating the print function 
	public static void print(node<Integer>head) {
		// creating the print function 
		// creting the while loop 
		// creating the copy ]
		System.out.println();
		node<Integer>temp = head ; 
		while (temp != null ) {
			System.out.print(temp.data + " " );
			// now next address store in the currrent 
			temp = temp.next; 
		}
		System.out.println();
	}
	
	// now again creating the recoresion fucntion 
	public static node<Integer>setvalue(node<Integer>head , int pos ){
		// creating the base value 
		if (head.next == null && pos > 0) {
			return head ; 
		}
		
		// creating the calling function 
		if (pos == 0 ) {
			// creating the new obejct 
		//	node<Integer>currentnode = new node<Integer>(value) ; 
			// now set the address
			head = head.next ; 
			return head ; 
			
			
			
		}else {
			// hear using the recrsion function 
			// frist calling the function 
			// System.out.println(head.data +" above" + head);
			print(head);
			System.out.println();
			
		head.next = 	setvalue(head.next, pos-1) ; 
		// System.out.println(head.data +" after" + head );
		System.out.println();
		print(head);
		return head ; 
			
		}
	}
	// creating the recorsion function 

	 public static node<Integer>reversingprinting(node<Integer>head){
		 // creating the base function for the solving 
		 
		 if (head == null || head.next == null) {
			return head ; 
		}
		 
		 // now calling the function and the writing the algorithum 
		 
		node<Integer>curr =  reversingprinting(head.next) ; 
		// changed the head node 
		print(curr);
		print(head);
//		head.next.next = head ; 
//		head.next = null ; 
//		print(curr);
//		print(head);
		return curr ; 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling the function for the taking the input from the user 
		node<Integer>input = takeinput() ; 
		reversingprinting(input) ; 
	}

}

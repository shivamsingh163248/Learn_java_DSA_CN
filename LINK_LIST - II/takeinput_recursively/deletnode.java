package takeinput_recursively;

import java.util.Scanner;

public class deletnode {
	
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
		node<Integer>temp = head ; 
		while (temp != null ) {
			System.out.print(temp.data + " " );
			// now next address store in the currrent 
			temp = temp.next; 
		}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		node<Integer>shivam = takeinput() ; 
		System.out.println();
		print(shivam);
		System.out.println();
		node<Integer>newnode = setvalue(shivam, 3) ; 
		print(newnode);
	}

}

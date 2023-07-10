package takeinput_recursively;

import java.util.Scanner;

public class setvalue_linklist {
	
	// creating the function for the takng the input for the user 
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
			System.out.println(temp.data);
			// now next address store in the currrent 
			temp = temp.next; 
		}
	}
	
	// now again creating the recoresion fucntion 
	public static node<Integer>setvalue(node<Integer>head , int pos , int value){
		// creating the base value 
		if (head == null && pos > 0) {
			return head ; 
		}
		
		// creating the calling function 
		if (pos == 0 ) {
			// creating the new obejct 
			node<Integer>currentnode = new node<Integer>(value) ; 
			// now set the address 
			currentnode.next = head  ; 
		
			return currentnode ; 
		}else {
			// hear using the recrsion function 
			// frist calling the function 
			System.out.println(head.data +" above" + head);
			
		head.next = 	setvalue(head.next, pos-1, value) ; 
		System.out.println(head.data +" after" + head );
		return head ; 
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling the 
		node<Integer>shivam = takeinput() ; 
		System.out.println();
		print(shivam);
		System.out.println();
		node<Integer>newnode = setvalue(shivam, 3, 98) ; 
		print(newnode);

	}

}

package takeinput_recursively;

import java.util.Scanner;

// creating the new calss 
  class doublenode{
	
	node<Integer>head ; 
	node<Integer>tail ; 
	
	// creating the constructor for the creating the link list 
	public doublenode(node<Integer>head , node<Integer>tail ) {
		// TODO Auto-generated constructor stub
		this.head = head ; 
		this.tail = tail ; 
	}
	
	// now again creating the the blank constocter 
	
	public doublenode() {
		// TODO Auto-generated constructor stub
	}
	
}

public class REVERAE_PAIR {
	
	// now creating the takeinput function for the taking the input vlaue 
	
	public static node<Integer>takeinput(){
		Scanner input = new Scanner(System.in) ; 
		// taking the inpput 
		int data = input.nextInt() ; 
		// creating the null refrence of the class 
		node<Integer>head = null , tail = null ; 
		// creating the while loop for the itreting 
		while (data != -1 ) {
			// set the value of data in the node so calling the constocter 
			node<Integer>currentnodeNode = new node<Integer>(data) ; 
			
			if (head == null ) {
				
				// now making the head value 
				head = currentnodeNode ; 
				tail = currentnodeNode ; 
				
			} else {
				
				tail.next = currentnodeNode ; 
				tail = currentnodeNode ; 

			}
			// takeing the input from the user for the set the data 
			data = input.nextInt() ; 
		}
		return head  ; 
	}
	
	
	// creating the recorson function 
	
	public static doublenode revrese_print_linklist (node<Integer>head) {
		
		// now frist we are the creating the base condation for the 
		doublenode shivam  ; 
		if (head == null || head.next == null ) {
			
			shivam = new doublenode()  ; 
			System.out.println(shivam);
			shivam.head = head ; 
			shivam.tail = head ; 
			return shivam ; 
			
		}
		// now again the calling the function same functiom 
		
		doublenode itisha  = revrese_print_linklist(head.next) ; 
		
		print(itisha.tail);
		print(itisha.head);
		
		
		itisha.tail.next = head ; 
	    head.next = null ; 
	    
	    // now creating the new addressing of the shivam 
	    
	  
	    
	    shivam = new doublenode() ;
	    System.out.println(shivam);
	    
	    
	    print(shivam.head);
	    print(itisha.head);
	    
	    
	    shivam.head = itisha.head ; 
	    shivam.tail = head ; 
	    return shivam ; 
		
	}
	
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



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now calling the function 
		node<Integer>input = takeinput() ; 
		// now calling the function of the 
		doublenode result = revrese_print_linklist(input) ; 
		// now printing node of the link list 
		print(result.head);
		print(result.tail);
	}

}

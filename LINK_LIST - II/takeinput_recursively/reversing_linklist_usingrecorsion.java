package takeinput_recursively;

import java.util.Scanner;

public class reversing_linklist_usingrecorsion {
	
	// creating the taking input function for the solving 
	public static node<Integer> takeinput(){
		
		// creating the scanner function 
		// now crating the scanner functioon 
		Scanner input = new Scanner(System.in) ; 
		// take a input from the user 
		int data = input.nextInt();
		// creating the node clas referenace 
		node<Integer>head = null , tail  = null ; 
		// now crating 
		while (data != -1 ) {
			// now creating the the class reference 
			node<Integer>currentnode = new node<Integer>(data) ; 
			
			// creating the codation of the loop 
			if (head == null) {
				// now the set the value 
				head = currentnode ; 
				tail = currentnode ; 
			}else {
				// if the head is the not null the we are the using the different approach 
				tail.next  = currentnode ; 
				tail = currentnode ; 
				
				
			}
			// now again the value  
			 data = input.nextInt() ; 
			 // this the take input form 
			
		}
		// now we are the the function return 
		return head ; 
	}
	
	// Creating the function 
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
	
	// creating the value 
	public static node<Integer> revernodedprinting(node<Integer>head){
		// now writing the base condation of this method 
		
		if (head == null || head.next == null ) {
			
			// now returning the value when the follow the value 
			return head ; 
			
		}
		// calling the same function for the setup 
		node<Integer>curr = revernodedprinting(head.next) ; 
		// when this function reach the final value and returning the head final link list 
		// agian creating the new refreance 
		node<Integer>small_head = curr ; 
		
		// now creating the final link list 
		while (small_head.next != null ) {
			small_head = small_head.next ; 
		}
		// now final current value set up head 
		small_head.next = head ; 
		head.next = null ; 
		return curr ; 
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the function  of the value 
		node<Integer>shivam = takeinput();
		print(shivam);
	node<Integer>reversing = 	revernodedprinting(shivam) ; 
	// again we are the printing the value 
	print(reversing);
		
		
		
		
		

	}

}

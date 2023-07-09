package print_recusive;

import java.util.Scanner;

public class link_list_recoresen_node {

	// creating the static function fo the taking the list and then creating the print function 
	 public static node<Integer> takeinput(){
		 
		 // creating the scanner object for the taking input value in the takeinput in the link list \
		 Scanner input = new Scanner(System.in) ; 
		 
		 // now creating the take the input 
		 int data = input.nextInt() ; 
		 
		 // creating the loop function for the taking the input continusely 
		 
		 // taking the input in head 
		 node<Integer> headNode = null , tail = null ; 
		 
		 // creating the while loop when data are the null 
		 while (data != -1) {
			
			 // creating the if for the head node 
			 // creating the new node 
			 node<Integer>current_node = new node<Integer>(data); 
			 if (headNode == null) {
				// now set the value 
				headNode = current_node ; 
				tail = current_node ; 
			}else {
				tail.next = current_node ; 
				tail = current_node ; 
			}
			 // creating the scanner function for the taking the input valu 
			 data = input.nextInt() ; 
			 
		}
		 // now hearing the return function 
		 return headNode ; 
		 
	 }
	
	
	public static void main(String[] args) {
		
	}
	
	
}

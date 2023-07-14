package midpoint_linklist;

import java.util.Scanner;



public class midpoint {
	
	// creating the taking input function and creating print function for the link list 
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


// now creating the mid point function 
public static node<Integer>midnode(node<Integer>head){
	
	// creating the noraml condation  
	if (head == null || head.next == null ) {
		return head ; 
	}
	
	// now creating the slow and fast refreance 
	node<Integer>slow = head ; 
	node<Integer>fast = head ; 
	
	// now creating the while loop 
	while (fast.next != null && fast.next.next != null ) {
		slow = slow.next ; 
		fast = fast.next.next ; 
		
	}
	
	// now return head 
	 
	head = slow ; 
	head.next = null ;
	return head ; 
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now calling the function for the taking the input 
		node<Integer> result = takeinput(); 
		// calling the mid point 
		node<Integer>midpointnode = midnode(result) ; 
		print(midpointnode);
		
	}

}

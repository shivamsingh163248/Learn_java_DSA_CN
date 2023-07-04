package linklist_takeinput;

import java.util.Scanner;

public class test {

	
	// now creating the increment function 
	public static void print(node<Integer>head ) {
		// first creating the dublic care 
		node<Integer>itisha = head ; 
		
		// now printing the each of the reference 
		while (itisha != null ) {
			System.out.println(itisha.date);
			itisha = itisha.next ; 
		}
	}
	
	public static node<Integer>takeInput(){
		// creatig the scanner function 
		Scanner shivam = new Scanner(System.in) ; 
		int data = shivam.nextInt() ; 
		
		// Creating the  HEAD 
		node<Integer>head = null ; 
		// now creating 
		while (data != -1 ) {
			// now creating the node 
			node<Integer>currentNode = new node<Integer>(data) ; 
			// now linking prcess 
			if (head == null) {
				head = currentNode ; 
			}else {
				// again creating the again another refreance 
				node<Integer>tail = head ;
				while (tail.next != null) {
					tail = tail.next ; 
				}
				tail.next = currentNode ;	 
			}
			
			data = shivam.nextInt(); 
		}
		return head ;
		
	} 
	
	// CREATING THE NEW FUNCTIONO OF THE OPTMIZAING 
	public static node<Integer> takeinput(){
	 // now creating the object refrence 
		// frist creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		int shivam = input.nextInt() ; 
		// creating the object 
	//	node<Integer>head = new node<Integer>(shivam) ; 
		
		//creating the node 
		node<Integer>head = null , tail = null ; 
		// now creating the while loop 
		while (shivam != -1) {
			// now creating the object 
			node<Integer>currentNode = new node<Integer>(shivam) ; 
			if (head == null) {
				head = currentNode ; 
				tail = currentNode ; 
			}else {
				tail.next = currentNode ; 
				tail = currentNode ; 
			}
			shivam = input.nextInt() ; 
		}
		return head ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		node<Integer>n1 = new node<Integer>(20) ; 
//		System.out.println(n1.next);
//		System.out.println(n1);
//		node<Integer>n2 = new node<Integer>(30) ; 
//		n1.next = n2 ;
//		System.out.println(n1.next);
//		System.out.println(n2);
//		node<Integer> n1 = new node<Integer>(23);
//		node<Integer>shivam = n1 ; 
//		System.out.println(shivam);
//		System.out.println(n1);
		// calling the function 
		node<Integer>itisha = takeInput() ; 
		print(itisha);
	//	System.out.println(itisha.next.date);
		// agaon ccalling the another function 
		node<Integer>itisha_shivam = takeinput();
		print(itisha_shivam);

		
	}

}

package insurtnode;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class insurt_node {
	
	// creating the increment function 
	// creating the print function 
	// creting the takeinnput function 
	public static  void print(node<Integer>head ) {
		//copy the refrence of the onject 
		node<Integer>temp = head ; 
		// creating the loop when its finding the null 
		while (temp != null) {
			// creating the print function 
			System.out.println(temp.data);
			temp = temp.next ; 
		}
		
	}
	// now creating the print function 
	public static node<Integer> takeinput(){
		// hear return the object reference  so fist creating the object refrence 
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		// now creating the input 
		int data = input.nextInt() ; 
		
		// creatng the refrence of the object 
		node<Integer>head = null , tail = null ; 
		
		// creating the while function 
		while (data != -1) {
			
			// creating the object 
			node<Integer>currentNode = new node<Integer>(data) ; 
			// creating the codation when head null 
			if (head == null) {
				head = currentNode ; 
				tail = currentNode ; 
			}else {
				tail.next = currentNode ; 
				tail = currentNode ; 
			}
			data = input.nextInt() ; 
			
		}
		return head ;
	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now test the function 
		node<Integer>itisha = takeinput() ; 
		print(itisha);

	}

}

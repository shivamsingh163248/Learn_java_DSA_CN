package pelindorm.check;

import java.util.Scanner;

public class pelindromeFunction {
  
	 // creating the fuction for the taking the input 
	public LinklistNode<Integer> takinginput(){
		
		// now inisilzed the 
		LinklistNode<Integer>head  = null , tail = null ;  
		// creating the loop for the intput 
		Scanner input = new Scanner(System.in);
		
		// creating the condition -1  
		// creating the loop 
		int num = input.nextInt();
		
		
		while (num != -1) {
		
			// now creating the refrence of the linklist
			
				LinklistNode<Integer>node = new LinklistNode<Integer>(num) ; 
				if (head == null) {
					head = node ; 
					tail = node; 
				}else {
					tail.next = node ; 
					tail = node ; 
					 
				}
				
				num = input.nextInt();
			
			
			
			
			
		}
		return head ; 
		
	}
	
	
	
	// creating the function for the pelindrone check 
	
	// creating the function for the find the check the length 
	public int linklistlength(LinklistNode<Integer>head) {
		
		int n = 0 ;
		// creating the loop 
		if (head == null) {
			return n ; 
		}
		
		
		while (head != null) {
			n++ ; 
			head = head.next ; 
		}
		
		return n ; 
		
	}
	
	
	// now checking the pelindrone 
	public boolean chekpelindrome(LinklistNode<Integer>head) {
		
		// frist copying the addres 
		LinklistNode<Integer>copyNode = head ; 
		// now finding the meddile of the node 
		int mid = linklistlength(head) /2 ; 
		
		// after finding the mid 
		// now creating the loop
		for (int i = 0; i < mid; i++) {
			System.out.println(head.data);
			 head = head.next ;
			 
			 
		}
		boolean check = true ; 
		// now checking 
		for (int i = 0; i < mid; i++) {
			
			System.out.println(copyNode.data +"  "+ head.data);
			if (copyNode.data == head.data && check == true) {
				check = true ; 
			}else {
				check = false ; 
			}
			
			copyNode = copyNode.next ; 
			head = head.next ; 
		}
		
		return check ; 
		
		
	}
	
	
	
	
}

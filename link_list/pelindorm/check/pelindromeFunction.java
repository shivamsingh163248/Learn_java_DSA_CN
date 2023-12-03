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
	
	
}

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
	
	
	// creating the insurt function 
	public static node<Integer> insurt(node<Integer>head , int pos , int value){
		
		// CREATING THE COPY of the head 
		node<Integer>temp = head ; 
		// xreaing nodw witch are the insurted 
		node<Integer>nodeInsureted = new node<Integer>(value) ; 
		// now we are taking about the adding the value at point 0 
		if (pos == 0 ) {
			nodeInsureted.next = temp ; 
			temp = nodeInsureted ; 
			
		}else {
		
		
		
		
		int count = 0 ; 
		
		while (count < pos-1 && temp != null) {
			count++ ;
			temp = temp.next ;
			
		}
		
		// after the value 
		// if condation writing due to null ponter exception null.next value given null pointer exception 
		 
		if (temp != null ) {
			
		
		nodeInsureted.next = temp.next ; 
		temp.next = nodeInsureted ; 
		 
		}
		}
		
		
		
		return head;
		
	}
	
	
	
	public static boolean isPalindrome_2(node<Integer> head){
		 
	    if(head==null || head.next==null)return true;
	    node mid=findmid(head);
	    node right=reverse(mid);
	    node left=head;
	        while(right!=null){
	            if(left.data!=right.data){
	                return false;
	            }
	            left=left.next;
	            right=right.next;
	        }
	        return true;
	    
	}

	static node<Integer> findmid(node<Integer> head){
		node slow=head;
		node fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow; 
	}

	    static node<Integer> reverse(node<Integer> head){
	    	node prev=null;
	    	node cur=head;
	        while(cur!=null){
	        	node afnode=cur.next;
	            cur.next=prev;
	            prev=cur;
	            cur=afnode;
	        }
	        head=prev;
	        return head;
	    }    
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now test the function 
		node<Integer>itisha = takeinput() ; 
		// print(itisha);
		System.out.println(isPalindrome_2(itisha));
	}

}

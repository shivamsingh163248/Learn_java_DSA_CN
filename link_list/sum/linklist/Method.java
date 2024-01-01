package sum.linklist;

public class Method {
	
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        
	        
	        int carry = 0 ; 

	        while(l1 != null && l2 != null){
	         

	             
	         l1 = l1.next ;
	         l2 = l2.next ; 
	        } 
	         return l1 ; 
	    }

}

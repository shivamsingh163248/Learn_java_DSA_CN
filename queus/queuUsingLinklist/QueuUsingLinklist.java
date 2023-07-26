package queuUsingLinklist;

public class QueuUsingLinklist {
	
	// creating the function of the printing the linklist 
	
	public static  void print(node<Integer> head ) {
		
		// when queu is not null the printing the queu 
		// creating the node 
		node<Integer> temp  = head; 
		
	while (temp != null) {
		// now printing the variable 
		
		System.out.print(temp.data+ "  ");
		// creating the next to next 
		
		temp = temp.next ; 
		
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object for the insurting thevalue in inque
		
		LinklistQueue<Integer>shivam = new LinklistQueue<>();
		
		// creating the in queu 
		shivam.inqueu(25);
		shivam.inqueu(26);
		shivam.inqueu(27);
		shivam.inqueu(28);
		shivam.inqueu(29);
		
		// now creating the printing function 
		
		print(shivam.front());
		

	}

}

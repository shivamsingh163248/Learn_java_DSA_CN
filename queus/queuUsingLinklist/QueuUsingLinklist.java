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

	public static void main(String[] args) throws blnakQueu {
		// TODO Auto-generated method stub
		
		// creating the object for the insurting thevalue in inque
		
		LinklistQueue<Integer>shivam = new LinklistQueue<>();
		
		// creating the in queu 
		shivam.inqueu(25);
		shivam.inqueu(26);
		shivam.inqueu(27);
		shivam.inqueu(28);
		shivam.inqueu(29);
		System.out.println();
		
		// now creating the printing function 
		
		// print(shivam.front());
		// now printing the size of the linklist 
		System.out.println();
		System.out.println(shivam.size);
		
	// printing the front elemeth 
		System.out.println(shivam.front());
		// creaitng the deque for the testing 
		System.out.println(shivam.deque());
		System.out.println(shivam.front());
		

	}

}

package learn_link_list;

public class link {
	
	// creating the function for the set up link list 
	public  static node<Integer> linklist(){
		
		// creating the object of the different differnt node 
		node<Integer>n1 = new node<Integer>(20);
		node<Integer>n2 = new node<Integer>(70);
		node<Integer>n3 = new node<Integer>(23);
		node<Integer>n4 = new node<Integer>(26);
		
		// now creating the link bewtween node 
		n1.next = n2 ; 
		n2.next = n3 ; 
		n3.next = n4 ; 
		System.out.println(n1.next);
		System.out.println(n2);
		System.out.println(n2.next);
		
		return n1 ; 
	}
	// now i am using the print function 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling the function 
		node<Integer>n1 = new node<Integer>(20) ; 
		
		// how thw print of the adddress of this node 
		System.out.println(n1);
		// now check the printing of the deta 
		System.out.println(n1.data);
		System.out.println(n1.next);
		
		// creating the refreace of the object 
		node<Integer>head = linklist() ; 
		// now printing the node with the head 
		System.out.println(head.data);
		// find the value of the next value 
		System.out.println(head.next.data);
		System.out.println(head.next.next.data);
		System.out.println(head.next.next.next.next);
		

	}

}

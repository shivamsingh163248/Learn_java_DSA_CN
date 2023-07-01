package incement_link_list;

public class test_increment_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the constocter 
		
		node<Integer>n1 = new node<Integer>(20) ; 
		//-----------------------------------------------------------------
		node<Integer>n2 = new node<Integer>(24) ; 
		
		// set the address 
		n1.next = n2 ; 
		
		System.out.println(n1.next);
		System.out.println(n2);

		// now set the deta 
		n1.data  = 30 ; 
		System.out.println(n1.data);
	}

}

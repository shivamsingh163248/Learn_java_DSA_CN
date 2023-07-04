package incement_link_list;

public class test_increment_list {
	
	// creating the link list function for the solving 
	public static node<Integer>linklsit(){
		
		// creating the object different 
		node<Integer>n1 = new node<Integer>(20) ; 
		node<Integer>n2 = new node<Integer>(32) ; 
		node<Integer>n3 = new node<Integer>(67);
		node<Integer>n4 = new node<Integer>(45);
		
		// now linking the node with the each other 
		n1.next = n2 ; 
		n2.next = n3 ; 
		n3.next = n4 ; 
		
		// now return the main function 
		return n1 ; 
	}
	
	// now print the function 
	public static  void print(node<Integer>head ) {
		// creating the print function 
		node<Integer>itisha = head ; 
		// creating the function 
		while (itisha != null) {
			System.out.println(itisha.data);
			 itisha = itisha.next ;  // 
		}
	}
	
	// now creating the increment function 
	public static void increment(node<Integer> itisha) {
		
		// creating the increment function 
		while (itisha != null) {
			itisha.data++ ;
			itisha = itisha.next ; 
		}
		while (itisha != null) {
			itisha.data++ ;
			itisha = itisha.next ; 
		}  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the constocter 
//		
//		node<Integer>n1 = new node<Integer>(20) ; 
//		//-----------------------------------------------------------------
//		node<Integer>n2 = new node<Integer>(24) ; 
//		
//		// set the address 
//		n1.next = n2 ; 
//		
//		System.out.println(n1.next);
//		System.out.println(n2);
//
//		// now set the deta 
//		n1.data  = 30 ; 
//		System.out.println(n1.data);
		
		// 
		node<Integer>itisha = linklsit() ; 
		// calling the print function 
		print(itisha);
		increment(itisha);
		System.out.println();
		print(itisha);
		
	}

}

package queuUsingLinklist;





public class LinklistQueue <T>{ // using the generic 

	
	// CREATING a deta type of the node 
	// creating the both is the private access modifire 
	
	private node<T> front ; 
	private node<T> rear ;
	int size  ; 
	
	
	// now creating the constructor 
	
	// creating the constocter
	
	LinklistQueue(){
		// now set the deta of the front and rear 
		
		front =  null ; 
	   rear =  null ; 
	   size = 0 ; 
	}
	
	// now creating the function of the isEMPTY 
	
	public boolean isEmpty () {
		
		return size == 0 ; 
	}
	
	
	// now creating the function of the size 
	
	public int size () {
		return size ; 
	}
	
	// now creating the function 
	
	public void inqueu (T ele) {
		
		// creating the new node elent se in the boject 
		
		// creating the size 
		
		/// creating the head and tail of the noe 
		
		// node<T> temp = null ; 
		
		
		node<T>currentnode = new node<>(ele);
		if (size == 0 ) {
			front = currentnode ; 
			rear = currentnode ; 
		}
		
		// chck print of the current node
		
		System.out.println(currentnode);
		
		rear.next = currentnode ; 
		rear = currentnode ; 
		size++ ; 
		
		
		
		
		// now creating the connection bwtween two node 
//		temp  = front ; 
//		
//		temp.next = rear ; 
//		temp = rear ; 
//		
	}
	
	// creating the front function 
	
	public T front(){
		return front.data ; 
	}
	
	// creating the new function 
	
	public T deque() throws blnakQueu {
		
		// creating the deque function 
		
		if (size == 0 ) {
			
	      // return the exception 
			throw new blnakQueu();
		}
		
		// creating the  store in themp 
		 T temp = front.data ; 
		 // now front become changed
		 front = front.next ; 
		 // now retun the function 
		 return temp ; 
		
		
		
	}
	
	
	
	
	
	
	
}
